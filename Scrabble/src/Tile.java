import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Tile extends JLabel {
	private static final long serialVersionUID = 1L;
	private int xPosition, yPosition, points, multiplier, frequency;
	private char character;
	
	public Tile() {}
	
	public Tile(String text, int position) {
		super(text, position);
	}
	
	public Tile(char c, int points, int x, int y) {
		super("<html><span style=\"font-family:Arial;font-size:30px;\">" + c + "</span>" + points + "</html>", SwingConstants.CENTER);
		setOpaque(true);
		setBackground(new Color(255, 236, 193));
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setBounds(x, y, 57, 57);
	}
	
	public Tile(char c) {
		super("<html><span style=\"font-family:Arial;font-size:20px;\">" + c + "</span></html>", SwingConstants.CENTER);
		setOpaque(true);
		setBackground(new Color(255, 236, 193));
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setBounds(1, 1, 42, 41);
	}
	
	public Tile(char character, int points, int frequency) {
		this.setCharacter(character);
		this.points = points;
		this.setFrequency(frequency);
	}
	
	public void setBgColor(int r, int g, int b, int r2, int g2, int b2){
		setBackground(new Color(r, g, b));
		setForeground(new Color(r2, g2, b2));
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}
