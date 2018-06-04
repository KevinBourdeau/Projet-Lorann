package view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ConfigPanel extends JPanel implements Observer {

	JPanel panel = new JPanel();
	JLabel label;
	JComboBox comboBox;
	Object[] elements = new Object[] {"Niveau 1", "Niveau 2", "Niveau 3", "Niveau 4","Niveau 5"};
	private String score;
	private int x = 0;
	private int y = 0;
	Image horizontal_bones;
	Image vertical_bones;
	Image corner_bones;
	Image lorann_b;
	Frame frame ;
	
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
	
	/*public ConfigPanel(int score){
		this.score = "SCORE : "+(new DecimalFormat("00000").format(score));
		
	}*/
	
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



		//***BuildContentPane***\\
		/*public JPanel buildContentPanel(Dialog dialog_p) { //Send the panel to the GameDialog
			this.dialog = dialog_p;
			JButton button = new JButton("Okay");
			panel.add(button);
			
			label = new JLabel("Welcome to the Lorann Game ! Choose a level");
			panel.add(label);
			
			comboBox = new JComboBox(elements);
			panel.add(comboBox);

		return panel;		
	}*/
	
	
		/*public JPanel buildContentPanel(Boolean splash) { //Send the panel to the SplashWindow
			
			panel.setLayout(null);
	
			JLabel picLabel = new JLabel(getSplashImg()); 
			panel.add(picLabel);
			
			return panel;
	}
		//***Getter***\\

		private String getSplashImg() {
			return null;
			
		}
		public JComboBox getComboBox() {
			return comboBox;
		}
		*/
		
		
		public void paint (Graphics g){
			super.paint(g);
			/* Draw the score */
			 /*g.drawString("Score: "+this.score, 10, this.panel.getHeight()-8);*/
			
			 
			System.out.println("SUPER");
			
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
			}
			
		}
		
		
		/*public void paintComponant(Graphics g, ){
			super.paintComponent(g);

	        for (int i = 0; x < truc.length; i++) {
		};*/
		
		
		/*public Image  AnimateLorann(){
			
			for(Image testLorann : loadLorann){
				switch (){
				
				
				
				
				
				}
				
				
				
			}
			
			
			
			
			repaint();
			
			return lorann_b;
			
		}*/
		
	
	/*	public String getScore(){
			return this.score;
		}
	   /**
	    * This function register the score to draw
	    * @param score - the score to draw
	    */

	/*public void send_score(String score) {
		this.score="SCORE : "+score;
		
	}*/
		
	        @Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				
			}
		
		
}