package StudentScoringSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentScoringSystem {

	private JFrame frame;
	private JTextField textFieldStudentID;
	private JTextField textFieldName;
	private JTextField textFieldKorean;
	private JTextField textFieldEnglish;
	private JTextField textFieldMath;
	private JTextField textFieldPhysics;
	private JTextField textFieldBusiness;
	private JTextField textFieldComputing;
	private JTextField textFieldBiology;
	private JTextField textFieldChemistry;
	private JTextField textFieldTotal;
	private JTextField textFieldAverage;
	private JTextField textFieldGrade;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentScoringSystem window = new StudentScoringSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentScoringSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("StudentScoringSystem");
		frame.setBounds(0, 0, 1440, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelRecording = new JPanel();
		panelRecording.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Score.Recording.System", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelRecording.setBounds(12, 10, 799, 447);
		frame.getContentPane().add(panelRecording);
		panelRecording.setLayout(null);
		
		JLabel lblStudentid = new JLabel("StudentID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudentid.setBounds(22, 32, 130, 32);
		panelRecording.add(lblStudentid);
		
		textFieldStudentID = new JTextField();
		textFieldStudentID.setBounds(194, 32, 157, 32);
		panelRecording.add(textFieldStudentID);
		textFieldStudentID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblName.setBounds(22, 86, 130, 32);
		panelRecording.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(194, 86, 157, 32);
		panelRecording.add(textFieldName);
		
		JLabel lblDepart = new JLabel("Department");
		lblDepart.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDepart.setBounds(22, 135, 162, 38);
		panelRecording.add(lblDepart);
		
		JComboBox comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"CC1101", "CC1102", "CC1103", "CC1104"}));
		comboBoxDepartment.setBounds(194, 137, 157, 32);
		panelRecording.add(comboBoxDepartment);
		
		JLabel lblKorean = new JLabel("Korean");
		lblKorean.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblKorean.setBounds(402, 32, 130, 32);
		panelRecording.add(lblKorean);
		
		textFieldKorean = new JTextField();
		textFieldKorean.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldKorean.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldKorean.setColumns(10);
		textFieldKorean.setBounds(574, 32, 157, 32);
		panelRecording.add(textFieldKorean);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnglish.setBounds(402, 86, 130, 32);
		panelRecording.add(lblEnglish);
		
		textFieldEnglish = new JTextField();
		textFieldEnglish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldEnglish.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldEnglish.setColumns(10);
		textFieldEnglish.setBounds(574, 86, 157, 32);
		panelRecording.add(textFieldEnglish);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMath.setBounds(402, 135, 130, 32);
		panelRecording.add(lblMath);
		
		textFieldMath = new JTextField();
		textFieldMath.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldMath.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldMath.setColumns(10);
		textFieldMath.setBounds(574, 135, 157, 32);
		panelRecording.add(textFieldMath);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPhysics.setBounds(402, 182, 130, 32);
		panelRecording.add(lblPhysics);
		
		textFieldPhysics = new JTextField();
		textFieldPhysics.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldPhysics.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPhysics.setColumns(10);
		textFieldPhysics.setBounds(574, 182, 157, 32);
		panelRecording.add(textFieldPhysics);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBusiness.setBounds(402, 381, 130, 32);
		panelRecording.add(lblBusiness);
		
		textFieldBusiness = new JTextField();
		textFieldBusiness.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldBusiness.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldBusiness.setColumns(10);
		textFieldBusiness.setBounds(574, 381, 157, 32);
		panelRecording.add(textFieldBusiness);
		
		textFieldComputing = new JTextField();
		textFieldComputing.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldComputing.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldComputing.setColumns(10);
		textFieldComputing.setBounds(574, 334, 157, 32);
		panelRecording.add(textFieldComputing);
		
		JLabel lblComputing = new JLabel("Computing");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblComputing.setBounds(402, 334, 140, 32);
		panelRecording.add(lblComputing);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBiology.setBounds(402, 285, 130, 32);
		panelRecording.add(lblBiology);
		
		textFieldBiology = new JTextField();
		textFieldBiology.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldBiology.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldBiology.setColumns(10);
		textFieldBiology.setBounds(574, 285, 157, 32);
		panelRecording.add(textFieldBiology);
		
		textFieldChemistry = new JTextField();
		textFieldChemistry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) { // 키보드 입력에 대한 이벤트추가 그리고 타입으로설정(여러글자 다양한수를위해서) 
				char iNumber = evt.getKeyChar();
				//Disgit은 숫자만의미 /캐릭터로 입력받은 iNumber가 숫자가 아니면~
				if(!(Character.isDigit(iNumber)) 
					||(iNumber == KeyEvent.VK_BACK_SPACE)
					||(iNumber == KeyEvent.VK_DELETE)){
					evt.consume(); //consume = 소비하다,없애다 여기서는 그냥 넘겨버리겠다라는의미(입력을못하게됨)
				}
			}
		});
		textFieldChemistry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldChemistry.setColumns(10);
		textFieldChemistry.setBounds(574, 231, 157, 32);
		panelRecording.add(textFieldChemistry);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChemistry.setBounds(402, 231, 130, 32);
		panelRecording.add(lblChemistry);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(22, 285, 130, 32);
		panelRecording.add(lblTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(194, 285, 157, 32);
		panelRecording.add(textFieldTotal);
		
		textFieldAverage = new JTextField();
		textFieldAverage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldAverage.setColumns(10);
		textFieldAverage.setBounds(194, 334, 157, 32);
		panelRecording.add(textFieldAverage);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAverage.setBounds(22, 334, 140, 32);
		panelRecording.add(lblAverage);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGrade.setBounds(22, 381, 130, 32);
		panelRecording.add(lblGrade);
		
		textFieldGrade = new JTextField();
		textFieldGrade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldGrade.setColumns(10);
		textFieldGrade.setBounds(194, 381, 157, 32);
		panelRecording.add(textFieldGrade);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBounds(22, 210, 327, 4);
		panelRecording.add(separator);
		
		JPanel panelTranscript = new JPanel();
		panelTranscript.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Score.Transcript.System", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelTranscript.setBounds(823, 10, 589, 447);
		frame.getContentPane().add(panelTranscript);
		panelTranscript.setLayout(null);
		
		JTextArea textAreaTranscript = new JTextArea();
		textAreaTranscript.setBounds(12, 22, 565, 415);
		panelTranscript.add(textAreaTranscript);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 467, 1400, 232);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"StudentID", "Name", "Dept", "Korean", "English", "Math", "Physics", "Chemistry", "Biology", "Computing", "Business", "Total", "Average", "Grade"
			}
		));
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Add Results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========================================
				double[] R = new double [10]; // 실수형으로 처리하기위함 평균을구할땐 실수가 편하기떄문에
				R[0] = Double.parseDouble(textFieldKorean.getText());
				R[1] = Double.parseDouble(textFieldEnglish.getText());
				R[2] = Double.parseDouble(textFieldMath.getText());
				R[3] = Double.parseDouble(textFieldPhysics.getText());
				R[4] = Double.parseDouble(textFieldChemistry.getText());
				R[5] = Double.parseDouble(textFieldBiology.getText());
				R[6] = Double.parseDouble(textFieldComputing.getText());
				R[7] = Double.parseDouble(textFieldBusiness.getText());
				R[8] = R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7];
				R[9] = R[8] / 8;
				
				String Total = String.format("%.0f",R[8]);
				textFieldTotal.setText(Total);
				String Average= String.format("%.2f",R[9]);
				textFieldAverage.setText(Average);
				
				if(R[9] >= 90){
					String Grade = "A";
					textFieldGrade.setText(Grade);
				}else if(R[9] >= 80){
					String Grade = "B";
					textFieldGrade.setText(Grade);
				}else if(R[9] >= 70){
					String Grade = "C";
					textFieldGrade.setText(Grade);
				}else if(R[9] >= 60){
					String Grade = "D";
					textFieldGrade.setText(Grade);
				}else{
					String Grade = "F";
					textFieldGrade.setText(Grade);
				}
				//------------- 총점, 평균, 등급 처리 완------------------
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[]{
						textFieldStudentID.getText(),
						textFieldName.getText(),
						comboBoxDepartment.getSelectedItem(),
						textFieldKorean.getText(),
						textFieldEnglish.getText(),
						textFieldMath.getText(),
						textFieldPhysics.getText(),
						textFieldChemistry.getText(),
						textFieldBiology.getText(),
						textFieldComputing.getText(),
						textFieldBusiness.getText(),
						textFieldTotal.getText(),
						textFieldAverage.getText(),
						textFieldGrade.getText(),
						
				});//end of addRow
				
				//==========================================
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(252, 751, 183, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========================================
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow() == -1){//선택된 행이 없을 때 값은 -1
					if(table.getRowCount() == 0){// 행이 아애 없을때 getRowCount (가져온다행의갯수를)
					JOptionPane.showMessageDialog(null, "삭제할 데이터가 없습니다.", "Scoring Systm", JOptionPane.OK_OPTION);
					}
					else{
						JOptionPane.showMessageDialog(null, "삭제할 행을 선택하세요.", "Scoring Systm", JOptionPane.OK_OPTION);
					}
				}//end of 선택된 행이 없을 때
				else{ // 행을 선택했을때
					model.removeRow(table.getSelectedRow());
				}//end of 행을 선택했을때
				//==========================================
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDelete.setBounds(444, 751, 183, 37);
		frame.getContentPane().add(btnDelete);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//==========================================
				textAreaTranscript.setText(null);
				textAreaTranscript.append("\t\tStudent Scoring Recording System"
						+ "\n======================================"
						+ "\nStudent ID : \t\t" + textFieldStudentID.getText()
						+ "\nName : \t\t" + textFieldName.getText()
						+ "\nDepartment : \t\t" + comboBoxDepartment.getSelectedItem() //.toString() 안해줘도됨
						+ "\n======================================"
						+ "\nKorean : \t\t" + textFieldKorean.getText()
						+ "\nEnglish: \t\t" + textFieldEnglish.getText()
						+ "\nMath : \t\t" + textFieldMath.getText()
						+ "\nPhysics : \t\t" + textFieldPhysics.getText()
						+ "\nChemistry : \t\t" + textFieldChemistry.getText()
						+ "\nBiology : \t\t" + textFieldBiology.getText()
						+ "\nComputing : \t\t" + textFieldComputing.getText()
						+ "\nBusiness : \t\t" + textFieldBusiness.getText()
						+ "\n======================================"
						+ "\nTotal : \t\t" + textFieldTotal.getText()
						+ "\nAverage : \t\t" + textFieldAverage.getText()
						+ "\nGrade : \t\t" + textFieldGrade.getText()
						+ "\n======================================"
						+ "\n\t\t Green Computer Academy, JJANG"
						);//end of append()
				
			//==========================================
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTranscript.setBounds(639, 751, 183, 37);
		frame.getContentPane().add(btnTranscript);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========================================
				JTextField temp = null; // Recording Panel 의 textfield 초기화용
				JTextArea temp2 = null; // Transcript Panel 의 textarea 초기화용
				for(java.awt.Component c:panelRecording.getComponents()){
					if(c.getClass().toString().contains("javax.swing.JTextField")){
						// 따로 temp를 (JTextField)c 로 증명해주는이유는 (JTextField)c 안에는 setText메소드가없기때문
						temp = (JTextField)c;
						temp.setText(null);
					}//end of if
				//==========================================
				}//end of for ~ recording panel 초기화
				for(java.awt.Component c:panelTranscript.getComponents()){
					if(c.getClass().toString().contains("javax.swing.JTextArea")){
						temp2 = (JTextArea)c;
						temp2.setText(null);
					}// end of if
				//==========================================
				}// end of for
			}// end of actionPerformed()
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(840, 751, 183, 37);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(1035, 751, 183, 37);
		frame.getContentPane().add(btnExit);
	}
}
