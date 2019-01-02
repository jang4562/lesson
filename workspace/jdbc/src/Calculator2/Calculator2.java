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
	double firstNumber; // ���� ������ ��ư�� �������� ������ ���â���ִ°��� �����ϱ����� ���� ����Ÿ��double(�Ҽ�Ÿ��) ���ں���
	double secondNumber;// ���� ������ ��ư�� ������ ���� ������ ���â�� ������ �����ϱ����� ���� ����Ÿ��double(�Ҽ�Ÿ��) ���ں���
	double result; // ��������� ������ ���ں���
	String operations; // ���� �����ڵ��� �����ϱ����� ����  
	String answer; // ��¿� ���� ����� result ���� ���ڿ��� ��ȯ �����ϴ� ����(result�� �Ҽ��� �Ҽ����̶�)
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
					window.frmCalculatordemo.setVisible(true); // Ÿ��Ʋ �̸������ϸ� �ڵ����� �߰���
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
		frmCalculatordemo.setTitle("CalculatorDemo"); // Ÿ��Ʋ �̸����� 
		frmCalculatordemo.setBounds(100, 100, 290, 460); // ���������� 300x460 ����
		frmCalculatordemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatordemo.getContentPane().setLayout(null); // ���̾ƿ��� �����Ӱ� ����ִ� �ۼַ�Ʈ ���̾ƿ�
		
		textDisplay = new JTextField(); // �ؽ�Ʈ�ʵ� ������
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 20)); // �ؽ�Ʈ�ʵ忡���� �ؽ�Ʈ �Ӽ�����
		textDisplay.setBounds(15, 10, 255, 50); // ���̾ƿ������� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(textDisplay); // �����������ο� ���� �ؽ�Ʈ�ʵ带 �߰�
		textDisplay.setColumns(10);
		// ~~~~~~~~~~~~ ROW 1 ~~~~~~~~~~~~~ 1��
		JButton btnBackSpace = new JButton("BS"); // �齺���̽� ��ư ����
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null; // ���ΰ� �������(������ �ڸ����� ����)���ڿ�
				// ���� ���ڿ��� ���̰� 0���� Ŭ���� �ߵ��� if�� �ۼ�
				if(textDisplay.getText().length() > 0){
					// �������ִ� ��Ʈ��â�� ���� �������(�������ʿ�¾��� �ִٴ°��������ֱ����� �׷��� ���� ex) textDisplay.getText() ������ �־��ֱ� ����)
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					// ������ ���� ��Ʈ��â�� ��ġ�������������(deleteCharAt)���?(textDisplay.getText().length() - 1)�̰� ���ڸ� ���̷ιٲپ� ����
					// deleteCharAt��� �޼ҵ�� String�� ���� �׷��⶧���� StringBuilder�� ���ذ�
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					// strB�� StringBuilder�� �������ֱ⶧���� �ٽ� ���ڿ�(toString)���� �ٲ��ذ� backspace�� ����
					backspace = strB.toString();
					// ������ ���ڿ�(backspace)�� ���â(textDisplay)�� ���
					textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnBackSpace.setBounds(15, 80, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C"); // Ŭ���� ��ư ����
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clear �� ��� ���ڿ�(EnterNumber)�� ����ϴ°��� �ʱ�ȭ�����ָ�Ǳ⶧���� "";������
				// �����ϰԸ���¹������ textDisplay.setText(null �Ǵ� "");�� ����. 
				//String EnterNumber = "";
				//textDisplay.setText(EnterNumber);
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnClear.setBounds(80, 80, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnClear);		
		
		JButton btnRemainder = new JButton("%"); // ������(�����δ�) ��ư ����
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ ����� ������ firstNumber�� ����(���â�� ����� �ؽ�Ʈ�� �����ͼ�,parseDouble(����.�Ҽ��κ�ȯ�ϴ��Լ�) parseInt���ִ�)
				firstNumber = Double.parseDouble(textDisplay.getText());
				// �����ڸ� ������ firstNumber�� �����߱⋚���� ���â�� �ʱ�ȭ
				textDisplay.setText(null);
				// �������ߴٴ� ������ϱ����� ���ڿ��� % �� ����
				operations = "%";
			}
		});
		btnRemainder.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnRemainder.setBounds(145, 80, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnRemainder);
		
		JButton btnPlus = new JButton("+"); // �÷��� ��ư ����
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnPlus.setBounds(210, 80, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnPlus);
		// ~~~~~~~~~~~~ ROW 2 ~~~~~~~~~~~~~ 2��
		JButton btn7 = new JButton("7"); // ��ư7 ��ư ����
		// �׼Ǹ����� (�����ο��� �����ʸ��콺 �׼� ���λ���,�Ǵ� *����Ŭ��*���� ����
		btn7.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				// ���÷���â�� �̹� �Էµ� ���ڿ�(����)�� ��ư�� �ؽ����� ����
				// ���â(textDisplay)�� btn7(7��ư)��! �ؽ�Ʈ�� ������ ����
				// ������ ���ڿ�(���� ��ģ ���ڵ�)�� �ٽ� ���â(textDisplay)�� ���
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn7.setBounds(15, 145, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8"); // ��ư8 ��ư ����
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn8.setBounds(80, 145, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9"); // ��ư9 ��ư ����
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn9.setBounds(145, 145, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-"); // ���̳ʽ� ��ư ����
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnMinus.setBounds(210, 145, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnMinus);
		// ~~~~~~~~~~~~ ROW 3 ~~~~~~~~~~~~~ 3��
		JButton btn4 = new JButton("4"); // ��ư4 ��ư ����
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn4.setBounds(15, 210, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5"); // ��ư5 ��ư ����
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn5.setBounds(80, 210, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6"); // ��ư6 ��ư ����
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn6.setBounds(145, 210, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn6);
		
		JButton btnMutiply = new JButton("*"); // ���ϱ�(��Ƽ��) ��ư ����
		btnMutiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "*";
			}
		});
		btnMutiply.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnMutiply.setBounds(210, 210, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnMutiply);
		// ~~~~~~~~~~~~ ROW 4 ~~~~~~~~~~~~~ 4��
		JButton btn1 = new JButton("1"); // ��ư1 ��ư ����
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn1.setBounds(15, 275, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2"); // ��ư2 ��ư ����
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn2.setBounds(80, 275, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3"); // ��ư3 ��ư ����
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn3.setBounds(145, 275, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn3);
		
		JButton btndivide = new JButton("/"); // ������ ��ư ����
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText(null);
				operations = "/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btndivide.setBounds(210, 275, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btndivide);
		// ~~~~~~~~~~~~ ROW 5 ~~~~~~~~~~~~~ 5��
		JButton btn0 = new JButton("0"); // ��ư0 ��ư ����
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btn0.setBounds(15, 340, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btn0);
		
		JButton btnDot = new JButton("."); // �Ҽ��� ��ư ����
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnDot.setBounds(80, 340, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnDot);
		
		JButton btnConvert = new JButton("\u00B1"); // ������(-1*) ��ư ����
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
			//ops = -ops; �̰��� �ᵵ��
			ops = ops * (-1);
			// toString�� �ᵵ�ȴ�
			textDisplay.setText(String.valueOf(ops));
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnConvert.setBounds(145, 340, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnConvert);
		
		JButton btnEqual = new JButton("="); // ������(=) ��ư ����
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String answer; �̹� ���������� �־�Z�⶧���� ���������δ� �ȳ־��൵�ȴ�
				secondNumber = Double.parseDouble(textDisplay.getText());
				// �� �����ڹ�ư�� �־�Z��Z�� operations���� ���� if���Ǵ� ����ġ �� ������� ��갪�� �����ټ��ִ�
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
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18)); // ��ư�� �Ӽ� ����
		btnEqual.setBounds(210, 340, 60, 60); // ���̾ƿ��� ���� ��ġ �� ũ������
		frmCalculatordemo.getContentPane().add(btnEqual);
		
	}
}
