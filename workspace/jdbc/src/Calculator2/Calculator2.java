package Calculator2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class Calculator2 {

	private JFrame frmCalculatordemo;
	private JTextField textDisplay;
	double firstNumber; // 각종 연산자 버튼을 눌렀을때 기존에 출력창에있는값을 저장하기위해 만든 숫자타입double(소수타입) 숫자변수
	double secondNumber;// 각종 연산자 버튼을 누른후 새로 나오는 출력창에 값들을 저장하기위해 만든 숫자타입double(소수타입) 숫자변수
	double result; // 결과물들을 저장할 숫자변수
	String operations; // 각종 연산자들을 구분하기위한 변수  
	String answer; // 출력용 연산 결과인 result 값을 문자열로 변환 저장하는 변수(result가 소숫점 소수열이라서)
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
					window.frmCalculatordemo.setVisible(true); // 타이틀 이름조정하면 자동으로 추가됨
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatordemo = new JFrame();
		frmCalculatordemo.setResizable(false);
		frmCalculatordemo.setTitle("CalculatorDemo"); // 타이틀 이름조정 
		frmCalculatordemo.setBounds(100, 100, 290, 460); // 사이즈조정 300x460 으로
		frmCalculatordemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatordemo.getContentPane().setLayout(null); // 레이아웃을 자유롭게 잡아주는 앱솔루트 레이아웃
		
		textDisplay = new JTextField(); // 텍스트필드 생성자
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 20)); // 텍스트필드에대한 텍스트 속성지정
		textDisplay.setBounds(15, 10, 255, 50); // 레이아웃에대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(textDisplay); // 겟콘텐츠페인에 현재 텍스트필드를 추가
		textDisplay.setColumns(10);
		// ~~~~~~~~~~~~ ROW 1 ~~~~~~~~~~~~~ 1행
		JButton btnBackSpace = new JButton("BS"); // 백스페이스 버튼 생성
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null; // 새로게 만들어질(마지막 자리수를 지운)문자열
				// 지울 문자열의 길이가 0보다 클때만 발동할 if문 작성
				if(textDisplay.getText().length() > 0){
					// 기존에있는 스트링창을 새로 만들어줌(꼭만들필요는없고 있다는것을보여주기위함 그러나 편함 ex) textDisplay.getText() 일일이 넣어주긴 불편)
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					// 위에서 만든 스트링창에 위치를지정해지운다(deleteCharAt)어디를?(textDisplay.getText().length() - 1)이건 문자를 길이로바꾸어 지움
					// deleteCharAt라는 메소드는 String에 없다 그렇기때문에 StringBuilder를 써준것
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					// strB가 StringBuilder로 지정되있기때문에 다시 문자열(toString)으로 바꿔준걸 backspace에 저장
					backspace = strB.toString();
					// 저장한 문자열(backspace)를 계산창(textDisplay)에 출력
					textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnBackSpace.setBounds(15, 80, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C"); // 클리어 버튼 생성
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clear 의 경우 문자열(EnterNumber)를 출력하는경우라 초기화시켜주면되기때문에 "";있지만
				// 간편하게만드는방법으로 textDisplay.setText(null 또는 "");을 쓴다. 
				//String EnterNumber = "";
				//textDisplay.setText(EnterNumber);
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnClear.setBounds(80, 80, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnClear);		
		
		JButton btnRemainder = new JButton("%"); // 나누기(리마인더) 버튼 생성
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 클래스를 만들며 지정한 firstNumber에 저장(계산창에 저장된 텍스트를 가져와서,parseDouble(숫자.소수로변환하는함수) parseInt도있다)
				firstNumber = Double.parseDouble(textDisplay.getText());
				// 연산자를 누르고 firstNumber를 저장했기떄문에 계산창을 초기화
				textDisplay.setText(null);
				// 나누기했다는 계산을하기위해 문자열에 % 을 저장
				operations = "%";
			}
		});
		btnRemainder.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnRemainder.setBounds(145, 80, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnRemainder);
		
		JButton btnPlus = new JButton("+"); // 플러스 버튼 생성
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnPlus.setBounds(210, 80, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnPlus);
		// ~~~~~~~~~~~~ ROW 2 ~~~~~~~~~~~~~ 2행
		JButton btn7 = new JButton("7"); // 버튼7 버튼 생성
		// 액션리스너 (디자인에서 오른쪽마우스 액션 으로생성,또는 *더블클릭*으로 생성
		btn7.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				// 디스플레이창에 이미 입력된 문자열(숫자)과 버튼의 텍스르를 결합
				// 계산창(textDisplay)에 btn7(7버튼)의! 텍스트를 가져와 결합
				// 가져온 문자열(위에 합친 문자들)을 다시 계산창(textDisplay)에 출력
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn7.setBounds(15, 145, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8"); // 버튼8 버튼 생성
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn8.setBounds(80, 145, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9"); // 버튼9 버튼 생성
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn9.setBounds(145, 145, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-"); // 마이너스 버튼 생성
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnMinus.setBounds(210, 145, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnMinus);
		// ~~~~~~~~~~~~ ROW 3 ~~~~~~~~~~~~~ 3행
		JButton btn4 = new JButton("4"); // 버튼4 버튼 생성
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn4.setBounds(15, 210, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5"); // 버튼5 버튼 생성
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn5.setBounds(80, 210, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6"); // 버튼6 버튼 생성
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn6.setBounds(145, 210, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn6);
		
		JButton btnMutiply = new JButton("*"); // 곱하기(멀티플) 버튼 생성
		btnMutiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "*";
			}
		});
		btnMutiply.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnMutiply.setBounds(210, 210, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnMutiply);
		// ~~~~~~~~~~~~ ROW 4 ~~~~~~~~~~~~~ 4행
		JButton btn1 = new JButton("1"); // 버튼1 버튼 생성
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn1.setBounds(15, 275, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2"); // 버튼2 버튼 생성
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn2.setBounds(80, 275, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3"); // 버튼3 버튼 생성
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn3.setBounds(145, 275, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn3);
		
		JButton btndivide = new JButton("/"); // 나누기 버튼 생성
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btndivide.setBounds(210, 275, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btndivide);
		// ~~~~~~~~~~~~ ROW 5 ~~~~~~~~~~~~~ 5행
		JButton btn0 = new JButton("0"); // 버튼0 버튼 생성
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btn0.setBounds(15, 340, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btn0);
		
		JButton btnDot = new JButton("."); // 소수점 버튼 생성
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnDot.setBounds(80, 340, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnDot);
		
		JButton btnConvert = new JButton("\u00B1"); // 뒤집기(-1*) 버튼 생성
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
			//ops = -ops; 이것을 써도됨
			ops = ops * (-1);
			// toString을 써도된다
			textDisplay.setText(String.valueOf(ops));
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnConvert.setBounds(145, 340, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnConvert);
		
		JButton btnEqual = new JButton("="); // 결과출력(=) 버튼 생성
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String answer; 이미 전역변수를 넣어줫기때문에 지역변수로는 안넣어줘도된다
				secondNumber = Double.parseDouble(textDisplay.getText());
				// 값 연산자버튼에 넣어줫어줫던 operations들을 토대로 if문또는 스위치 문 을만들어 계산값을 정해줄수있다
				if(operations == "+"){
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}// end of if("+")
				else if(operations == "-"){
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}// end of if("-")
				else if(operations == "*"){
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}// end of if("*")
				else if(operations == "/"){
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}// end of if("/")
				else if(operations == "%"){
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}// end of if("+")%
			};// end of actionPerFormde()
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18)); // 버튼에 속성 지정
		btnEqual.setBounds(210, 340, 60, 60); // 레이아웃에 대한 위치 및 크기조정
		frmCalculatordemo.getContentPane().add(btnEqual);
		
	}
}
