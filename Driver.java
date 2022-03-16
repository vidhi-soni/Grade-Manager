/* CPSC 233 
The program stores grade points and performs a variety of calculations (Grade Management Program)
It can calculate average, find maximum/minimum value, display, store, and change grades. 
Limitation: There isn't proper user input for grades stored in array- all elements are fixed or random 
The Driver class is just the main execution point, that starts the program. 
February 9th,2021: processMenu created (user can see display menu but it does not do the functions)
February 10th,2021: methods created to change grade, initilize grades, finds average for all elements, and find max/min grades 
February 11th,2021: random and fixed initilization methods created
February 12th,2021: average function feature updated to update for all valid elements, not just all elements
*/

public class Driver
{
	public static void main (String [] args)
	{
		UserInterface anInterface = new UserInterface();
		anInterface.startProgram();
	}
}


