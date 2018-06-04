package view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	GamePanel game;
	
	public GamePanel(GameFrame game_p) {
		
	}
	
	/*
	public void paint(Graphics g) {
		  
		  super.paint(g);
		  g.clearRect(0,0, this.getWidth(), this.getHeight()); 
		  g.drawImage(getBackground(), 0, 0, game);
		  
		  for(String mp :map) {
			  switch(mp) {
			  case "x" : g.drawImage(Wall.getSprite(), fcd.getX(), fcd.getY(), wind);
			  fcd.addX(32);
			  break;
			  case "o": fcd.addX(32);
			  break;
			  case "^": fcd.setX(0); fcd.addY(32);
			  break;
			  case "v": g.drawImage(Wall.getSprite(), fcd.getX(), fcd.getY(), wind);  fcd.addX(32); 
			  break;
			  case "c": g.drawImage(Corner.getSprite(), fcd.getX(), fcd.getY(), wind);  fcd.addX(32); //System.out.println("sorti !");
			  break;
			  case "l": g.drawImage(getLorann(), fcd.getLX(), fcd.getLY(), wind);  fcd.addX(32);
			  break;
			  }
			  
		  }
		fcd.setY(0); fcd.setX(0); 
	  } */
}
