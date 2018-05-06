import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuFrame extends MainFrame {
	private static final long serialVersionUID = 1L;
	private Board board;
	private JLabel scrabbleTitle;
	private JPanel playPanel, optionPanel, helpPanel, exitPanel;
	private Tile[] playTiles, optionTiles, helpTiles, exitTiles;
	
	public MenuFrame() {
		initialComponents();
		additionalComponents();
	}
	
	public void initialComponents() {
		setLayout(null);
		scrabbleTitle = new JLabel(new ImageIcon("images/header5.png"));
		scrabbleTitle.setBounds(90, 35, 450, 200);
		
		board = new Board();
		board.setBounds(630, 30, 700, 700);
		
		playPanel = new JPanel(null);
		playPanel.setBackground(new Color(0, 132, 122));
		
		playTiles = new Tile[4];
		playTiles[0] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">P</span>3</html>", SwingConstants.CENTER);
		playTiles[0].setOpaque(true);
		playTiles[0].setBackground(new Color(255, 236, 193));
		playTiles[0].setBounds(5, 5, 57, 57);
		
		playTiles[1] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">L</span>1</html>", SwingConstants.CENTER);
		playTiles[1].setOpaque(true);
		playTiles[1].setBackground(new Color(255, 236, 193));
		playTiles[1].setBounds(67, 5, 57, 57);
		
		playTiles[2] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">A</span>1</html>", SwingConstants.CENTER);
		playTiles[2].setOpaque(true);
		playTiles[2].setBackground(new Color(255, 236, 193));
		playTiles[2].setBounds(129, 5, 57, 57);
		
		playTiles[3] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">Y</span>4</html>", SwingConstants.CENTER);
		playTiles[3].setOpaque(true);
		playTiles[3].setBackground(new Color(255, 236, 193));
		playTiles[3].setBounds(191, 5, 57, 57);
		
		playPanel.setBounds(188, 280, 253, 67);
		playPanel.add(playTiles[0]);
		playPanel.add(playTiles[1]);
		playPanel.add(playTiles[2]);
		playPanel.add(playTiles[3]);
		
		optionPanel = new JPanel(null);
		optionPanel.setBackground(new Color(0, 132, 122));
		
		optionTiles = new Tile[6];
		optionTiles[0] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">O</span>1</html>", SwingConstants.CENTER);
		optionTiles[0].setOpaque(true);
		optionTiles[0].setBackground(new Color(255, 236, 193));
		optionTiles[0].setBounds(5, 5, 57, 57);
		
		optionTiles[1] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">P</span>3</html>", SwingConstants.CENTER);
		optionTiles[1].setOpaque(true);
		optionTiles[1].setBackground(new Color(255, 236, 193));
		optionTiles[1].setBounds(67, 5, 57, 57);
		
		optionTiles[2] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">T</span>1</html>", SwingConstants.CENTER);
		optionTiles[2].setOpaque(true);
		optionTiles[2].setBackground(new Color(255, 236, 193));
		optionTiles[2].setBounds(129, 5, 57, 57);
		
		optionTiles[3] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">I</span>1</html>", SwingConstants.CENTER);
		optionTiles[3].setOpaque(true);
		optionTiles[3].setBackground(new Color(255, 236, 193));
		optionTiles[3].setBounds(191, 5, 57, 57);
		
		optionTiles[4] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">O</span>1</html>", SwingConstants.CENTER);
		optionTiles[4].setOpaque(true);
		optionTiles[4].setBackground(new Color(255, 236, 193));
		optionTiles[4].setBounds(253, 5, 57, 57);
		
		optionTiles[5] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">N</span>1</html>", SwingConstants.CENTER);
		optionTiles[5].setOpaque(true);
		optionTiles[5].setBackground(new Color(255, 236, 193));
		optionTiles[5].setBounds(315, 5, 57, 57);
		
		optionPanel.setBounds(126, 377, 377, 67);
		optionPanel.add(optionTiles[0]);
		optionPanel.add(optionTiles[1]);
		optionPanel.add(optionTiles[2]);
		optionPanel.add(optionTiles[3]);
		optionPanel.add(optionTiles[4]);
		optionPanel.add(optionTiles[5]);
		
		helpPanel = new JPanel(null);
		helpPanel.setBackground(new Color(0, 132, 122));
		
		helpTiles = new Tile[4];
		helpTiles[0] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">H</span>4</html>", SwingConstants.CENTER);
		helpTiles[0].setOpaque(true);
		helpTiles[0].setBackground(new Color(255, 236, 193));
		helpTiles[0].setBounds(5, 5, 57, 57);
		
		helpTiles[1] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">E</span>1</html>", SwingConstants.CENTER);
		helpTiles[1].setOpaque(true);
		helpTiles[1].setBackground(new Color(255, 236, 193));
		helpTiles[1].setBounds(67, 5, 57, 57);
		
		helpTiles[2] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">L</span>1</html>", SwingConstants.CENTER);
		helpTiles[2].setOpaque(true);
		helpTiles[2].setBackground(new Color(255, 236, 193));
		helpTiles[2].setBounds(129, 5, 57, 57);
		
		helpTiles[3] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">P</span>3</html>", SwingConstants.CENTER);
		helpTiles[3].setOpaque(true);
		helpTiles[3].setBackground(new Color(255, 236, 193));
		helpTiles[3].setBounds(191, 5, 57, 57);
		
		helpPanel.setBounds(188, 474, 253, 67);
		helpPanel.add(helpTiles[0]);
		helpPanel.add(helpTiles[1]);
		helpPanel.add(helpTiles[2]);
		helpPanel.add(helpTiles[3]);
		
		exitPanel = new JPanel(null);
		exitPanel.setBackground(new Color(0, 132, 122));
		
		exitTiles = new Tile[4];
		exitTiles[0] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">E</span>1</html>", SwingConstants.CENTER);
		exitTiles[0].setOpaque(true);
		exitTiles[0].setBackground(new Color(255, 236, 193));
		exitTiles[0].setBounds(5, 5, 57, 57);
		
		exitTiles[1] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">X</span>8</html>", SwingConstants.CENTER);
		exitTiles[1].setOpaque(true);
		exitTiles[1].setBackground(new Color(255, 236, 193));
		exitTiles[1].setBounds(67, 5, 57, 57);
		
		exitTiles[2] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">I</span>1</html>", SwingConstants.CENTER);
		exitTiles[2].setOpaque(true);
		exitTiles[2].setBackground(new Color(255, 236, 193));
		exitTiles[2].setBounds(129, 5, 57, 57);
		
		exitTiles[3] = new Tile("<html><span style=\"font-family:Arial;font-size:30px;\">T</span>1</html>", SwingConstants.CENTER);
		exitTiles[3].setOpaque(true);
		exitTiles[3].setBackground(new Color(255, 236, 193));
		exitTiles[3].setBounds(191, 5, 57, 57);
		
		exitPanel.setBounds(188, 571, 253, 67);
		exitPanel.add(exitTiles[0]);
		exitPanel.add(exitTiles[1]);
		exitPanel.add(exitTiles[2]);
		exitPanel.add(exitTiles[3]);
	}
	
	public void additionalComponents() {
		add(scrabbleTitle);
		add(playPanel);
		add(optionPanel);
		add(helpPanel);
		add(exitPanel);
		add(board);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuFrame();
	}
}
