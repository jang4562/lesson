package MultiChat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultiChatUI extends JFrame{

    // �α��� �г�
    private JPanel loginPanel;
    // �α��� ��ư
    protected JButton loginButton;

    // ��ȭ�� ��
    private JLabel inLabel;
    // ��ȭ�� ��� ��
    protected JLabel outLabel;
    // ��ȭ�� �Է� �ؽ�Ʈ�ʵ�
    protected JTextField idInput;

    // �α׾ƿ� �г�
    private JPanel logoutPanel;
    // �α׾ƿ� ��ư
    protected JButton logoutButton;

    // �޽��� �Է�  �г� ����
    private JPanel msgPanel;
    // �޽��� �Է� �ؽ�Ʈ�ʵ�
    protected JTextField msgInput;
    // ���� ��ư
    protected JButton exitButton;

    // ä�� ���� ���â
    protected JTextArea msgOut;

    // ȭ�� ���� ��ȯ�� ���� ī�巹�̾ƿ�
    protected Container tab;
    protected CardLayout cardLayout;

    // �α��� ���̵� ���� �ʵ�
    protected String id;

    // ������
    public MultiChatUI() {

        // ���� ������ ����
        super("::��Ƽê::");

        // �α��� �г� ȭ�� ����
        loginPanel = new JPanel();

        // �α��� �г� ���̾ƿ� ����
        loginPanel.setLayout(new BorderLayout());

        // �α��� �Է��ʵ�/��ư ����
        idInput = new JTextField(15);
        loginButton = new JButton("�α���");

        // �α��� �гο� ���� ����
        inLabel = new JLabel("��ȭ�� ");
        loginPanel.add(inLabel, BorderLayout.WEST);
        loginPanel.add(idInput, BorderLayout.CENTER);
        loginPanel.add(loginButton, BorderLayout.EAST);

        // �α׾ƿ� �г� ����
        logoutPanel = new JPanel();

        // �α׾ƿ� �г� ���̾ƿ� ����
        logoutPanel.setLayout(new BorderLayout());
        outLabel = new JLabel();
        logoutButton = new JButton("�α׾ƿ�");

        // �α׾ƿ� �гο� ���� ����
        logoutPanel.add(outLabel, BorderLayout.CENTER);
        logoutPanel.add(logoutButton, BorderLayout.EAST);

        // �޽��� �Է� �г� ����
        msgPanel = new JPanel();
        // ���̾ƿ� ����
        msgPanel.setLayout(new BorderLayout());
        msgInput = new JTextField(30);

        // �޽��� �Է� �гο� ���� ����
        exitButton = new JButton("����");
        msgPanel.add(msgInput, BorderLayout.CENTER);
        msgPanel.add(exitButton, BorderLayout.EAST);

        // �α���/�α׾ƿ� �г� ������ ���� CardLayout �г�
        tab = new JPanel();
        cardLayout = new CardLayout();
        tab.setLayout(cardLayout);
        tab.add(loginPanel, "login");
        tab.add(logoutPanel, "logout");

        // �޽��� ��� ���� �ʱ�ȭ
        msgOut = new JTextArea("", 10, 30);
        // JTextArea �� ������ �������� ���ϵ��� ��. �� ����������� ���
        msgOut.setEditable(false);

        // �޽��� ��� ���� ��ũ�ѹ� ����, ���� ��ũ�ѹٴ� �׻� ��Ÿ���� ���� ��ũ�ѹٴ� �ʿ�� ��Ÿ������ ��.
        JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // ���� �����ӿ� �г� ��ġ
        add(tab, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        add(msgPanel, BorderLayout.SOUTH);

        // loginPanel �� �켱 ���̵��� ��.
        cardLayout.show(tab, "login");

        // ������ ũ�� �ڵ����� ����
        pack();

        // ������ ũ�� ���� �Ұ� ����
        setResizable(false);

        // �������� ���������� ��
        setVisible(true);
    }

    /**
     * �̺�Ʈ ������ ����� ���� �޼���� �Ķ������ ������ ��ü�� ��Ʈ�ѷ����� ������ ��ü�� ��.
     * ���� ���� �̺�Ʈ ó���� ��Ʈ�ѷ� Ŭ���� �ڵ带 ����.
     * @param listener
     */
    public void addButtonActionListener(ActionListener listener) {
        // �̺�Ʈ ������ ���
        loginButton.addActionListener(listener);
        logoutButton.addActionListener(listener);
        exitButton.addActionListener(listener);
        msgInput.addActionListener(listener);
    }
}
