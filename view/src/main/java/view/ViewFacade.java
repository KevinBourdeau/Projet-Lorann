package view;

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

    /**
     * 
     */
	public int printMessage() 
	{
		return 0;
	}

	/**
	 * 
	 */
	public void update(Observable arg0, Object arg1) 
	{
		
	}

	/**
	 * 
	 */
	public void setElements(char[][] elements) 
	{
		
	}

	/**
	 * 
	 */
	public void newLevel() 
	{
		
	}



}
