package Lecture1122;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Scrollbar;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.List;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButtonMenuItem;
import java.awt.ScrollPane;
import java.awt.Choice;
import java.awt.TextArea;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import java.awt.TextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Panel;
import javax.swing.ButtonGroup;

public class FirstWBFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldName;
	private JTextField txtId;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWBFrame frame = new FirstWBFrame();
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
	public FirstWBFrame() {
		setTitle("WBFirstTitle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 381);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 1, true));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uC815\uBCF4 \uC785\uB825 \uD654\uBA74");
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 434, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("이름");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 163, 57, 15);
		contentPane.add(label);
		
		textFieldName = new JTextField();
		textFieldName.setText("이름을 입력해주세요.");
		textFieldName.setBounds(97, 160, 312, 21);
		contentPane.add(textFieldName);
		textFieldName.setColumns(20);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC774\uBA54\uC77C\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694.", "naver.com", "daum.net", "gmail.com", "yahoo.co.kr"}));
		comboBox.setBounds(247, 203, 162, 21);
		contentPane.add(comboBox);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(97, 203, 120, 21);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("@");
		label_1.setBackground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(218, 203, 29, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC774\uBA54\uC77C");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 206, 57, 15);
		contentPane.add(label_2);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(12, 45, 57, 15);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setText("ID\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		txtId.setColumns(20);
		txtId.setBounds(97, 42, 312, 21);
		contentPane.add(txtId);
		
		JLabel lblPassoword = new JLabel("PW");
		lblPassoword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassoword.setBounds(12, 83, 57, 15);
		contentPane.add(lblPassoword);
		
		JLabel lblRepw = new JLabel("REPW");
		lblRepw.setHorizontalAlignment(SwingConstants.CENTER);
		lblRepw.setBounds(12, 119, 57, 15);
		contentPane.add(lblRepw);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 80, 312, 21);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(97, 116, 312, 21);
		contentPane.add(passwordField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(97, 246, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(188, 246, 57, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel label_4 = new JLabel("\uC131\uBCC4");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(12, 250, 57, 15);
		contentPane.add(label_4);
		
		JButton button = new JButton("\uAC00\uC785\uD558\uAE30\r\n");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(168, 293, 97, 23);
		contentPane.add(button);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
