import javax.swing.JOptionPane;

public class JavaApp {

	public static void main(String[] args) {
	
		double n1 = 1.5;
		double n2 = 1.3;
		double n3 = 10;
		int n5 = 1;
		int n6 = 2;
		
		double sum1 = Calculator.sum(n1, n2);
		double sum2 = Calculator.sum(n5, n6);
		double sum3 = Calculator.sum(n1, n2, n3);
		
		System.out.println("\n" + "First method result: " + sum1);
		System.out.println("Second method result: " + sum2);
		System.out.println("Thrird method result: " + sum3);
	}

}
