package 테트리스;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard tb = new TetrisBoard();
		Random rand = new Random();
		tw.add(tb);
		
		tw.tb = tb;
		tb.tw = tw;
		
		tw.initialize();
		tw.drawTetrisBoard(tw.NextBlock, 3, 0);
		tw.NextBlock = rand.nextInt(7);
		tw.BlockNums = tw.NextBlock;
		
		tw.repaint();
		tw.revalidate();
	}

}
