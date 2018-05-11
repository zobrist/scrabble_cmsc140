import java.util.ArrayList;
import java.util.Random;

public class Pouch {
	private char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
	private int[] frequency = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6,
			4, 2, 2, 1, 2, 1, 2};
	private int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 
			4, 4, 8, 4, 10, 0};
	private ArrayList<Tile> list = new ArrayList<Tile>();
	
	public Pouch() {
		for(int i = 0; i < letter.length; i++) {
			list.add(new Tile(letter[i], points[i], frequency[i]));
		}
	}
	
	public char[] getChars(int num) {
		Random rand = new Random();
		char[] choosen = new char[num];
		int index;
		Tile tile;
		
		for(int i = 0; i < num; i++) {
			if(!isEmpty()) {
				index = rand.nextInt(list.size()-1);
				tile = list.get(index);
				tile.setFrequency(tile.getFrequency() - 1);
				choosen[i] = tile.getCharacter();
				
				if(tile.getFrequency() == 0)
					list.remove(index);
			} else {
				break;
			}

		}
		
		return choosen;
	}
	
	public boolean isEmpty() {
		return list.size() < 0 ? true : false;
	}
}
