package 테트리스;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard tb = new TetrisBoard();
		Random rn = new Random();
		tw.add(tb);
		
		tw.tb = tb;
		tb.tw = tw;
		
		tw.initialize();
		tw.drawTetrisBoard(rn.nextInt(7), 3, 0);
		
		tw.repaint();
		tw.revalidate();
	}

}
