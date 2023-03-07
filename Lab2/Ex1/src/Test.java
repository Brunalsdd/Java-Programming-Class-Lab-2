import java.util.Random;

import javax.swing.JOptionPane;

public class Test 
{
	String prompt;
	String answer;
	
	public Test(String prompt, String answer)
	{
		this.prompt = prompt;
		this.answer = answer;
	}
	
	
	public static void takeTest(Test[] tests)
	{
		int score = 0;
		for(int i=0; i < tests.length; i++)
		{
			String keyboardInput = JOptionPane.showInputDialog(null, tests[i].prompt) ;
			String answer = keyboardInput;
			if (answer.equals(tests[i].answer))
			{
				String object = rightAnswerMessage();
				JOptionPane.showInternalMessageDialog(null, object);
				score++;
			}else 
			{
				String object = wrongAnswerMessage();
				JOptionPane.showInternalMessageDialog(null,object);
			}
		}
		double result = (Double.valueOf(score)/Double.valueOf(tests.length))*100;
		JOptionPane.showInternalMessageDialog(null, "\nYou scored " + score + "/" + tests.length + " and you result is " + result +"%");
	}
	
	// Right answers random messages.
	public static String rightAnswerMessage()
	{
		Random randomObject = new Random();
		String text = "";
		switch ( randomObject.nextInt( 4 ) )
		{
			case 0:
				text= "Excellent!" ;
				break;
			case 1:
				text= "Nice work!" ;
				break;
			case 2:
				text= "Keep up the good work!";
				break;
			case 3:
				text= "Very good!" ;
				break;
		
		}
		return text;
	}
	
	// Wrong answers random messages.
	public static String wrongAnswerMessage()
	{
		Random randomObject = new Random();
		String text = "";
		
		switch ( randomObject.nextInt( 4 ) )
		{
			case 0:
				text=  "No. Please try again.";
				break;
			case 1:
				text=  "Wrong. Try once more.";
				break;
			case 2:
				text=  "Don't give up!";
				break;
			case 3:
				text=  "No. Keep trying!";
				break;
		}
		return text;
	}
	
}


