package view;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class GameDialog extends JDialog{

	SettingPanel p;
	
	public GameDialog(SettingPanel p_p) {
		super();
		
		this.p = p_p;
		
		build();
	}
	
	public void build() {
		setTitle("Lorann 2.0");
		setSize(300,100);
		setLocationRelativeTo(null); //Centre la fenêtre au milieu
		setResizable(false); //On interdit le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Quand on clique la croix l'appli se ferme
		setContentPane(p.buildContentPanel(this));
		setVisible(true);
	}
}
