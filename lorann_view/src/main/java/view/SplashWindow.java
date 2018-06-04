package view;

import javax.swing.JWindow;

public class SplashWindow extends JWindow{

	SettingPanel p = new SettingPanel();
	boolean splash;
	
	public SplashWindow() {
		super();
		
		build();
		close();
	}
	
	public void build() {
		setSize(500,500);
		setLocationRelativeTo(null);
		setContentPane(p.buildContentPanel(splash));
		//pack();
		setVisible(true);
		
	}
	
	public void close() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		GameDialog dialog = new GameDialog(p);
	}
}
