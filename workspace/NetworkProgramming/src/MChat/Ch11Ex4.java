package MChat;

public class Ch11Ex4 extends Thread {
	public void run() {
		System.out.println("4�����忡�� ���!!");
	}
	
	public static void main(String[] args) {
		Ch11Ex4 app = new Ch11Ex4();
		app.start();
		System.out.println("���α׷� ����!!");
	}
}
