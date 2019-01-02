package MChat;
// Runnable의 차이 
public class Ch11Ex5 implements Runnable {

	@Override
	public void run() {
		System.out.println("5스레드에서 출력!!");
	}

	public static void main(String[] args) {
//		왜 여기서 Ex4 를 가져와서 돌리고 Ch11Ex5로 바꿔서 돌리면 start가 오류가나는지
		Ch11Ex4 app = new Ch11Ex4();
		app.start();
		System.out.println("프로그램 종료!!");
	}
}
