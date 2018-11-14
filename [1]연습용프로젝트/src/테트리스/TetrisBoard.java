package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class TetrisBoard extends JPanel {
	public TetrisBoard() {
		this.setPreferredSize(new Dimension(500,650));
		this.setBackground(new Color(0x00000000));
	}
	protected void paintComponent(Graphics g) {//call back 함수
		super.paintComponent(g);
		Random rn = new Random();
		for(int i=0;i<20;i++) {
			for(int j=0;j<10;j++) {
				g.setColor(new Color(rn.nextInt(256), rn.nextInt(256), rn.nextInt(256)));
				g.fillRect(100+j*30,10+i*30, 30, 30);
			}
		}
	}
}
