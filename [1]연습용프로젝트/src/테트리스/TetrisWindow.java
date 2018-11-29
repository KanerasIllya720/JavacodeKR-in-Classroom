package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.scene.transform.Rotate;

public class TetrisWindow extends JFrame implements ActionListener, KeyListener {
	TetrisBoard tb;
	Random rand = new Random();
	String[] ButtonName = { "Start", "Close" };
	JButton[] OrButton = new JButton[2];
	JLabel JL;

	// 3단계
	int[] BColor;
	int[][] TetrisMap = new int[20][10];
	int[][][] AllBlock;
	int[][] NBlock;
	int BlockNums, BlockX, BlockY;
	// 4단계
	int minX, minY, maxX, maxY;
	boolean isBottom;
	int score;
	// test
	int NextBlock = rand.nextInt(7);

	public TetrisWindow() {
		this.setTitle("Tetris 0.01");
		this.setSize(500, 730);
		this.getContentPane().setBackground(new Color(0x00000000));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		// 판넬생성
		JPanel fp = new JPanel();
		fp.setPreferredSize(new Dimension(500, 40));
		fp.setBackground(new Color(0x001F1F20));
		fp.setOpaque(true);
		this.add(fp);
		// 버튼생성
		for (int i = 0; i < ButtonName.length; i++) {
			OrButton[i] = new JButton(ButtonName[i]);
			fp.add(OrButton[i]);
		}
		// 버튼 이벤트 처리
		for (int i = 0; i < 2; i++)
			this.OrButton[i].addActionListener(this);
		// 화면 그래픽 갱신
		this.repaint();
		this.revalidate();
		// 레이블생성
		JL = new JLabel("Score", JLabel.CENTER);
		JL.setForeground(Color.WHITE);
		JL.setPreferredSize(new Dimension(60, 25));
		JL.setBackground(new Color(0x00545966));
		JL.setOpaque(true);
		fp.add(JL);
	}

	void initialize() {
		// 7개 블록조각 색상
		this.BColor = new int[] { 0xEE49EE, 0xFF0000, 0xFFFF00, 0x0059FF, 0xFFA500, 0x00FF00, 0x00FFFF };
		// 7개 블록조각 생성
		this.AllBlock = new int[][][] {
				{ { BColor[0], 0, 0, 0 }, { BColor[0], 0, 0, 0 }, { BColor[0], 0, 0, 0 }, { BColor[0], 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { BColor[1], 0, 0, 0 }, { BColor[1], BColor[1], BColor[1], 0 } },
				{ { 0, 0, 0, 0 }, { BColor[2], 0, 0, 0 }, { BColor[2], 0, 0, 0 }, { BColor[2], BColor[2], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { BColor[3], BColor[3], 0, 0 }, { BColor[3], BColor[3], 0, 0 } },
				{ { 0, 0, 0, 0 }, { BColor[4], 0, 0, 0 }, { BColor[4], BColor[4], 0, 0 }, { BColor[4], 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { BColor[5], 0, 0, 0 }, { BColor[5], BColor[5], 0, 0 }, { 0, BColor[5], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { BColor[6], BColor[6], 0, 0 }, { 0, BColor[6], BColor[6], 0 } } };
		// 테트리스 게임판 초기화
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				this.TetrisMap[i][j] = 0;
			}
		}
		// 게임 변수 초기화
		this.BlockNums = 0;
		this.NBlock = AllBlock[BlockNums].clone();
		this.BlockX = 3;
		this.BlockY = 0;
	}

	void drawTetrisBoard(int Blocknums, int x, int y) {
		this.BlockNums = Blocknums;
		this.NBlock = this.AllBlock[this.BlockNums].clone();
		this.BlockX = x;
		this.BlockY = y;

		tb.repaint();
		tb.revalidate();
	}

	void moveTetrisBlock(int x, int y) {
		this.BlockX += x;
		this.BlockY += y;

		getMinMaxXY(NBlock);

		// 맵 이탈 방지
		if (haveBlockTroubles(NBlock) == true) {
			this.BlockX -= x;
			this.BlockY -= y;
		}

		// 바닥인지 검사
		this.isBottom = isBottom();

		tb.repaint();
		tb.revalidate();
	}

	boolean isBottom() {
		if (BlockY + maxY >= 19)
			return true;
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (NBlock[i][j] > 0) {
					if (TetrisMap[BlockY + i + 1][BlockX + j] > 0)
						return true;
				}
			}
		}
		return false;
	}

	boolean haveBlockTroubles(int[][] N2Block) {
		getMinMaxXY(N2Block);
		if ((BlockX + maxX > 9) || (BlockX < 0) || (BlockY + maxY > 19))
			return true;
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				if (N2Block[i][j] > 0) {
					if (TetrisMap[BlockY + i][BlockX + j] > 0)
						return true;
				}
			}
		}
		return false;
	}

	void rotateTetrisBlock() {
		int[][] RotateBlock = new int[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				RotateBlock[j][3 - i] = this.NBlock[i][j];
		// 내부 조각 범위 확인
		getMinMaxXY(RotateBlock);
		// 블록 좌측 하단이동
		int MoveLeft = minX;
		int MoveDown = 3 - maxY;
		for (int i = maxY; i >= minY; i--) {
			for (int j = minX; j <= maxX; j++) {
				int value = RotateBlock[i][j];
				RotateBlock[i][j] = 0;
				RotateBlock[i + MoveDown][j - MoveLeft] = value;
			}
		}

		if (haveBlockTroubles(RotateBlock) == false)
			NBlock = RotateBlock;
		getMinMaxXY(NBlock);
		tb.repaint();
		tb.revalidate();
	}

	void getMinMaxXY(int[][] NowBlock) {
		minX = minY = 999;
		maxX = maxY = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (NowBlock[i][j] > 0) {
					minX = Math.min(minX, j);
					maxX = Math.max(maxX, j);
					minY = Math.min(minY, i);
					maxY = Math.max(maxY, i);
				}
			}
		}
	}

	void recordInTetrisMap() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (NBlock[i][j] > 0) {
					TetrisMap[BlockY + i][BlockX + j] = NBlock[i][j];
				}
			}
		}
	}

	void removeFullLines() {
		for (int i = 19; i >= 0; i--) {
			int cnt = 0;
			for (int j = 0; j < 10; j++) {
				if (TetrisMap[i][j] > 0)
					cnt++;
			}
			if (cnt < 10)
				continue;
			// 블록제거
			for (int m = i; m > 0; m--) {
				for (int n = 0; n < 10; n++) {
					TetrisMap[m][n] = TetrisMap[m - 1][n];
					TetrisMap[m - 1][n] = 0;
				}
			}
			// 점수가산
			score += 10;
			this.JL.setText(score + "점");
			i++;
		}
	}

	public void actionPerformed(ActionEvent act) {
		JButton jb = (JButton) act.getSource();
		if (jb.getText().equals("Start")) {
			try {
				this.removeKeyListener(this);
			} catch (Exception e) {
			}
			this.addKeyListener(this);
			this.requestFocus();
		}

		else if (jb.getText().equals("Close"))
			System.exit(0);
	}

	public void keyPressed(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			moveTetrisBlock(-1, 0);
			break;
		case KeyEvent.VK_RIGHT:
			moveTetrisBlock(1, 0);
			break;
		case KeyEvent.VK_UP:
			this.rotateTetrisBlock();
			this.requestFocus();
			break;
		case KeyEvent.VK_DOWN:
			moveTetrisBlock(0, 1);
			break;
		case KeyEvent.VK_SPACE:
			isBottom = false;
			// 바닥으로 꼴아박기
			while (isBottom == false) {
				moveTetrisBlock(0, 1);
			}

			// 맵에 블록 기록
			recordInTetrisMap();
			// 라인삭제
			removeFullLines();
			// 새로운 블록 등장
			NextBlock = rand.nextInt(7);
			drawTetrisBoard(BlockNums, 3, 0);
			BlockNums = NextBlock;
			break;
		}
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}