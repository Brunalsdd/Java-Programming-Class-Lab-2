import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import junit.framework.Test;

public class Lotto 
{
	//attributes
	private int numbers[];
	
	//constructors
	public Lotto() {
		Random randomNumber = new Random();
		int answer1 = randomNumber.nextInt(9)+1;
		
		int answer2 = randomNumber.nextInt(9)+1;
		
		int answer3 = randomNumber.nextInt(9)+1;
		
		int[] arrayNumbers = {answer1, answer2, answer3};
		
		this.numbers = arrayNumbers;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	//methods


}
