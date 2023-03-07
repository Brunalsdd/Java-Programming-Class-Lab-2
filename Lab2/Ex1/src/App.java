import javax.swing.JOptionPane;

public class App
{
	public static void main(String[] args)
	{
		//Strings for asking 2 questions: prompt strings
		String q1 = "1- Which of the following editions of Java contains the capabilities to provide an API and runtime environment for developing and running large-scale, multi-tiered, scalable, reliable, and secure network applications?\r\n"
				+ "\n" + "(a) Java Enterprise Edition 2 (Java 2 EE) \n(b) Java Micro Edition (Java ME) \n(c) Java Enterprise Edition (Java EE)*\n(d) Java Standard Edition 8 (Java SE 8)\n";
		String q2 = "2- What allows a class to have references to objects of other classes as data members?\n" + "(a) Composition* \n(b) Inheritance \n(c) Filds \n(d) Brackets\n";
		String q3 = "3- What type of method does not need an object to be called?\n" + "(a) Public \n(b) Private \n(c) Static*\n (d) toString\n";
		String q4 = "4- What is a class?\n" + "(a) A collection of default constructor \n(b) A collection of methodos \n(c) A collection of modifiers  \n(d) A collection of related objects\n*";
		String q5 = "5- What is an array object?\n" + "(a) a collection of classes. \n(b) a collection of data structures.* \n(c) a collection of methods. \n(d) non of the above";
		//array of questions
		Test[] tests= {
		new Test(q1, "c"),
		new Test(q2, "a"),
		new Test(q3, "c"),
		new Test(q4, "d"),
		new Test(q5, "b")
		};
		Test.takeTest(tests);
	}
	
	
	
}
