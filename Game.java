// Game class for CassMan game
// Alex Zimorino
// 3/10/18

package cassMan;

public class Game
{
	private int playerScore;
	private int highScore;
	private int second;
	private int third;
	
	private String playerName;
	private String highName;
	private String secondName;
	private String thirdName;
	
	private int[] level;
	
	private Player player = new Player();
	private Enemy enemy = new Enemy();
	
	
	private void setLevel()
	{
		
	}
	
	private int[] getLevel()
	{
		return level;
	}
	
	private String updateScores()
	{
		if (playerScore >= highScore)
		{
			third = second;
			second = highScore;
			highScore = playerScore;
									
			thirdName = secondName;
			secondName = highName;
			highName = playerName;
			
		}
		else if (playerScore >= second)
		{
			third = second;
			second = playerScore;
			
			thirdName = secondName;
			secondName = playerName;
			
		}
		else if (playerScore >= third)
		{
			third = playerScore;
			thirdName = playerName;
		}
		
		return ("<html><body><c><b><u>" + playerName + "'s Score</b></u><br>" + playerScore +
				"<br><br><b><u>High Scores</b></u>" +
				"<br>1. " + highName + " - " + highScore +
				"<br>2. " + secondName + " - " + second +
				"<br>3. " + thirdName + " - " + third + "</c></body></html>");
	}
}
