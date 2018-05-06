import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Dimension screenSize;
	
	public MainFrame() {
		initComponents();
	}
	
	public void initComponents() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setSize(screenSize.width, screenSize.height);
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/bg4.png")))));
			//getContentPane().setBackground(new Color(144, 205, 192));
		} catch (Exception e) {
			setBackground(new Color(255, 234, 108));
			e.printStackTrace();
		}
		pack();
		System.out.println(screenSize.width + " x " + screenSize.height);
	}
	
	public void addComponents() {}
}
