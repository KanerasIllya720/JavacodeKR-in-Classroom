package 음악재생;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class MusicPlayer implements ActionListener {
	JButton[] OrButton = new JButton[4];
    String[] ButtonName = { "시작", "변경", "정지", "중단" };
	MusicPlayer(){
		JFrame JF = new JFrame("Music Player");
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setLocationRelativeTo(null);
        JF.setSize(500,140);
        JF.setLocationRelativeTo(null);
        JF.setVisible(true);  
        JF.getContentPane().setBackground(new Color(0x00000000));
        JF.setResizable(true);
        JF.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        new JFXPanel();
        
		for (int i = 0; i < ButtonName.length; i++) {
			OrButton[i] = new JButton(ButtonName[i]);
			JF.add(OrButton[i]);
			OrButton[i].setPreferredSize(new Dimension(120, 50));
		}
		
        
        //음악재생 메소드
		Media m = new Media("file:/g:/UN.mp3");
	    MediaPlayer p = new MediaPlayer(m);
	    p.play();
		p.setVolume(0.1);
	}
	public void actionPerformed(ActionEvent act) {
		JButton jb = (JButton)act.getSource();
		if (jb.getText().equals("시작")) {
			JOptionPane.showMessageDialog(null,"감지됨");
		}
		else if (jb.getText().equals("변경")) {
			
		} 
		else if (jb.getText().equals("정지")) {
			
		}	
		else if (jb.getText().equals("중단")) {
			
		}
	}
}
