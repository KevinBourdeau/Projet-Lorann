package view;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame implements KeyListener {

	/** The initial frame size. */
	private static final int defaultFrameSizeWidth = 645; // largeur//
	private static final int defaultFrameSizeHeight = 384; // longueur//
	
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

	public void myFrame() {

		this.setTitle("coucou");
		this.setSize(defaultFrameSizeWidth, defaultFrameSizeHeight);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(pan);
		this.setVisible(true);
		this.addKeyListener(this);

	}

	/**
	 * This function register the score to draw
	 * 
	 * @param score
	 *            - the score to draw
	 */



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

	/*
	 * @Override public void keyTyped(KeyEvent e) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public void keyPressed(KeyEvent e) { int keyLetter =
	 * e.getKeyCode();
	 * 
	 * switch (keyLetter) { case KeyEvent.VK_UP: System.out.println("UP");
	 * break; case KeyEvent.VK_LEFT: System.out.println("LEFT");
	 * 
	 * break; case KeyEvent.VK_RIGHT: System.out.println("RIGHT"); break; case
	 * KeyEvent.VK_DOWN: System.out.println("DOWN"); break; case
	 * KeyEvent.VK_SPACE: System.out.println("SHOOT"); break; }
	 * controller.movePlayer(e);
	 * 
	 * }
	 */

	/*
	 * @Override public void keyReleased(KeyEvent e) { /*int keycode =
	 * e.getKeyCode();
	 * 
	 * if(keycode == KeyEvent.VK_UP){ pressedUp = false; } if(keycode ==
	 * KeyEvent.VK_LEFT){ pressedLeft = false; } if(keycode ==
	 * KeyEvent.VK_RIGHT){ pressedRight = false; } if(keycode ==
	 * KeyEvent.VK_DOWN){ pressedDown = false; } if (keycode ==
	 * KeyEvent.VK_SPACE){ pressedFire = false; }
	 * 
	 * }
	 */

}


