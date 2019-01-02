package PersonalInfoManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.sql.SQLException;
import java.sql.Statement;



public class PersonInfoManager extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtFamilyName;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirm;
	private JTextField txtCity;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonInfoManager frame = new PersonInfoManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public PersonInfoManager() {
		setResizable(false);
		setTitle("Personal Info. Mng.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name ");
		lblName.setBounds(10, 10, 100, 20);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(150, 10, 160, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 40, 100, 20);
		contentPane.add(lblGender);
		
		String[] gender = {"Maile", "Female"};
		JComboBox comboBoxGender = new JComboBox(gender);
		comboBoxGender.setBounds(150, 40, 160, 20);
		contentPane.add(comboBoxGender);
		
		JLabel lblFamilyName = new JLabel("Family Name ");
		lblFamilyName.setBounds(10, 70, 100, 20);
		contentPane.add(lblFamilyName);
		
		txtFamilyName = new JTextField();
		txtFamilyName.setBounds(150, 70, 160, 20);
		contentPane.add(txtFamilyName);
		txtFamilyName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 100, 100, 20);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(150, 100, 160, 20);
		contentPane.add(txtPassword);
		
		JLabel lblConfirmpwd = new JLabel("Confirm pwd");
		lblConfirmpwd.setBounds(10, 130, 100, 20);
		contentPane.add(lblConfirmpwd);
		
		txtConfirm = new JPasswordField();
		txtConfirm.setBounds(150, 130, 160, 20);
		contentPane.add(txtConfirm);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 160, 160, 20);
		contentPane.add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setBounds(150, 160, 160, 20);
		contentPane.add(txtCity);
		txtCity.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(10, 190, 160, 20);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(150, 190, 160, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JPanel panelBtns = new JPanel();
		panelBtns.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Select & Click to operat", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Select one button to operate", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelBtns.setBounds(10, 240, 300, 110);
		contentPane.add(panelBtns);
		
		// Insertion Button operating
		JButton btnInsertion = new JButton("Insertion");
		btnInsertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connectdb = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "cjgreen");
					java.sql.PreparedStatement Pstatement = connectdb.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
					
					Pstatement.setString(1, txtName.getText());
					Pstatement.setString(2, comboBoxGender.getSelectedItem().toString());
					Pstatement.setString(3, txtFamilyName.getText());
					Pstatement.setString(4, txtPassword.getText());
					Pstatement.setString(5, txtConfirm.getText());
					Pstatement.setString(6, txtCity.getText());
					Pstatement.setString(7, txtEmail.getText());
					
					if(txtPassword.getText().equalsIgnoreCase(txtConfirm.getText())){
						Pstatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
					}
					else{
						JOptionPane.showMessageDialog(null,  "password not match");
					}
						
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panelBtns.add(btnInsertion);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    
				try {
					String keyname = txtName.getText();
					
					Connection connectdb = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?useSSL=false", "root", "cjgreen");
					

					java.sql.PreparedStatement st = connectdb.prepareStatement("SELECT * from student where USERNAME=?");
					st.setString(1, keyname);
					 
					//executing query
					ResultSet rs = st.executeQuery();
					
				    if(rs.next()){
					  String name = rs.getString(1);
					  String gender = rs.getString(2);
					  String family = rs.getString(3);
					  String passwd = rs.getString(4);
					  String confirm = rs.getString(5);
					  String city = rs.getString(6);
					  String email = rs.getString(7);
					
					  txtName.setText(name);
					  comboBoxGender.setSelectedItem(gender);
					  txtFamilyName.setText(family);
					  txtPassword.setText(passwd);
					  txtConfirm.setText(confirm);
					  txtCity.setText(city);
					  txtEmail.setText(email);
					  System.out.println(family);
				    }
			
			    } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panelBtns.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBtns.add(btnUpdate);
		
		JButton btnDeletion = new JButton("Deletion");
		btnDeletion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBtns.add(btnDeletion);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				comboBoxGender.setSelectedItem("Male");
				txtFamilyName.setText("");
				txtPassword.setText("");
				txtConfirm.setText("");
				txtCity.setText("");
				txtEmail.setText("");
			}
		});
		panelBtns.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		panelBtns.add(btnExit);
	}
}