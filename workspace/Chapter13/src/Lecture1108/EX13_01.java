package Lecture1108;

import java.awt.*;
import javax.swing.*;

public class EX13_01 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle("GUI ����");
			
			// �� �κп� ��ư,���̺�, üũ�ڽ� ���� �ڵ���
			this.setLayout(new GridLayout(3 , 3, 10, 10));
			
			this.setLayout(null);
			
			JButton btn1 = new JButton("��ư1");
			btn1.setBounds(50, 50, 70, 60);
			this.add(btn1);
			
			JButton btn2 = new JButton("��ư2");
			btn2.setBounds(80, 80, 70, 60);
			this.add(btn2);
			
			JButton btn3 = new JButton("��ư3");
			btn3.setBounds(110, 110, 70, 60);
			this.add(btn3);
						
			
			setSize(256,256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
