package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisWindow extends JFrame {
	TetrisBoard tb;
	String[] ButtonName = { "게임시작", "블록교체", "블록회전", "게임종료" };
	JButton[] OrderButton = new JButton[4];
	JLabel jl;

	// 3단계
	int[] BColor;
	int[][] TetrisMap = new int[20][10];
	int[][][] AllBlock;
	int[][] NBlock;
	int BlockNums, BlockX, BlockY;

	public TetrisWindow() {
		this.setTitle("Tetris 0.01");
		this.setSize(500, 730);
		this.getContentPane().setBackground(new Color(0x00000000));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		// 판넬생성
		JPanel fp = new JPanel();
		fp.setPreferredSize(new Dimension(500, 40));
		fp.setBackground(new Color(0x001F1F20));
		fp.setOpaque(true);
		this.add(fp);
		// 버튼생성
		for (int i = 0; i < ButtonName.length; i++) {
			OrderButton[i] = new JButton(ButtonName[i]);
			fp.add(OrderButton[i]);
		}
		// 화면 그래픽 갱신,,
		this.repaint();
		this.revalidate();
		// 레이블생성
		jl = new JLabel("Score", JLabel.CENTER);
		jl.setPreferredSize(new Dimension(60, 25));
		jl.setBackground(new Color(0x00545966));
		jl.setOpaque(true);
		fp.add(jl);
	}

	void initialize() {
		// 7개 블록조각 색상
		this.BColor = new int[]={0xF52525,0xFFA500,0xFFFF00,0x00FF00,0x00FFFF,0x0059FF,0xAC00FF};
		// 7개 블록조각 생성
		this.AllBlock = new int[][][] {
				{ { Bcolor[0], 0, 0, 0 }, { Bcolor[0], 0, 0, 0 }, { Bcolor[0], 0, 0, 0 }, { Bcolor[0], 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { Bcolor[1], 0, 0, 0 }, { Bcolor[1], Bcolor[1], Bcolor[1], 0 } },
				{ { 0, 0, 0, 0 }, { Bcolor[2], 0, 0, 0 }, { Bcolor[2], 0, 0, 0 }, { Bcolor[2], Bcolor[2], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { Bcolor[3], Bcolor[3], 0, 0 }, { Bcolor[3], Bcolor[3], 0, 0 } },
				{ { 0, 0, 0, 0 }, { Bcolor[4], 0, 0, 0 }, { Bcolor[4], Bcolor[4], 0, 0 }, { Bcolor[4], 0, 0, 0 } },
				{ { 0, 0, 0, 0 }, { Bcolor[5], 0, 0, 0 }, { Bcolor[5], Bcolor[5], 0, 0 }, { 0, Bcolor[5], 0, 0 } },
				{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { Bcolor[6], Bcolor[6], 0, 0 }, { 0, Bcolor[6], Bcolor[6], 0 } } };
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
}
