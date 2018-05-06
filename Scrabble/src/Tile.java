import javax.swing.JLabel;

public class Tile extends JLabel {
	private static final long serialVersionUID = 1L;
	private int xPosition, yPosition, points, multiplier;
	
	public Tile() {}
	
	public Tile(String text, int position) {
		super(text, position);
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
}
