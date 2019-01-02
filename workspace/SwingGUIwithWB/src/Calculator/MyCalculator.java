/*
 * Java Swing GUI Program, Practical Example
 * Lee, SeongJong 2018-11-29
 */
package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator {

	private JFrame frmMycalculator;
	private JTextField textDisplay;
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator window = new MyCalculator();
					window.frmMycalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalculator = new JFrame();
		frmMycalculator.setTitle("MyCalculator");
		frmMycalculator.setBounds(100, 100, 300, 460);
		frmMycalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalculator.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textDisplay.setBounds(15, 10, 255, 50);
		frmMycalculator.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		// Row 1
		JButton btnBackSpace = new JButton("BS");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textDisplay.getText().length() > 0){
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					backspace = strB.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackSpace.setBounds(15, 80, 60, 60);
		frmMycalculator.getContentPane().add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(80, 80, 60, 60);
		frmMycalculator.getContentPane().add(btnClear);
		
		JButton btnRemainder = new JButton("%");
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
			}
		});
		btnRemainder.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRemainder.setBounds(145, 80, 60, 60);
		frmMycalculator.getContentPane().add(btnRemainder);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(210, 80, 60, 60);
		frmMycalculator.getContentPane().add(btnPlus);
		
		// Row 2
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(15, 145, 60, 60);
		frmMycalculator.getContentPane().add(btn7);
			
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(80, 145, 60, 60);
		frmMycalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(145, 145, 60, 60);
		frmMycalculator.getContentPane().add(btn9);
				
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(210, 145, 60, 60);
		frmMycalculator.getContentPane().add(btnMinus);
		
		// Row 3
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(15, 210, 60, 60);
		frmMycalculator.getContentPane().add(btn4);
			
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(80, 210, 60, 60);
		frmMycalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(145, 210, 60, 60);
		frmMycalculator.getContentPane().add(btn6);
				
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiply.setBounds(210, 210, 60, 60);
		frmMycalculator.getContentPane().add(btnMultiply);		
		
		// Row 4
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(15, 275, 60, 60);
		frmMycalculator.getContentPane().add(btn1);
			
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(80, 275, 60, 60);
		frmMycalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(145, 275, 60, 60);
		frmMycalculator.getContentPane().add(btn3);
				
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(210, 275, 60, 60);
		frmMycalculator.getContentPane().add(btnDivide);
		
		// Row 5
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(15, 340, 60, 60);
		frmMycalculator.getContentPane().add(btn0);
			
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(80, 340, 60, 60);
		frmMycalculator.getContentPane().add(btnDot);
		
		JButton btnConvert = new JButton("\u00B1");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConvert.setBounds(145, 340, 60, 60);
		frmMycalculator.getContentPane().add(btnConvert);
				
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textDisplay.getText());
				if(operations == "+")
				{
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}	
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(210, 340, 60, 60);
		frmMycalculator.getContentPane().add(btnEqual);
	}
}
