package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TetrisBoard extends JPanel {
	TetrisWindow tw;

	public TetrisBoard() {
		this.setPreferredSize(new Dimension(500, 650));
		this.setBackground(new Color(0x00000000));
	}

	protected void paintComponent(Graphics g) {// call back 함수
		super.paintComponent(g);
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				g.setColor(new Color(0x00E2E4E6));
				g.drawRect(100 + j * 30, 25 + i * 30, 30, 30);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				g.setColor(new Color(0x00E2E4E6));
				g.drawRect(400 + j * 15, 25 + i * 15, 15, 15);
			}
		}
	}
}
