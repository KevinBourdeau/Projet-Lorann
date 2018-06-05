package view;

import java.awt.event.WindowEvent;
import java.util.Observable;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

	
	/**
     * Instantiates a new view facade.
     */
    public ViewFacade() 
    {
    	 super(); 
    }
    
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    public final void displayMessage(final String message) 
    {
        JOptionPane.showMessageDialog(null, message);
        
    }

   

}
