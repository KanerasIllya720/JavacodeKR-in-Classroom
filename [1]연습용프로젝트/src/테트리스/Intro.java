package 테트리스;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class Intro extends JDialog implements KeyListener {
	AudioInputStream ais;
	Clip clip;
	public Intro() {
		this.setModal(true);
		this.setSize(420, 600);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);

		addComponents();
		
		playSound("./sound/BGM_Tetris_Kalinka.wav");
		this.addKeyListener(this);
		this.requestFocus();
		
		this.setVisible(true);
	}

	private void addComponents() {
		JPanel jp = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				try {
					Image img = ImageIO.read(new File("./Image/Intro.png"));
					img = img.getScaledInstance(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
					g.drawImage(img, 0, 0, null);
				} catch (Exception e) {
				}
			}
		};
		this.add(jp);
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

	public void keyPressed(KeyEvent arg0) {
		removeKeyListener(this);
		clip.stop();
		dispose();
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}
