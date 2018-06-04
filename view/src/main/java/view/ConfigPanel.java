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



public class ConfigPanel extends JPanel implements Observer {

	JPanel panel = new JPanel();
	private String score;
	private int x = 0;
	private int y = 0;
	Image horizontal_bones;
	Image vertical_bones;
	Image corner_bones;
	Image lorann_b;
	Frame frame ;
	
	List list = new ArrayList();
	
	String[] map = new String[] {"c", "x", "x", "x","x","x", "x", "x", "x","x","x", "x", "x", "x","x","x", "x", "x", "x","c","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","l","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","v"
            ,"o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","o","v","n","c",
            "x", "x", "x","x","x", "x", "x", "x","x","x", "x", "x", "x","x","x", "x", "x", "x","c"};

		
	public ConfigPanel(){
		
	}
	
	public ConfigPanel(int score){
		this.score = "SCORE : "+(new DecimalFormat("00000").format(score));
		
	}
	
		public ConfigPanel(Frame frm) {
		// TODO Auto-generated constructor stub
			this.frame = frm;
			
			try {
				this.horizontal_bones = ImageIO.read(this.getClass().getResourceAsStream("horizontal_bone.png"));
				this.vertical_bones = ImageIO.read(this.getClass().getResourceAsStream("vertical_bone.png"));
				this.corner_bones = ImageIO.read(this.getClass().getResourceAsStream("bone.png"));
				this.lorann_b = ImageIO.read(this.getClass().getResourceAsStream("lorann_b.png"));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setBackground(Color.BLACK);
	}



		
		
		public void paint (Graphics g){
			super.paint(g);
			
			System.out.println("SUPER");
			
			
			/*for (Object object : list) {
			int x = object.getPosX();
			
			int y = object.getPosY();
			
			Image image = object.getSprite();
			
			g.drawImage(image, x, y, frame);*/
			
			for(String test : map){
			switch (test){
			
			case "x" : g.drawImage(horizontal_bones, x , y, frame); x+=32;
			break;
			
			case "n" : x=0; y+=32; 
			break;
			
			case "c" : g.drawImage(corner_bones, x, y, frame); x+=32; 
			break;
			
			case "o" : x+=32; 
			break;
			
			case "v" : g.drawImage(vertical_bones, x , y, frame); x+=32;
			break;
			
			case "l" : g.drawImage(lorann_b, x, y, frame); x+=32;
			break;
			
			}
			/*this.setBackground(Color.BLUE);
			g.drawImage(lorann_b, x, y, frame); x+=0;*/
			
}
			
}
		
		
		public void update(Graphics g){
			/*super.update(g);
			this.setBackground(Color.BLUE);*/
			
			/*g.clearRect(0, 0, 32*20, 32*12);
			g.drawImage(lorann_b, x, x, frame); x+=32;*/
		}
		
		
		/*public void clearRect(Graphics g){
			
		}*/
			
		
		
		/*public void paintComponant(Graphics g ){
			super.paintComponent(g);
			
			/* Draw the score 
			 g.drawString("Score: "+this.score, 10, this.panel.getHeight()-8);
			 	Font fonte = new Font("Courier New",Font.BOLD,30);
		        g.setFont(fonte);
		        g.setColor(Color.WHITE);
		        g.drawString(score,10,this.getHeight()-10);*/
	       
		
		
		
		
	
	/*	public String getScore(){
			return this.score;
		}
	   /**
	    * This function register the score to draw
	    * @param score - the score to draw
	    */

		public void send_score(String score) {
		this.score="SCORE : "+score;
		
	}
		
	        @Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				
			}

			public String getScore() {
				return score;
			}

			public void setScore(String score) {
				this.score = score;
			}
			
			

			public List getList() {
				return list;
			}

			public void setList(List list) {
				this.list = list;
			}
		
		
}