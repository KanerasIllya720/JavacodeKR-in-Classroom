package 음악재생;

import javafx.embed.swing.JFXPanel;

import java.awt.Color;

import javax.swing.JFrame;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main {     
    
    public static void main(String[] args)  {   
            
        JFXPanel panel = new JFXPanel();
                
        JFrame JF = new JFrame("BGM Test");
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setLocationRelativeTo(null);
        JF.setSize(300,300);
        JF.setLocationRelativeTo(null);
        JF.setVisible(true);  
        JF.getContentPane().setBackground(new Color(0x00000000));
        JF.setResizable(false);
        
        Media m = new Media("file:/g:/Koishi.mp3");
        MediaPlayer p = new MediaPlayer(m);
        p.play();
        p.setVolume(0.1);
        
    }
    
}