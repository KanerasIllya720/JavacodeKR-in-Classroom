package 테트리스;

public class Main {

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard tb = new TetrisBoard();
		tw.add(tb);
		
		tw.tb = tb;
		tb.tw = tw;
		
		tw.initialize();
		tw.drawTetrisBoard(0, 3, 0);
		
		tw.repaint();
		tw.revalidate();
	}

}
