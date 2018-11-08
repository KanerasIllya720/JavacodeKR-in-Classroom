package 테트리스;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisWindow extends JFrame {
	String[] ButtonName = { "게임시작", "블록교체", "블록회전", "게임종료" };
	JButton[] OrderButton = new JButton[4];
	JLabel jl;
	public TetrisWindow() {
		this.setTitle("Tetris 0.01");
		this.setSize(500, 700);
		this.getContentPane().setBackground(new Color(0x00000000));
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		//판넬생성
		JPanel fp = new JPanel();
		fp.setPreferredSize(new Dimension(500, 40));
		fp.setBackground(new Color(0x001F1F20));
		fp.setOpaque(true);
		this.add(fp);
		//버튼생성
		for (int i = 0; i < ButtonName.length; i++) {
			OrderButton[i]=new JButton(ButtonName[i]);
			fp.add(OrderButton[i]);
		}
		//화면 그래픽 갱신,,
		this.repaint();
		this.revalidate();
		//레이블생성
		jl = new JLabel("Score",JLabel.CENTER);
		jl.setPreferredSize(new Dimension(60,25));
		jl.setBackground(new Color(0x00545966));
		jl.setOpaque(true);
		fp.add(jl);
	}
}
