/* 
 * Swing-GUI Examples with Windows Builder
 * Green Computer Academy, Cheongju
 * 2018-12-07 
 * Lee, SeongJong
 */
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
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class StudentScoringSystem_example {

	private JFrame frame;
	private JTextField textFieldStudentID;
	private JTextField textFieldKorean;
	private JTextField textFieldName;
	private JTextField textFieldEnglish;
	private JTextField textFieldMath;
	private JTextField textFieldPhysics;
	private JTextField textFieldChemistry;
	private JTextField textFieldBiology;
	private JTextField textFieldComputing;
	private JTextField textFieldBusiness;
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
					StudentScoringSystem_example window = new StudentScoringSystem_example();
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
	public StudentScoringSystem_example() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1380, 800);//좌상단 0점기준, 해상도
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelRecording = new JPanel();
		panelRecording.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Score Recording System", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelRecording.setBounds(14, 12, 734, 386);
		frame.getContentPane().add(panelRecording);
		panelRecording.setLayout(null);
		
		JLabel lblStudentid = new JLabel("StudentID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudentid.setBounds(14, 31, 145, 29);
		panelRecording.add(lblStudentid);
		
		textFieldStudentID = new JTextField();
		textFieldStudentID.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldStudentID.setBounds(168, 31, 154, 29);
		panelRecording.add(textFieldStudentID);
		textFieldStudentID.setColumns(10);
		
		JLabel lblKorean = new JLabel("Korean");
		lblKorean.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblKorean.setBounds(412, 31, 145, 29);
		panelRecording.add(lblKorean);
		
		textFieldKorean = new JTextField();
		textFieldKorean.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldKorean.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldKorean.setColumns(10);
		textFieldKorean.setBounds(566, 31, 154, 29);
		panelRecording.add(textFieldKorean);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblName.setBounds(14, 72, 145, 29);
		panelRecording.add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldName.setColumns(10);
		textFieldName.setBounds(168, 72, 154, 29);
		panelRecording.add(textFieldName);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnglish.setBounds(412, 72, 145, 29);
		panelRecording.add(lblEnglish);
		
		textFieldEnglish = new JTextField();
		textFieldEnglish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldEnglish.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldEnglish.setColumns(10);
		textFieldEnglish.setBounds(566, 72, 154, 29);
		panelRecording.add(textFieldEnglish);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMath.setBounds(412, 113, 145, 29);
		panelRecording.add(lblMath);
		
		textFieldMath = new JTextField();
		textFieldMath.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldMath.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldMath.setColumns(10);
		textFieldMath.setBounds(566, 113, 154, 29);
		panelRecording.add(textFieldMath);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPhysics.setBounds(412, 154, 145, 29);
		panelRecording.add(lblPhysics);
		
		textFieldPhysics = new JTextField();
		textFieldPhysics.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldPhysics.setColumns(10);
		textFieldPhysics.setBounds(566, 154, 154, 29);
		panelRecording.add(textFieldPhysics);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChemistry.setBounds(412, 196, 145, 29);
		panelRecording.add(lblChemistry);
		
		textFieldChemistry = new JTextField();
		textFieldChemistry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldChemistry.setColumns(10);
		textFieldChemistry.setBounds(566, 196, 154, 29);
		panelRecording.add(textFieldChemistry);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBiology.setBounds(412, 237, 145, 29);
		panelRecording.add(lblBiology);
		
		textFieldBiology = new JTextField();
		textFieldBiology.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldBiology.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldBiology.setColumns(10);
		textFieldBiology.setBounds(566, 237, 154, 29);
		panelRecording.add(textFieldBiology);
		
		JLabel lblComputing = new JLabel("Computing");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblComputing.setBounds(412, 278, 145, 29);
		panelRecording.add(lblComputing);
		
		textFieldComputing = new JTextField();
		textFieldComputing.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldComputing.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldComputing.setColumns(10);
		textFieldComputing.setBounds(566, 278, 154, 29);
		panelRecording.add(textFieldComputing);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBusiness.setBounds(412, 319, 145, 29);
		panelRecording.add(lblBusiness);
		
		textFieldBusiness = new JTextField();
		textFieldBusiness.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						|| (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)){
					evt.consume();
				}
			}//end of keyTyped()
		});
		textFieldBusiness.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldBusiness.setColumns(10);
		textFieldBusiness.setBounds(566, 319, 154, 29);
		panelRecording.add(textFieldBusiness);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDepartment.setBounds(14, 123, 145, 29);
		panelRecording.add(lblDepartment);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(14, 237, 145, 29);
		panelRecording.add(lblTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(168, 237, 154, 29);
		panelRecording.add(textFieldTotal);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAverage.setBounds(14, 278, 145, 29);
		panelRecording.add(lblAverage);
		
		textFieldAverage = new JTextField();
		textFieldAverage.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldAverage.setColumns(10);
		textFieldAverage.setBounds(168, 278, 154, 29);
		panelRecording.add(textFieldAverage);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGrade.setBounds(14, 319, 145, 29);
		panelRecording.add(lblGrade);
		
		textFieldGrade = new JTextField();
		textFieldGrade.setFont(new Font("Tahoma", Font.BOLD, 24));
		textFieldGrade.setColumns(10);
		textFieldGrade.setBounds(168, 319, 154, 29);
		panelRecording.add(textFieldGrade);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLUE);
		separator.setBounds(14, 196, 306, 2);
		panelRecording.add(separator);
		
		JComboBox comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"CC1001", "CC1002", "CC1003", "CC1004"}));
		comboBoxDepartment.setBounds(168, 120, 154, 35);
		panelRecording.add(comboBoxDepartment);
		
		JPanel panelTranscript = new JPanel();
		panelTranscript.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Score Transcript", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelTranscript.setBounds(762, 12, 586, 386);
		frame.getContentPane().add(panelTranscript);
		panelTranscript.setLayout(null);
		
		JTextArea textAreaTranscript = new JTextArea();
		textAreaTranscript.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAreaTranscript.setBounds(14, 26, 558, 348);
		panelTranscript.add(textAreaTranscript);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 436, 1321, 188);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(Color.DARK_GRAY);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"StudentID", "Name", "DeptCode", "Korean", "English", "Math", "Physics", "Chemistry", "Biology", "Computing", "Business", "Total", "Average", "Grade"
			}
		));
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=================
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1){
					if(table.getRowCount()==0){
						JOptionPane.showMessageDialog(null, "No data to delete",
								"Scoring System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to delete",
								"Scoring System", JOptionPane.OK_OPTION);
					}
				}else{
					model.removeRow(table.getSelectedRow());
				}
				//=================
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(351, 676, 180, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========================================
				textAreaTranscript.append("Student Scoring Recording Systems\n"
						+ "================================================="
						+ "\nKorean : \t\t" + textFieldKorean.getText()
						+ "\nEnglish : \t\t" + textFieldEnglish.getText()
						+ "\nMath : \t\t" + textFieldMath.getText()
						+ "\nPhysics : \t\t" + textFieldPhysics.getText()
						+ "\nChemistry : \t\t" + textFieldChemistry.getText()
						+ "\nBiologoy : \t\t" + textFieldBiology.getText()
						+ "\nComputing : \t\t" + textFieldComputing.getText()
						+ "\nBusiness : \t\t" + textFieldBusiness.getText()
						+ "\n================================================="
						+ "\nTotal : \t\t" + textFieldTotal.getText()
						+ "\nAverage : \t\t" + textFieldAverage.getText()
						+ "\nGrade : \t\t" + textFieldGrade.getText()
						
						);
				//===============================================
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTranscript.setBounds(556, 676, 180, 46);
		frame.getContentPane().add(btnTranscript);
		
		// Reset 버튼 클릭시 panelRecording의 컴포넌트들에 대해 텍스트필드인 경우 null로 세트함
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp = null;
				JTextArea temp2 = null;
				for(java.awt.Component c:panelRecording.getComponents()){
					if(c.getClass().toString().contains("javax.swing.JTextField")){
						temp=(JTextField)c;
						temp.setText(null);
					}
				}// end of for
				for(java.awt.Component t:panelTranscript.getComponents()){
					if(t.getClass().toString().contains("javax.swing.JTextArea")){
						temp2=(JTextArea)t;
						temp2.setText(null);
					}
				}// end of for
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(750, 676, 180, 46);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(944, 676, 180, 46);
		frame.getContentPane().add(btnExit);
		
		JButton btnAddresult = new JButton("Add Result");
		btnAddresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=======================================
				double[] R = new double[11];
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
				
				String Average = String.format("%.0f",R[9]);
				textFieldAverage.setText(Average);
				
				if(R[9] >= 95){
					String Grade = "A+";
					textFieldGrade.setText(Grade);
				}
				else if(R[9] >= 90){
					String Grade = "A0";
					textFieldGrade.setText(Grade);
				}
				else if(R[9] >= 85){
					String Grade = "B+";
					textFieldGrade.setText(Grade);
				}
				else if(R[9] >= 80){
					String Grade = "B0";
					textFieldGrade.setText(Grade);
				}
				else{
					String Grade = "Fail";
					textFieldGrade.setText(Grade);
				}
				//==========================================
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
						textFieldGrade.getText()
						
				});//end of addRow
				//==========================================
			}
		});
		btnAddresult.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAddresult.setBounds(157, 676, 180, 46);
		frame.getContentPane().add(btnAddresult);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLUE);
		separator_1.setBounds(24, 411, 1312, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLUE);
		separator_2.setBounds(14, 662, 1312, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLUE);
		separator_3.setBounds(14, 734, 1312, 2);
		frame.getContentPane().add(separator_3);
	}
}
