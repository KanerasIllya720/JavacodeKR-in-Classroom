package RealPracCoding;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JLabel jl = new JLabel();
		jf.setSize(new Dimension(200, 200));
		jf.setTitle("test");
		jf.setPreferredSize(new Dimension(200, 200));
		jf.getContentPane().setBackground(new Color(0x00000000));
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(2);
		jf.setResizable(false);
		jf.add(jl);
		jl.setText("Test JLabel");
		jl.setVerticalAlignment(SwingConstants.CENTER);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(false);
		jl.setForeground(Color.WHITE);
	}
}
