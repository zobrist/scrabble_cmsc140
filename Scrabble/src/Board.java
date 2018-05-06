import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Board extends JPanel{
	private JPanel[][] blocks = new JPanel[15][15];
	private int[][] TW = {{0, 0}, {0, 7}, {0, 14}, {7, 0}, {7, 14}, {14, 0}, {14, 7}, {14, 14}};
	private int[][] DW = {{1, 1}, {1, 13}, {2, 2}, {2, 12}, {3, 3}, {3, 11}, {4, 4}, {4, 10}, {10, 4}, {10, 10},
			{11, 3}, {11, 11}, {12, 2}, {12, 12}, {13, 1}, {13, 13}};
	private int[][] DL = {{0, 3}, {0, 11}, {2, 6}, {2, 8}, {3, 0}, {3, 7}, {3, 14}, {6, 2}, {6, 6}, {6, 8},
			{6, 12}, {7, 3}, {7, 11}, {8, 2}, {8, 6}, {8, 8}, {8, 12}, {11, 0}, {11, 7}, {11, 14}, {12, 6},
			{12, 8}, {14, 3}, {14, 11}};
	private int[][] TL = {{1, 5}, {1,9}, {5, 1}, {5, 5}, {5, 9}, {5, 13}, {9, 1}, {9, 5}, {9, 9}, {9, 13},
			{13, 5}, {13, 9}};
	
	public Board() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(700, 700);
		setLayout(new GridLayout(15,15,3,3));
		setBackground(new Color(144, 205, 192));  //color 1
		// setBackground(new Color(237, 248, 254, 200)); color 2
		// setBackground(new Color(35, 38, 48, 200)); //color 3
		// setBackground(new Color(144, 205, 192, 200)); //color 4
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		int twCounter = 0, tlCounter = 0, dwCounter = 0, dlCounter = 0;
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				blocks[i][j] = new JPanel();
				//blocks[i][j] = new JLabel("A", SwingConstants.CENTER);
				//blocks[i][j].setFont(new Font("Californian FB Bold", Font.PLAIN, 15));
				blocks[i][j].setOpaque(true);
				if(twCounter < TW.length && i == TW[twCounter][0] && j == TW[twCounter][1]) {
					blocks[i][j].setBackground(new Color(231, 0, 41)); //color 1
					twCounter++;
				} else if(tlCounter < TL.length && i == TL[tlCounter][0] && j == TL[tlCounter][1]) {
					blocks[i][j].setBackground(new Color(0, 155, 208)); //color 1
					tlCounter++;
				} else if(dwCounter < DW.length && i == DW[dwCounter][0] && j == DW[dwCounter][1]) {
					blocks[i][j].setBackground(new Color(255, 137, 102)); //color 1
					dwCounter++;
				} else if(dlCounter < DL.length && i == DL[dlCounter][0] && j == DL[dlCounter][1]) {
					blocks[i][j].setBackground(new Color(110, 194, 233)); //color 1
					dlCounter++;
				} else if(i == 7 && j == 7) {
					blocks[i][j].setBackground(new Color(240, 249, 2)); //color 1
				} else {
					blocks[i][j].setBackground(new Color(0, 132, 122)); //color 1
				}
				// blocks[i][j].setBackground(new Color(214, 211, 206)); color 2
				// blocks[i][j].setBackground(new Color(47, 50, 57)); //color 3
				// blocks[i][j].setBackground(new Color(0, 132, 122)); //color 4
				add(blocks[i][j]);
			}
		}
	}
}
