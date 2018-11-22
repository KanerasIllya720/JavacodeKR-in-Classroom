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

	// 테트리스 맵 나타내기
	protected void paintComponent(Graphics g) {// call back 함수
		super.paintComponent(g);
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (tw.TetrisMap[i][j] > 0) {
					g.setColor(new Color(tw.TetrisMap[i][j]));
					g.fillRect(100 + j * 30, 25 + i * 30, 30, 30);
				}
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
	// 게임판 블록 얹히기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tw.NBlock[i][j] > 0) {
					g.setColor(new Color(tw.NBlock[i][j]));
					g.fillRect(100 + (tw.BlockX + j) * 30, 25 + (tw.BlockY + i) * 30, 30, 30);
					g.setColor(new Color(0x00E2E4E6));
					g.drawRect(100 + (tw.BlockX + j) * 30, 25 + (tw.BlockY + i) * 30, 30, 30);
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tw.AllBlock[tw.BlockNums][i][j] > 0) {
					g.setColor(new Color(tw.AllBlock[tw.BlockNums][i][j]));
					g.fillRect(415 + j * 15, 25 + i * 15, 15, 15);
					g.setColor(new Color(0x00E2E4E6));
					g.drawRect(415 + j * 15, 25 + i * 15, 15, 15);
				}
			}
		}
		
	}
	
}
