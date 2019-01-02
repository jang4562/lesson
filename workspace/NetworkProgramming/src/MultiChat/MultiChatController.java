package MultiChat;


import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.*;
import com.google.gson.*;
import static java.util.logging.Level.*;

public class MultiChatController implements Runnable{

    // �� Ŭ���� ���� ��ü
    private final MultiChatUI v;

    // ������ Ŭ���� ���� ��ü
    private final MultiChatData chatData;

    // ���� ������ ���� ���� ����
    private String ip = "118.46.60.167";
    private Socket socket;
    private BufferedReader inMsg = null;
    private PrintWriter outMsg = null;

    // �޽��� �Ľ��� ���� ��ü ����
    Gson gson = new Gson();
    Message m;

    // ���� �÷���
    boolean status;

    // �ΰ� ��ü
    Logger logger;

    // �޽��� ���� ������
    Thread thread;

    /**
     * �𵨰� �� ��ü�� �Ķ���ͷ� �ϴ� ������
     * @param chatData
     * @param v
     */
    public MultiChatController(MultiChatData chatData, MultiChatUI v) {
        // �ΰ� ��ü �ʱ�ȭ
        logger = Logger.getLogger(this.getClass().getName());

        // �𵨰� �� Ŭ���� ����
        this.chatData = chatData;
        this.v = v;
    }

    /**
     * ���ø����̼� ���� ���� �޼���
     */
    public void appMain() {
        // ������ ��ü���� ������ ��ȭ�� ó���� UI ��ü �߰�
        chatData.addObj(v.msgOut);

        v.addButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = e.getSource();

                // �����ư ó��
                if (obj == v.exitButton) {
                    System.exit(0);
                } else if (obj == v.loginButton) {
                    v.id = v.idInput.getText();
                    v.outLabel.setText(" ��ȭ�� : " + v.id);
                    v.cardLayout.show(v.tab, "logout");
                    connectServer();
                } else if (obj == v.logoutButton) {
                    // �α׾ƿ� �޽��� ����
                    outMsg.println(gson.toJson(new Message(v.id, "", "", "logout")));
                    // ��ȭâ Ŭ����
                    v.msgOut.setText("");
                    // �α��� �гη� ��ȯ
                    v.cardLayout.show(v.tab, "login");
                    outMsg.close();
                    try {
                        inMsg.close();
                        socket.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    status = false;
                } else if (obj == v.msgInput) {
                    // �޽��� ����
                    outMsg.println(gson.toJson(new Message(v.id, "", v.msgInput.getText(), "msg")));
                    // �Է�â Ŭ����
                    v.msgInput.setText("");
                }
            }
        });
    }

    /**
     * ���� ������ ���� �޼���
     */
    public void connectServer() {
        try {
            // ���� ����
            socket = new Socket(ip,8888);
            logger.log(INFO,"[Client]Server ���� ����!!");

            // ����� ��Ʈ�� ����
            inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outMsg = new PrintWriter(socket.getOutputStream(),true);

            // ������ �α��� �޽��� ����
            m = new Message(v.id,"","","login");
            outMsg.println(gson.toJson(m));

            // �޽��� ������ ���� ������ ����
            thread = new Thread(this);
            thread.start();
        }
        catch(Exception e) {
            logger.log(WARNING, "[MultiChatUI]connectServer() Exception �߻�!!");
            e.printStackTrace();
        }
    }

    /**
     * �޽��� ������ ���������� ó���ϱ� ���� ������ ����
     */
    public void run() {
        // ���� �޽��� ó���� ���� ����
        String msg;

        status=true;

        while(status) {
            try{
                // �޽��� ���� �� �Ľ�
                msg = inMsg.readLine();
                m = gson.fromJson(msg, Message.class);

                // MultiChatData ��ü�� ���� ������ ����
                chatData.refreshData(m.getId() + ">" + m.getMsg() + "\n");

                // Ŀ���� ���� ��ȭ �޽����� ������
                v.msgOut.setCaretPosition(v.msgOut.getDocument().getLength());
            }
            catch(IOException e) {
                logger.log(WARNING,"[MultiChatUI]�޽��� ��Ʈ�� ����!!");
            }
        }
        logger.info("[MultiChatUI]" + thread.getName()+ " �޽��� ���� ������ �����!!");
    }


    // ���α׷� ������ ���� ���� �޼���
    public static void main(String[] args) {
        MultiChatController app = new MultiChatController(new MultiChatData(),new MultiChatUI());
        app.appMain();
    }
}
