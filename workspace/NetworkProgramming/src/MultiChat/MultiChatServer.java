package MultiChat;

import java.io.*;
import java.net.*;
import java.util.*;
import com.google.gson.*;
import java.util.logging.*;

public class MultiChatServer {

	// ���� ���� �� Ŭ���̾�Ʈ ���� ���� 
	private ServerSocket  ss= null;
	private Socket s= null;
	
	// ����� Ŭ���̾�Ʈ �����带 �����ϱ� ���� ArrayList
	ArrayList<ChatThread> chatThreads = new ArrayList<ChatThread>();

    // �ΰ� ��ü
    Logger logger;
		
	// ��Ƽê ���� ���α׷� ��
	public void start() {
        logger = Logger.getLogger(this.getClass().getName());

		try {
			// ���� ���� ����
			ss = new ServerSocket(8888);
			logger.info("MultiChatServer start");
			
			// ���� ������ ���鼭 Ŭ���̾�Ʈ ������ ��ٸ�
			while(true) {
				s=ss.accept();				
				// ����� Ŭ���̾�Ʈ�� ���� ������ Ŭ���� ����
				ChatThread chat = new ChatThread();
				// Ŭ���̾�Ʈ ����Ʈ �߰�
				chatThreads.add(chat);
				// ������ ����
				chat.start();
			}
		} catch (Exception e) {
			logger.info("[MultiChatServer]start() Exception �߻�!!");
            e.printStackTrace();
		}   
	} 

	// ����� ��� Ŭ���̾�Ʈ�� �޽��� �߰�
	void msgSendAll(String msg) {
		for(ChatThread ct : chatThreads) {
			ct.outMsg.println(msg);
		}
	}

	// ������ Ŭ���̾�Ʈ ������ ���� ������ Ŭ����
	class ChatThread extends Thread {
		// ���� �޽��� �� �Ľ� �޽��� ó���� ���� ���� ����
		String msg;

        // �޽��� ��ü ����
		Message m = new Message();

        // Json Parser �ʱ�ȭ
		Gson gson = new Gson();
		//Sample Message {"id":"user1","passwd":"1234","msg":"hahaha","type":"msg"};

		// ����� ��Ʈ��
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		public void run() {
		
			boolean status = true;
			logger.info("ChatThread start...");

			try {
				// ����� ��Ʈ�� ����
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(),true);
				
				// ���������� true �̸� ������ ���鼭 ����ڷ� ���� ���ŵ� �޽��� ó��
				while(status) {
					// ���ŵ� �޽����� msg ������ ����
					msg = inMsg.readLine();
					
					// JSON �޽����� Message ��ü�� ����
					m = gson.fromJson(msg,Message.class);
												
					// �Ľ̵� ���ڿ� �迭�� �ι�° ��� ���� ���� ó��
					// �α׾ƿ� �޽��� �� ���
					if(m.getType().equals("logout")) {
						chatThreads.remove(this);
						msgSendAll(gson.toJson(new Message(m.getId(),"","���� ���� �߽��ϴ�.","server")));
						// �ش� Ŭ���̾�Ʈ ������ ����� ���� status �� false �� ����
						status = false;
					}
					// �α��� �޽��� �� ���
					else if(m.getType().equals("login")) {
						msgSendAll(gson.toJson(new Message(m.getId(),"","���� �α��� �߽��ϴ�.","server")));
					}
					// �׹��� ��� �� �Ϲ� �޽����� ���
					else {
						msgSendAll(msg);
					}
				}
				// ������ ����� Ŭ���̾�Ʈ ���� ���� �̹Ƿ� ������ ���ͷ�Ʈ
				this.interrupt();
				logger.info(this.getName() + " �����!!");
			} catch (IOException e) {
				chatThreads.remove(this);
				logger.info("[ChatThread]run() IOException �߻�!!");
                e.printStackTrace();
			}
		}
	}

    public static void main(String[] args){
        MultiChatServer server = new MultiChatServer();
        server.start();
    }
}