package MChat;
// Runnable�� ���� 
public class Ch11Ex5 implements Runnable {

	@Override
	public void run() {
		System.out.println("5�����忡�� ���!!");
	}

	public static void main(String[] args) {
//		�� ���⼭ Ex4 �� �����ͼ� ������ Ch11Ex5�� �ٲ㼭 ������ start�� ������������
		Ch11Ex4 app = new Ch11Ex4();
		app.start();
		System.out.println("���α׷� ����!!");
	}
}
