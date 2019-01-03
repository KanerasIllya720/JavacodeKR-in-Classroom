package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisBoard extends JPanel {
	TetrisWindow tw;
	JLabel JScore;
	JLabel JLevel;
	int line = 0;
	boolean det;

	public TetrisBoard() {
		this.setLayout(null);
		this.setSize(new Dimension(500, 650));
		this.setBackground(new Color(0x00000000));
		// 점수
		JScore = new JLabel("Score", JLabel.CENTER);
		JScore.setForeground(Color.WHITE);
		JScore.setBounds(410, 130, 80, 40);
		JScore.setBackground(Color.DARK_GRAY);
		JScore.setOpaque(true);
		this.add(JScore);
		// 레벨
		JLevel = new JLabel("Level 0", JLabel.CENTER);
		JLevel.setForeground(Color.WHITE);
		JLevel.setBounds(410, 170, 80, 40);
		JLevel.setBackground(Color.DARK_GRAY);
		JLevel.setOpaque(true);
		this.add(JLevel);
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
				g.drawRect(410 + j * 20, 25 + i * 20, 20, 20);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				g.setColor(new Color(0x00E2E4E6));
				g.drawRect(410 + j * 20, 25 + i * 20, 20, 20);
			}
		}
		if (tw.duringPlay == false)
			return;
		for (int l = 0; l <= 16; l++) {
			line = l;
			det = false;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if ((tw.NBlock[i][j] > 0) && ((l + i == 19) || (tw.TetrisMap[l + i+1][tw.BlockX + j] > 0))) {
						det = true;
						break;
					}
				}
				if (det == true)
					break;
			}
			if (det == true)
				break;
		}
		// 그림자
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (tw.NBlock[i][j] > 0) {
					g.setColor(Color.DARK_GRAY);
					g.fillRect(100 + (tw.BlockX + j) * 30, 25 + (line + i) * 30, 30, 30);
					g.setColor(new Color(0x00E2E4E6));
					g.drawRect(100 + (tw.BlockX + j) * 30, 25 + (line + i) * 30, 30, 30);
				}
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
				if (tw.AllBlock[tw.NextBlock][i][j] > 0) {
					g.setColor(new Color(tw.AllBlock[tw.NextBlock][i][j]));
					g.fillRect(410 + j * 20, 25 + i * 20, 20, 20);
					g.setColor(new Color(0x00E2E4E6));
					g.drawRect(410 + j * 20, 25 + i * 20, 20, 20);
				}
			}
		}

	}

}
