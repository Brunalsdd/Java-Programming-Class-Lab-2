import javax.swing.JOptionPane;

public class LottoApp {

	public static void main(String[] args) 
	{
		//Strings for asking 2 questions: prompt strings
		
		for (int i = 0; i < 5; i++) 
		{
			
			String userInput = JOptionPane.showInputDialog(null, "Choose a number between 3 and 27");
			
			int aux = Integer.parseInt(userInput);
			
			Lotto lotto1 = new Lotto();
			
			int sum =  lotto1.getNumbers()[0] + lotto1.getNumbers()[1] + lotto1.getNumbers()[2];
			
			if(sum == aux) {
				JOptionPane.showInternalMessageDialog(null,"Congrats!" + "\nWinning number: " + sum + "\nChosen number: " + aux);
				break;
			}else {
				JOptionPane.showInternalMessageDialog(null,"Better luck next time!" + "\nWinning number: " + sum + "\nChosen number: " + aux);
			}  
		}
	}
}
