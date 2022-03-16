/*  CPSC 233 
The UserInterface class creates main menu and takes in user input to acess certain features 
The user is limited to using strings for cases, if they use something else like a number 
 the program will continue to ask for chracters 
*/

import java.util.Scanner;

public class UserInterface
{
	private Scanner in; 
	private boolean done;
	private Manager aManager;

public UserInterface ()     
{
	in = new Scanner(System.in);
	done = false; 
	aManager = new Manager();
	aManager.initialGrade();
}
//method does not take any parameter, returns(void), mainly shows menu to user
public void displayMenu ()   
{
	System.out.println("(a)verage grade ");
	System.out.println("(d)isplay grades ");
	System.out.println("(h)ighest grade ");
	System.out.println("(l)owest grade ");
	System.out.println("(f)ixed grade assign all to 2.0 ");
	System.out.println("(r)andom grade assign to first 10 elements ");
	System.out.println("(q)uit ");
}
//method takes parameter selection(type char),returns(void), allows menu options to be functional 
public void processMenu(char selection) {
	System.out.println();
	switch(selection) {
		case'a':
		System.out.printf("The average grade is" + " " +aManager.getAverageGrade());
		break;
		case'd': 
		System.out.println("If grades are not showing they are in invalid state, please assign grades using f or r ");
		aManager.displayGrade();
		break; 
		case'h':
		System.out.print("The highest grade is" + " " + aManager.getHighestGrade());
		break; 
		case'l':
		System.out.print("The lowest grade is" + " " + aManager.getLowestGrade());
		break; 
		case'f':
		System.out.println("Assigning all grades to 2.0...");
		aManager.setGrade(2.0);
		break;
		case'r':
		System.out.println("Assigning random grades to first 10 elements...");
		aManager.randomAssign(1,4);
		break;  
		case'q':
		done = true;
		break;
		default:
		 System.out.println("Choose a,d,h,l,f,r and q to acess certain features (recommended:assign grades first) "); }
	System.out.println(); }

//method does not take any parameter, returns(void), allows the program to run until user quits 
public void startProgram ()   
{
	final int FIRST = 0;
	String line = null;
	char selection = ' ';
	while (done==false)
	{
		displayMenu();
		line = in.next();
		selection = line.charAt(FIRST);
		processMenu(selection); 
	}
}
}

