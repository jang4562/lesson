package Lecture1108;

import java.awt.*;
import javax.swing.*;

public class EX13_01 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setTitle("GUI 연습");
			
			// 이 부분에 버튼,레이블, 체크박스 등을 코딩함
			this.setLayout(new GridLayout(3 , 3, 10, 10));
			
			this.setLayout(null);
			
			JButton btn1 = new JButton("버튼1");
			btn1.setBounds(50, 50, 70, 60);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			btn2.setBounds(80, 80, 70, 60);
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
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
