package MultiChat;

import javax.swing.*;

public class MultiChatData {
    // ������ ���� ��ü
    JTextArea msgOut;

    /**
     * JComponent ��ü�� �Ķ���ͷ� �޾� ������ ��ȭ�� ���� ó��
     * ���� ������ ���� Ŭ�����θ� �Ǿ� ������ ����Ʈ�� �� ���·� ��� �� ����.
     * @param comp
     */
    public void addObj(JComponent comp) {
        this.msgOut = (JTextArea)comp;
    }

    /**
     * ������ ��ȭ�� �߻������� UI �� ������ ������ �ݿ��ϱ� ���� �޼���
     * @param msg
     */
    public void refreshData(String msg) {
        // JTextArea �� ���ŵ� �޽��� �߰�
        msgOut.append(msg);
    }
}
