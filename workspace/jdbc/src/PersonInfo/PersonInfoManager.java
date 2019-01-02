package PersonInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.mysql.jdbc.Connection;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonInfoManager {

	private JFrame frmPersoninfomanager;
	private JTextField textFieldName;
	private JTextField textFieldFamailName;
	private JTextField textFieldCity;
	private JTextField textFieldEmail;
	private JPasswordField passwordField_Confirmpwd;
	private JPasswordField passwordField_Password;
	Connection connectdb = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonInfoManager window = new PersonInfoManager();
					window.frmPersoninfomanager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PersonInfoManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersoninfomanager = new JFrame();
		frmPersoninfomanager.setResizable(false); //사이즈 수정 불가능 false
		frmPersoninfomanager.setTitle("PersonInfoManager");
		frmPersoninfomanager.setBounds(100, 100, 342, 360);
		frmPersoninfomanager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersoninfomanager.getContentPane().setLayout(null);
		
		JPanel panelContent = new JPanel();
		panelContent.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelContent.setBounds(13, 10, 300, 200);
		frmPersoninfomanager.getContentPane().add(panelContent);
		panelContent.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 10, 80, 15);
		panelContent.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(12, 35, 80, 15);
		panelContent.add(lblGender);
		
		JLabel lblFamailName = new JLabel("FamailName");
		lblFamailName.setBounds(12, 60, 80, 15);
		panelContent.add(lblFamailName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 85, 80, 15);
		panelContent.add(lblPassword);
		
		JLabel lblConfirmpwd = new JLabel("Confirm pwd");
		lblConfirmpwd.setBounds(12, 110, 80, 15);
		panelContent.add(lblConfirmpwd);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(12, 135, 80, 15);
		panelContent.add(lblCity);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(12, 160, 80, 15);
		panelContent.add(lblEmail);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(128, 7, 160, 21);
		panelContent.add(textFieldName);
		textFieldName.setColumns(10);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBoxGender.setBounds(128, 32, 160, 21);
		panelContent.add(comboBoxGender);
		
		textFieldFamailName = new JTextField();
		textFieldFamailName.setBounds(128, 57, 160, 21);
		panelContent.add(textFieldFamailName);
		textFieldFamailName.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(128, 132, 160, 21);
		panelContent.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(128, 157, 160, 21);
		panelContent.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		passwordField_Confirmpwd = new JPasswordField();
		passwordField_Confirmpwd.setBounds(128, 107, 160, 21);
		panelContent.add(passwordField_Confirmpwd);
		
		passwordField_Password = new JPasswordField();
		passwordField_Password.setBounds(128, 82, 160, 21);
		panelContent.add(passwordField_Password);
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Select one to operat", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelBtns.setBounds(13, 220, 300, 100);
		frmPersoninfomanager.getContentPane().add(panelBtns);
		panelBtns.setLayout(null);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					connectdb = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","jang4562");
					java.sql.PreparedStatement rs = connectdb.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
					// try문에 오류를잡아주려했으나 실패해서 catch문을 수정함
					//java.sql.PreparedStatement sc = connectdb.prepareStatement("SELECT * from student where name=?");
					
					rs.setString(1, textFieldName.getText());
					rs.setString(2, comboBoxGender.getSelectedItem().toString());
					rs.setString(3, textFieldFamailName.getText());
					rs.setString(4, passwordField_Confirmpwd.getText());
					rs.setString(5, passwordField_Password.getText());
					rs.setString(6, textFieldCity.getText());
					rs.setString(7, textFieldEmail.getText());
					
					if(textFieldName.getText().length() == 0){
						JOptionPane.showMessageDialog(null, "이름을 입력해주십시오");
					} else {
						if(passwordField_Confirmpwd.getText().equalsIgnoreCase(passwordField_Password.getText())){
								rs.executeUpdate();
								JOptionPane.showMessageDialog(null, "입력 완료");
							}
							else{
								JOptionPane.showMessageDialog(null,  "패스워드 불일치");
							}
						}
					
				} catch (SQLException e1){
					JOptionPane.showMessageDialog(null, "이미 중복된 이름입니다");
					//e1.printStackTrace(); 이문을 사용하면 이클립스 콘솔창에 오류내용이뜨나 PRIMARY KEY 로 중복내용을 표시해주기위해서 수정함
				}
			}
		});
		btnInsert.setBounds(15, 20, 80, 30);
		panelBtns.add(btnInsert);
		
		JButton btnsearch = new JButton("Search");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					// Search를위해 SELECT문을 사용을위해 조건 문 where 에 사용하기위한 조건 (성)을 조회하기위해
					// 성으로 검색하고싶다면 textFieldFamilyName으로 수정
					// ** 후에 데이터베이스 키워드 검색문을 찾아보자
					String keyname = textFieldName.getText();
					connectdb = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","jang4562");
					// 데이터베이스검색문 조건문을바꾸면 원하는 검색조건으로 수정가능
					java.sql.PreparedStatement sc = connectdb.prepareStatement("SELECT * from student where name=?");
					sc.setString(1, keyname);
					
					//해당 쿼리??
					//import에 추가
					ResultSet rs = sc.executeQuery();
					if(textFieldName.getText().length() == 0){
						JOptionPane.showMessageDialog(null, "이름을 입력해주십시오");
					} else {
						if(rs.next()){
						String name = rs.getString(1);
						String gender = rs.getString(2);
						String family = rs.getString(3);
						String password = rs.getString(4);
						String confirm = rs.getString(5);
						String city = rs.getString(6);
						String email = rs.getString(7);
						
						textFieldName.setText(name);
						comboBoxGender.setSelectedItem(gender);
						textFieldFamailName.setText(family);
						passwordField_Confirmpwd.setText(password);
						passwordField_Password.setText(confirm);
						textFieldCity.setText(city);
						textFieldEmail.setText(email);
						}
					}
					
				} catch (SQLException e1){
					// 오류 문
					e1.printStackTrace();
				}	
			}
		});
		btnsearch.setBounds(110, 20, 80, 30);
		panelBtns.add(btnsearch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText(null);
				// 콤보박스 아이템이기때문에 그중 검색아이템을 넣어주자 null을넣으면 비어있는 공백이생김
				comboBoxGender.setSelectedItem("Male");
				textFieldFamailName.setText(null);
				passwordField_Confirmpwd.setText(null);
				passwordField_Password.setText(null);
				textFieldCity.setText(null);
				textFieldEmail.setText(null);
			}
		});
		btnClear.setBounds(205, 20, 80, 30);
		panelBtns.add(btnClear);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					connectdb = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","jang4562");
					java.sql.PreparedStatement up = connectdb.prepareStatement("UPDATE student set gender=?,family=?,city=?,email=? where name=? and password=? and confirm=?");
					up.setString(1, comboBoxGender.getSelectedItem().toString());
					up.setString(2, textFieldFamailName.getText());
					up.setString(3, textFieldCity.getText());
					up.setString(4, textFieldEmail.getText());
					up.setString(5, textFieldName.getText());
					up.setString(6, passwordField_Password.getText());
					up.setString(7, passwordField_Confirmpwd.getText());
					
					if(textFieldName.getText().length() == 0){
						JOptionPane.showMessageDialog(null, "이름을 입력해주십시오");
					} else {
						if(passwordField_Confirmpwd.getText().equalsIgnoreCase(passwordField_Password.getText())){
							// executeUpdate 문을 넣지않으면 수정이안됨
							up.executeUpdate();
							JOptionPane.showMessageDialog(null, "수정완료");
						}else{
							JOptionPane.showMessageDialog(null,  "패스워드 불일치");
						}
					}
				}catch(SQLException e1){
				// 오류 문
				e1.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(15, 60, 80, 30);
		panelBtns.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					connectdb = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","jang4562");
					java.sql.PreparedStatement del = connectdb.prepareStatement("DELETE FROM student where name=? and password=? and confirm=?");
					del.setString(1, textFieldName.getText());
					del.setString(2, passwordField_Password.getText());
					del.setString(3, passwordField_Confirmpwd.getText());
					if(textFieldName.getText().length() == 0){
						JOptionPane.showMessageDialog(null, "이름을 입력해주십시오");
					} else {
						if(passwordField_Confirmpwd.getText().equalsIgnoreCase(passwordField_Password.getText())){
						// executeUpdate 문을 넣지않으면 수정이안됨
						del.executeUpdate();
						JOptionPane.showMessageDialog(null, "삭제완료");
						}
						else{
						JOptionPane.showMessageDialog(null,  "패스워드 불일치");
						}
					}
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(110, 60, 80, 30);
		panelBtns.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(205, 60, 80, 30);
		panelBtns.add(btnExit);
	}
}
	
