package 테트리스;

public class Main {

	public static void main(String[] args) {
		TetrisWindow tw = new TetrisWindow();
		TetrisBoard td = new TetrisBoard();
		tw.add(td);
		
		tw.repaint();
		tw.revalidate();
	}

}
