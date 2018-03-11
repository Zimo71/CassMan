package cassMan;
//driver class for CassMan

import javax.swing.*;
import java.awt.*;


public class driver
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainPanel gamePanel = new MainPanel();
		frame.getContentPane().add(gamePanel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}