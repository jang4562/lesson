package Lecture1115;
import java.awt.*;
import javax.swing.*;

public class EX13_10 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 4");

			this.setLayout(new FlowLayout());

			String[] pet = {"�����", "������", "�䳢", "�ھ˶�", "�۾���", "����", "�罿", "����", "��"};
			
			JList list = new JList(pet);
			this.add(list);
			this.add(new JScrollPane(list));

			JComboBox combo = new JComboBox(pet);
			this.add(combo);
			
			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}