package PracCoding;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	String[] ButtonName = { "전사", "궁수", "방패병" };
	JButton[] OrButton = new JButton[3];
	JLabel jl;
	GameWindow() {
		this.setTitle("Beta 0.01");
		this.setSize(600, 200);
		this.getContentPane().setBackground(new Color(0x00000000));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		for (int i = 0; i < ButtonName.length; i++) {
			OrButton[i]=new JButton(ButtonName[i]);
			this.add(OrButton[i]);
			OrButton[i].setPreferredSize(new Dimension(180, 170));
		}
	}
}
