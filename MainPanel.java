//mainpanel contains startgame and endgame panels, and draws game panel from game class

package cassMan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainPanel extends JPanel
{
	
	
	public MainPanel()
	{
		JPanel startPanel = new JPanel();
		JLabel tutorial = new JLabel();
		
		JButton start = new JButton();
		start.addActionListener(new StartListener());
		JPanel gamePanel = new JPanel();
		JPanel endPanel = new JPanel();
		
		
		add(startPanel);
		add(tutorial);
		add(start);
		add(gamePanel);
		
	}
	
	private class StartListener implements ActionListener
	{
		
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		
		}
	}
}