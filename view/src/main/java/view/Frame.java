package view;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements KeyListener {

	/** The initial frame size. */
	private static final int Width = 645; // largeur//
	private static final int Height = 384; // longueur//
	
	private int key;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6707285193480699195L;

	ConfigPanel pan = new ConfigPanel(this);

	public Frame() {
		super();

		myFrame();

	}

	
	/** Repaint the panel */
	
	/*private Thread paintWindow = new Thread() {
		@Override
		public void run() {
			while (true)
				pan.repaint();
		}
	};
	*/
	
	public void myFrame() {

		/*Style of the frame*/
		
		this.setTitle("coucou");
		this.setSize(Width, Height);
		
		/*Position*/
		this.setLocationRelativeTo(null);
		
		/*Behavior*/
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(pan);
		
		/*Make the frame visible*/
		this.setVisible(true);
		
		/*Add keyListener*/
		this.addKeyListener(this);
		
		/*Focus on the keyboard*/
		requestFocusInWindow();
		
		/* this.paintWindow.start(); */
		
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		setKey(e.getKeyCode());


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}
	
	
	/* THE SOUND */
	
	/*public static void playSound(String soundName, double volume) 
	{    
		AudioInputStream audioInputStream;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			FloatControl gainControl =  (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			float dB = (float) (Math.log(volume) / Math.log(10.0) * 20.0);
			gainControl.setValue(dB); // Reduce volume by 10 decibels.
			clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	
	
	
	
	

}


