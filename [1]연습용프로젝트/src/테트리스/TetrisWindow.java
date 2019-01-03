package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TetrisWindow extends JFrame implements KeyListener, Runnable {
	TetrisBoard tb;
	Random rand = new Random();
	JLabel JL;

	// 3단계
	int[] BColor;
	int[][] TetrisMap = new int[20][10];
	int[][][] AllBlock;
	int[][] NBlock;
	int BlockNums, BlockX, BlockY;
	int firstBlockX, firstBlockY;
	// 4단계
	int minX, minY, maxX, maxY;
	boolean isBottom;
	int score;
	Thread runThread;
	boolean duringPlay = false;
	// test
	int NextBlock = rand.nextInt(7);
	int speed = 1000;
	int cntCombo = 0;
	Clip clip;

	// 5단계
	JMenuBar menuBar;
	JMenu[] menu;
	JMenuItem[] menuItem;

	public TetrisWindow() {
		this.setTitle("Tetris 0.01");
		this.setSize(500, 700);
		this.getContentPane().setBackground(new Color(0x00000000));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);

		// this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		this.setLayout(null);
		// 화면 그래픽 갱신
		this.repaint();
		this.revalidate();
		// 레이블생성
		JL = new JLabel("Score", JLabel.CENTER);
		JL.setForeground(Color.WHITE);
		JL.setPreferredSize(new Dimension(70, 25));
		JL.setBackground(new Color(0x00545966));
		JL.setOpaque(true);
		addMenu();
	}

	private void addMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu[] { new JMenu("Command"), new JMenu("Music") };
		menuItem = new JMenuItem[] { new JMenuItem("Start"), new JMenuItem("Stop"), new JMenuItem("Close"),
				new JMenuItem("Bradinsky"), new JMenuItem("Kalinka") };

		menu[0].add(menuItem[0]);
		menu[0].add(menuItem[1]);
		menu[0].add(menuItem[2]);

		menu[1].add(menuItem[3]);
		menu[1].add(menuItem[4]);

		menuBar.add(menu[0]);
		menuBar.add(menu[1]);

		this.setJMenuBar(menuBar);
		for (int i = 0; i < 5; i++) {
			menuItem[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String commandName = arg0.getActionCommand();
					switch (commandName) {
					case "Start":
						executeGameStartCommand();
						break;
					case "Stop":
						executeEndCommand();
						break;
					case "Close":
						System.exit(0);
						break;
					case "Bradinsky":
						if(clip!=null && clip.isActive())
							clip.stop();
						playSound("./Sound/BGM_Tetris_Bradinsky.wav");
						break;
					case "Kalinka":
						if(clip!=null && clip.isActive())
							clip.stop();
						playSound("./Sound/BGM_Tetris_Kalinka.wav");
						break;
					}
				}
			});
		}
	}

	private void playSound(String fileName) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File(fileName));
			clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
			clip.loop(-1);
		} catch (Exception e) {
		}
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
		this.NextBlock = rand.nextInt(7);
		this.NBlock = AllBlock[BlockNums].clone();
		this.BlockX = firstBlockX = 3;
		this.BlockY = firstBlockY = 0;
	}

	void makeNewTetrisBlock() {
		this.BlockNums = this.NextBlock;
		this.NextBlock = rand.nextInt(7);
		this.NBlock = this.AllBlock[this.BlockNums].clone();
		this.BlockX = this.firstBlockX;
		this.BlockY = this.firstBlockY;

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
			cntCombo++;
			i++;
		}
		if (cntCombo == 1)
			score += 10;
		else if (cntCombo == 2)
			score += 30;
		else if (cntCombo == 3)
			score += 60;
		else if (cntCombo == 4)
			score += 100;
		tb.JScore.setText(score + "점");
		cntCombo = 0;
	}

	private void executeEndCommand() {
		duringPlay = false;
		while (runThread.isAlive()) {
			runThread.interrupt();
		}
	}

	private void executeGameStartCommand() {
		initialize();
		// 낙하 스레드
		duringPlay = true;
		runThread = new Thread(this);
		runThread.start();
		try {
			this.removeKeyListener(this);
		} catch (Exception e) {
		}
		this.addKeyListener(this);
		this.requestFocus();
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
			duringPlay = isNotEnd(NextBlock);
			if (duringPlay == false) {
				JOptionPane.showMessageDialog(null, "게임이 종료되었습니다", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
				tb.repaint();
				tb.revalidate();
				return;
			}
			// 새로운 블록 등장
			makeNewTetrisBlock();
			break;
		}
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

	public void run() {
		while (duringPlay) {
			try {
				if (isBottom()) {
					recordInTetrisMap();
					removeFullLines();
					duringPlay = isNotEnd(NextBlock);
					if (duringPlay == false) {
						JOptionPane.showMessageDialog(null, "게임이 종료되었습니다", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
						tb.repaint();
						tb.revalidate();
						return;
					}
					makeNewTetrisBlock();

					this.isBottom = false;
				} else {
					moveTetrisBlock(0, 1);
				}
				if (score >= 500) {
					speed = 900;
					tb.JLevel.setText("Level 1");
				} else if (score >= 100) {
					speed = 800;
					tb.JLevel.setText("Level 2");
				} else if (score >= 1500) {
					speed = 700;
					tb.JLevel.setText("Level 3");
				} else if (score >= 2000) {
					speed = 600;
					tb.JLevel.setText("Level 4");
				} else if (score >= 2500) {
					speed = 500;
					tb.JLevel.setText("Level 5");
				}
				Thread.sleep(speed);
			} catch (InterruptedException e) {
			}
		}
	}

	private boolean isNotEnd(int nextBlockNumber) {
		int[][] nextBlocks = this.AllBlock[nextBlockNumber].clone();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((nextBlocks[i][j] > 0) && (this.TetrisMap[this.firstBlockY + i][this.firstBlockX + j] > 0)) {
					return false;
				}
			}
		}
		return true;
	}
}