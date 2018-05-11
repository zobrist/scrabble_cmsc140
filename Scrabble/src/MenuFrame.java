import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class MenuFrame extends MainFrame implements MouseListener {
	private static final long serialVersionUID = 1L;
	private Board board;
	private JLabel scrabbleTitle;
	private JPanel playPanel, optionPanel, helpPanel, exitPanel;
	private Tile[] playTiles, optionTiles, helpTiles, exitTiles;
	private boolean inPlay, inOption, inHelp, inExit;
	
	public MenuFrame() {
		initialComponents();
		additionalComponents();
	}
	
	public void initialComponents() {
		setLayout(null);
		scrabbleTitle = new JLabel(new ImageIcon("images/header4.png"));
		scrabbleTitle.setBounds(90, 35, 450, 200);
		
		board = new Board();
		board.setBounds(630, 30, 700, 700);
		
		playPanel = new JPanel(null);
		playPanel.setBackground(new Color(0, 132, 122));
		playPanel.setBounds(188, 280, 253, 67);
		playPanel.addMouseListener(this);
		
		playTiles = new Tile[4];
		playTiles[0] = new Tile('P', 3, 5, 5);
		playTiles[1] = new Tile('L', 1, 67, 5);
		playTiles[2] = new Tile('A', 1, 129, 5);
		playTiles[3] = new Tile('Y', 4, 191, 5);
		
		playPanel.add(playTiles[0]);
		playPanel.add(playTiles[1]);
		playPanel.add(playTiles[2]);
		playPanel.add(playTiles[3]);
		
		optionPanel = new JPanel(null);
		optionPanel.setBackground(new Color(0, 132, 122));
		optionPanel.setBounds(126, 377, 377, 67);
		optionPanel.addMouseListener(this);
		
		optionTiles = new Tile[6];
		optionTiles[0] = new Tile('O', 1, 5, 5);
		optionTiles[1] = new Tile('P', 3, 67, 5);
		optionTiles[2] = new Tile('T', 1, 129, 5);
		optionTiles[3] = new Tile('I', 1, 191, 5);
		optionTiles[4] = new Tile('O', 1, 253, 5);
		optionTiles[5] = new Tile('N', 1, 315, 5);
		
		optionPanel.add(optionTiles[0]);
		optionPanel.add(optionTiles[1]);
		optionPanel.add(optionTiles[2]);
		optionPanel.add(optionTiles[3]);
		optionPanel.add(optionTiles[4]);
		optionPanel.add(optionTiles[5]);
		
		helpPanel = new JPanel(null);
		helpPanel.setBackground(new Color(0, 132, 122));
		helpPanel.setBounds(188, 474, 253, 67);
		helpPanel.addMouseListener(this);
		
		helpTiles = new Tile[4];
		helpTiles[0] = new Tile('H', 4, 5, 5);
		helpTiles[1] = new Tile('E', 1, 67, 5);
		helpTiles[2] = new Tile('L', 1, 129, 5);
		helpTiles[3] = new Tile('P', 3, 191, 5);

		helpPanel.add(helpTiles[0]);
		helpPanel.add(helpTiles[1]);
		helpPanel.add(helpTiles[2]);
		helpPanel.add(helpTiles[3]);
		
		exitPanel = new JPanel(null);
		exitPanel.setBackground(new Color(0, 132, 122));
		exitPanel.setBounds(188, 571, 253, 67);
		exitPanel.addMouseListener(this);
		
		exitTiles = new Tile[4];
		exitTiles[0] = new Tile('E', 1, 5, 5);
		exitTiles[1] = new Tile('X', 8, 67, 5);
		exitTiles[2] = new Tile('I', 1, 129, 5);
		exitTiles[3] = new Tile('T', 1, 191, 5);
		
		exitPanel.add(exitTiles[0]);
		exitPanel.add(exitTiles[1]);
		exitPanel.add(exitTiles[2]);
		exitPanel.add(exitTiles[3]);
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				board.blocks[i][j].addMouseListener(this);
			}
		}
	}
	
	public void additionalComponents() {
		add(scrabbleTitle);
		add(playPanel);
		add(optionPanel);
		add(helpPanel);
		add(exitPanel);
		add(board);
		entranceText();
		//playText();
		//optionText();
		//exitText();
		//inviteText();
		//invite2Text();
		//joinText();
		setVisible(true);
	}
	
	public void entranceText() {
		Tile w = new Tile('W');
		Tile e = new Tile('E');
		Tile l = new Tile('L');
		Tile c = new Tile('C');
		Tile o = new Tile('O');
		Tile m = new Tile('M');
		Tile e2 = new Tile('E');

		Tile a = new Tile('A');
		Tile n = new Tile('N');
		Tile d = new Tile('D');
		
		Tile e3 = new Tile('E');
		Tile n2 = new Tile('N');
		Tile j = new Tile('J');
		Tile o2 = new Tile('O');
		Tile y = new Tile('Y');
		
		Tile s = new Tile('S');
		Tile c2 = new Tile('C');
		Tile r = new Tile('R');
		Tile a2 = new Tile('A');
		Tile b = new Tile('B');
		Tile b2 = new Tile('B');
		Tile l2 = new Tile('L');
		Tile e4 = new Tile('E');
		Tile b3 = new Tile('!');
		
		board.blocks[4][4].add(w);
		board.blocks[4][5].add(e);
		board.blocks[4][6].add(l);
		board.blocks[4][7].add(c);
		board.blocks[4][8].add(o);
		board.blocks[4][9].add(m);
		board.blocks[4][10].add(e2);
		
		board.blocks[6][6].add(a);
		board.blocks[6][7].add(n);
		board.blocks[6][8].add(d);
		
		board.blocks[8][5].add(e3);
		board.blocks[8][6].add(n2);
		board.blocks[8][7].add(j);
		board.blocks[8][8].add(o2);
		board.blocks[8][9].add(y);
		
		board.blocks[10][3].add(s);
		board.blocks[10][4].add(c2);
		board.blocks[10][5].add(r);
		board.blocks[10][6].add(a2);
		board.blocks[10][7].add(b);
		board.blocks[10][8].add(b2);
		board.blocks[10][9].add(l2);
		board.blocks[10][10].add(e4);
		board.blocks[10][11].add(b3);
	}
	
	public void playText() {
		Tile c = new Tile('C');
		Tile h = new Tile('H');
		Tile o = new Tile('O');
		Tile o2 = new Tile('O');
		Tile s = new Tile('S');
		Tile e = new Tile('E');
		
		Tile j = new Tile('J');
		Tile o3 = new Tile('O');
		Tile i = new Tile('I');
		Tile n = new Tile('N');
		
		Tile i2 = new Tile('I');
		Tile n2 = new Tile('N');
		Tile v = new Tile('V');
		Tile i3 = new Tile('I');
		Tile t = new Tile('T');
		Tile e2 = new Tile('E');
		
		board.blocks[5][4].add(c);
		board.blocks[5][5].add(h);
		board.blocks[5][6].add(o);
		board.blocks[5][7].add(o2);
		board.blocks[5][8].add(s);
		board.blocks[5][9].add(e);
		
		board.blocks[7][5].add(j);
		board.blocks[7][6].add(o3);
		board.blocks[7][7].add(i);
		board.blocks[7][8].add(n);
		
		board.blocks[9][4].add(i2);
		board.blocks[9][5].add(n2);
		board.blocks[9][6].add(v);
		board.blocks[9][7].add(i3);
		board.blocks[9][8].add(t);
		board.blocks[9][9].add(e2);
	}
	
	public void optionText() {
		Tile m = new Tile('M');
		Tile u = new Tile('U');
		Tile s = new Tile('S');
		Tile i = new Tile('I');
		Tile c = new Tile('C');
		
		Tile o = new Tile('O');
		Tile n = new Tile('N');
		
		Tile o2 = new Tile('O');
		Tile f = new Tile('F');
		Tile f2 = new Tile('F');
		
		Tile s2 = new Tile('S');
		Tile o3 = new Tile('O');
		Tile u2 = new Tile('U');
		Tile n2 = new Tile('N');
		Tile d = new Tile('D');
		
		Tile o4 = new Tile('O');
		Tile n3 = new Tile('N');
		
		Tile o5 = new Tile('O');
		Tile f3 = new Tile('F');
		Tile f4 = new Tile('F');
		
		board.blocks[6][1].add(m);
		board.blocks[6][2].add(u);
		board.blocks[6][3].add(s);
		board.blocks[6][4].add(i);
		board.blocks[6][5].add(c);
		
		board.blocks[6][8].add(o);
		board.blocks[6][9].add(n);
		
		board.blocks[6][11].add(o2);
		board.blocks[6][12].add(f);
		board.blocks[6][13].add(f2);
		
		board.blocks[8][1].add(s2);
		board.blocks[8][2].add(o3);
		board.blocks[8][3].add(u2);
		board.blocks[8][4].add(n2);
		board.blocks[8][5].add(d);
		
		board.blocks[8][8].add(o4);
		board.blocks[8][9].add(n3);
		
		board.blocks[8][11].add(o5);
		board.blocks[8][12].add(f3);
		board.blocks[8][13].add(f4);
	}
	
	public void helpText() {}
	
	public void exitText() {
		Tile a = new Tile('A');
		Tile r = new Tile('R');
		Tile e = new Tile('E');
		
		Tile y = new Tile('Y');
		Tile o = new Tile('O');
		Tile u = new Tile('U');
		
		Tile s = new Tile('S');
		Tile u2 = new Tile('U');
		Tile r2 = new Tile('R');
		Tile e2 = new Tile('E');
		Tile q = new Tile('?');
		
		Tile y2 = new Tile('Y');
		Tile e3 = new Tile('E');
		Tile s2 = new Tile('S');
		
		Tile n = new Tile('N');
		Tile o2 = new Tile('O');
		
		board.blocks[6][1].add(a);
		board.blocks[6][2].add(r);
		board.blocks[6][3].add(e);
		
		board.blocks[6][5].add(y);
		board.blocks[6][6].add(o);
		board.blocks[6][7].add(u);
		
		board.blocks[6][9].add(s);
		board.blocks[6][10].add(u2);
		board.blocks[6][11].add(r2);
		board.blocks[6][12].add(e2);
		board.blocks[6][13].add(q);
		
		board.blocks[8][4].add(y2);
		board.blocks[8][5].add(e3);
		board.blocks[8][6].add(s2);
		
		board.blocks[8][8].add(n);
		board.blocks[8][9].add(o2);
	}
	
	public void inviteText() {
		Tile h = new Tile('H');
		Tile o = new Tile('O');
		Tile w = new Tile('W');
		
		Tile m = new Tile('M');
		Tile a = new Tile('A');
		Tile n = new Tile('N');
		Tile y = new Tile('Y');
		
		Tile p = new Tile('P');
		Tile l = new Tile('L');
		Tile a2 = new Tile('A');
		Tile y2 = new Tile('Y');
		Tile e = new Tile('E');
		Tile r = new Tile('R');
		Tile s = new Tile('S');
		Tile q = new Tile('?');
		
		Tile o2 = new Tile('1');
		
		Tile t = new Tile('2');
		
		Tile t2 = new Tile('3');
		
		board.blocks[3][3].add(h);
		board.blocks[3][4].add(o);
		board.blocks[3][5].add(w);
		
		board.blocks[3][7].add(m);
		board.blocks[3][8].add(a);
		board.blocks[3][9].add(n);
		board.blocks[3][10].add(y);
		
		board.blocks[5][3].add(p);
		board.blocks[5][4].add(l);
		board.blocks[5][5].add(a2);
		board.blocks[5][6].add(y2);
		board.blocks[5][7].add(e);
		board.blocks[5][8].add(r);
		board.blocks[5][9].add(s);
		board.blocks[5][10].add(q);
		
		board.blocks[7][7].add(o2);
		
		board.blocks[9][7].add(t);
		
		board.blocks[11][7].add(t2);
	}
	
	public void invite2Text() {
		Tile w = new Tile('W');
		Tile a = new Tile('A');
		Tile i = new Tile('I');
		Tile t = new Tile('T');
		Tile i2 = new Tile('I');
		Tile n = new Tile('N');
		Tile g = new Tile('G');
		
		Tile c = new Tile('C');
		Tile o = new Tile('O');
		Tile n2 = new Tile('N');
		Tile n3 = new Tile('N');
		Tile e = new Tile('E');
		Tile c2 = new Tile('C');
		Tile t2 = new Tile('T');
		Tile i3 = new Tile('I');
		Tile o2 = new Tile('O');
		Tile n4 = new Tile('N');
		Tile s = new Tile('S');
		
		Tile u = new Tile('U');
		Tile s2 = new Tile('S');
		Tile e2 = new Tile('E');
		Tile r = new Tile('R');
		Tile n5 = new Tile('N');
		Tile a2 = new Tile('A');
		Tile m = new Tile('M');
		Tile e3 = new Tile('E');
		
		Tile n6 = new Tile('N');
		Tile i4 = new Tile('I');
		Tile k = new Tile('K');
		Tile k2 = new Tile('K');
		Tile a3 = new Tile('A');
		
		board.blocks[4][4].add(w);
		board.blocks[4][5].add(a);
		board.blocks[4][6].add(i);
		board.blocks[4][7].add(t);
		board.blocks[4][8].add(i2);
		board.blocks[4][9].add(n);
		board.blocks[4][10].add(g);
		
		board.blocks[6][2].add(c);
		board.blocks[6][3].add(o);
		board.blocks[6][4].add(n2);
		board.blocks[6][5].add(n3);
		board.blocks[6][6].add(e);
		board.blocks[6][7].add(c2);
		board.blocks[6][8].add(t2);
		board.blocks[6][9].add(i3);
		board.blocks[6][10].add(o2);
		board.blocks[6][11].add(n4);
		board.blocks[6][12].add(s);
		
		board.blocks[8][3].add(u);
		board.blocks[8][4].add(s2);
		board.blocks[8][5].add(e2);
		board.blocks[8][6].add(r);
		board.blocks[8][7].add(n5);
		board.blocks[8][8].add(a2);
		board.blocks[8][9].add(m);
		board.blocks[8][10].add(e3);
		
		board.blocks[10][5].add(n6);
		board.blocks[10][6].add(i4);
		board.blocks[10][7].add(k);
		board.blocks[10][8].add(k2);
		board.blocks[10][9].add(a3);
	}
	
	public void joinText() {
		Tile s = new Tile('S');
		Tile e = new Tile('E');
		Tile r = new Tile('R');
		Tile v = new Tile('V');
		Tile e2 = new Tile('E');
		Tile r2 = new Tile('R');
		
		Tile i = new Tile('I');
		Tile p = new Tile('P');
		
		Tile a = new Tile('A');
		Tile d = new Tile('D');
		Tile d2 = new Tile('D');
		Tile r3 = new Tile('R');
		Tile e3 = new Tile('E');
		Tile s2 = new Tile('S');
		Tile s3 = new Tile('S');
		
		Tile ip = new Tile('2');
		Tile ip2 = new Tile('5');
		Tile ip3 = new Tile('5');
		Tile ip4 = new Tile('.');
		Tile ip5 = new Tile('2');
		Tile ip6 = new Tile('5');
		Tile ip7 = new Tile('5');
		Tile ip8 = new Tile('.');
		Tile ip9 = new Tile('2');
		Tile ip10 = new Tile('5');
		Tile ip11 = new Tile('5');
		Tile ip12 = new Tile('.');
		Tile ip13 = new Tile('2');
		Tile ip14 = new Tile('5');
		Tile ip15 = new Tile('5');
		
		Tile u = new Tile('U');
		Tile s4 = new Tile('S');
		Tile e4 = new Tile('E');
		Tile r4 = new Tile('R');
		Tile n = new Tile('N');
		Tile a2 = new Tile('A');
		Tile m = new Tile('M');
		Tile e5 = new Tile('E');
		
		Tile n2 = new Tile('N');
		Tile i2 = new Tile('I');
		Tile k = new Tile('K');
		Tile k2 = new Tile('K');
		Tile a3 = new Tile('A');
		
		Tile c = new Tile('C');
		Tile o = new Tile('O');
		Tile n3 = new Tile('N');
		Tile t = new Tile('T');
		Tile i3 = new Tile('I');
		Tile n4 = new Tile('N');
		Tile u2 = new Tile('U');
		Tile e6 = new Tile('E');
		
		board.blocks[2][4].add(s);
		board.blocks[2][5].add(e);
		board.blocks[2][6].add(r);
		board.blocks[2][7].add(v);
		board.blocks[2][8].add(e2);
		board.blocks[2][9].add(r2);
		
		board.blocks[3][2].add(i);
		board.blocks[3][3].add(p);
		
		board.blocks[3][5].add(a);
		board.blocks[3][6].add(d);
		board.blocks[3][7].add(d2);
		board.blocks[3][8].add(r3);
		board.blocks[3][9].add(e3);
		board.blocks[3][10].add(s2);
		board.blocks[3][11].add(s3);
		
		board.blocks[5][0].add(ip);
		board.blocks[5][1].add(ip2);
		board.blocks[5][2].add(ip3);
		board.blocks[5][3].add(ip4);
		board.blocks[5][4].add(ip5);
		board.blocks[5][5].add(ip6);
		board.blocks[5][6].add(ip7);
		board.blocks[5][7].add(ip8);
		board.blocks[5][8].add(ip9);
		board.blocks[5][9].add(ip10);
		board.blocks[5][10].add(ip11);
		board.blocks[5][11].add(ip12);
		board.blocks[5][12].add(ip13);
		board.blocks[5][13].add(ip14);
		board.blocks[5][14].add(ip15);
		
		board.blocks[7][3].add(u);
		board.blocks[7][4].add(s4);
		board.blocks[7][5].add(e4);
		board.blocks[7][6].add(r4);
		board.blocks[7][7].add(n);
		board.blocks[7][8].add(a2);
		board.blocks[7][9].add(m);
		board.blocks[7][10].add(e5);
		
		board.blocks[9][5].add(n2);
		board.blocks[9][6].add(i2);
		board.blocks[9][7].add(k);
		board.blocks[9][8].add(k2);
		board.blocks[9][9].add(a3);
		
		board.blocks[11][3].add(c);
		board.blocks[11][4].add(o);
		board.blocks[11][5].add(n3);
		board.blocks[11][6].add(t);
		board.blocks[11][7].add(i3);
		board.blocks[11][8].add(n4);
		board.blocks[11][9].add(u2);
		board.blocks[11][10].add(e6);
	}
	
	public static void main(String[] args) {
		new MenuFrame();
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource() == playPanel){
			board.removeComponents();
			playText();
			inPlay = true;
			inOption = false;
			inHelp = false;
			inExit = false;
		}else if(event.getSource() == optionPanel){
			board.removeComponents();
			optionText();
			inOption = true;
			inPlay = false;
			inHelp = false;
			inExit = false;
		}else if(event.getSource() == helpPanel){
			board.removeComponents();
			helpText();
			inHelp = true;
			inPlay = false;
			inOption = false;
			inExit = false;
		}else if(event.getSource() == exitPanel){
			board.removeComponents();
			exitText();
			inExit = true;
			inPlay = false;
			inOption = false;
			inHelp = false;
		}
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		if(event.getSource() == playPanel){
			for(int i = 0; i < playTiles.length; i++){
				playTiles[i].setBgColor(0, 0, 255, 255, 255, 0);
			}
			playPanel.setBackground(new Color(255, 236, 193));
		}else if(event.getSource() == optionPanel){
			for(int i = 0; i < optionTiles.length; i++){
				optionTiles[i].setBgColor(0, 0, 255, 255, 255, 0);
			}
			optionPanel.setBackground(new Color(255, 236, 193));
		}else if(event.getSource() == helpPanel){
			for(int i = 0; i < helpTiles.length; i++){
				helpTiles[i].setBgColor(0, 0, 255, 255, 255, 0);
			}
			helpPanel.setBackground(new Color(255, 236, 193));
		}else if(event.getSource() == exitPanel){
			for(int i = 0; i < exitTiles.length; i++){
				exitTiles[i].setBgColor(0, 0, 255, 255, 255, 0);
			}
			exitPanel.setBackground(new Color(255, 236, 193));
		}
		
		if((event.getSource() == board.blocks[7][5] || event.getSource() == board.blocks[7][6] || event.getSource() == board.blocks[7][7] ||
				event.getSource() == board.blocks[7][8]) && inPlay) {
			System.out.println("count: " + board.blocks[7][5].getComponentCount());
		}
	}

	@Override
	public void mouseExited(MouseEvent event) {
		if(event.getSource() == playPanel){
			for(int i = 0; i < playTiles.length; i++){
				playTiles[i].setBgColor(255, 236, 193, 0, 0, 0);
			}
			playPanel.setBackground(new Color(0, 132, 122));
		}else if(event.getSource() == optionPanel){
			for(int i = 0; i < optionTiles.length; i++){
				optionTiles[i].setBgColor(255, 236, 193, 0, 0, 0);
			}
			optionPanel.setBackground(new Color(0, 132, 122));
		}else if(event.getSource() == helpPanel){
			for(int i = 0; i < helpTiles.length; i++){
				helpTiles[i].setBgColor(255, 236, 193, 0, 0, 0);
			}
			helpPanel.setBackground(new Color(0, 132, 122));
		}else if(event.getSource() == exitPanel){
			for(int i = 0; i < exitTiles.length; i++){
				exitTiles[i].setBgColor(255, 236, 193, 0, 0, 0);
			}
			exitPanel.setBackground(new Color(0, 132, 122));
		}
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
}
