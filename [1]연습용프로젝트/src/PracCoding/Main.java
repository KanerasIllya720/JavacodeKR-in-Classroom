package PracCoding;

import java.util.Scanner;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		GameWindow gw = new GameWindow();
		new JFXPanel();
		Media m = new Media("file:/g:/UN.mp3");
	    MediaPlayer p = new MediaPlayer(m);
	    p.play();
		p.setVolume(0.1);
	}

}
