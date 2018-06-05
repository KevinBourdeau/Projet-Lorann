package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ConfigPanel extends JPanel  {

	JPanel panel = new JPanel();
	/*private String score;*/
	private int x = 0;
	private int y = 0;
	/*Image horizontal_bones;
	Image vertical_bones;
	Image corner_bones;
	Image lorann_b;*/
	Frame frame ;
	
	List list = new ArrayList();

	/**
     * Initiate the Panel
     */
	public ConfigPanel(){
		
	}
	
	/**
     * Initiate the Panel
     * @param score the score
     */
    /*public ConfigPanel( int score) {
        this.score = "SCORE : "+(new DecimalFormat("00000").format(score));
        this.setBackground(Color.BLACK);
    }*/
	
	/**
     * Initiate the Panel
     * @param Frame frm
     */
	
		public ConfigPanel(Frame frm) {
		// TODO Auto-generated constructor stub
			this.frame = frm;
			this.setBackground(Color.BLACK);
	}



		 /**
	     * Standard graphic from swing
	     * 
	     * @param Graphics g
	     */
		
		public void paint (Graphics g){
			super.paint(g);
			g.clearRect(0, 0, this.getWidth(), this.getHeight());
			System.out.println("SUPER");
			
			for (Object object : list) {
			int x = object.getPosX();
			
			int y = object.getPosY();
			
			Image image = object.getSprite();
			
			g.drawImage(image, x, y, frame);
			}
			
		}



			
		
		
		/*public void paintComponant(Graphics g ){
			super.paintComponent(g);
			
			/* Draw the score 
			 g.drawString("Score: "+this.score, 10, this.panel.getHeight()-8);
			 	Font fonte = new Font("Courier New",Font.BOLD,30);
		        g.setFont(fonte);
		        g.setColor(Color.WHITE);
		        g.drawString(score,10,this.getHeight()-10);*/
	       
		

	   /**
	    * This function register the score to draw
	    * @param score - the score to draw
	    */
			/*public int getScore() {
				return score;
			}

			public void setScore(int score) {
				this.score = score;
			}*/
			
			

			public List getList() {
				return list;
			}

			public void setList(List list) {
				this.list = list;
			}


		
}