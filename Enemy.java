//Enemy class for CassMan
//Andrew Ammons
//3/10/18

package cassMan;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionListener;


public class Enemy
{
	
	private ArrayList<Integer> position = new ArrayList<Integer>();
	private String imagePath;
	private String name;
	private ActionListener move;

	public Enemy(String name,String imageString) 
	{
		this.name = name;
		this.imagePath = imageString;
	}

	public void move()
	{
	
	}

	public void setPosition(int x, int y)
	{
		position.add(y);
		position.add(y);
	
	}

	public int getPosition()
	{
		return position.get(0) + position.get(1);
	}

	public void setImagePath(String imagePath)
	{
		this.imagePath = imagePath;
	}

	public String getImagePath()
	{
		return imagePath;
	}

}