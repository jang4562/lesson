package MChat;

public class Ch11Ex6 extends Thread{
//	ref??
	static int ref;
	
	public void run() {
		String tname = Thread.currentThread().getName();
		
		System.out.println(tname+" ����");
		for(int i=0;i<10;i++) {
			System.out.println(tname+"-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tname+" ����");
	}
	
	public static void main(String[] args) {
		Ch11Ex6 app = new Ch11Ex6();
//		���⼭ for���� ����Ȱǵ� �������̸��ڿ� i�� �Ǻٴ°���
		for(int i=0;i<5;i++) {
			Thread t = new Thread(app);
			t.start();
		}
		System.out.println("main ����!!");
	}
}
