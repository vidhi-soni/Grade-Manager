/*  CPSC 233 
The Manager class contains all methods used for calculations and storage of grades 
Limitation: The array can only contain a maximum of 40 elements.
*/ 

import java.util.Random;


public class Manager
{
    private final int MAX = 40;
	private double [] grades = new double[MAX];
	private int arrayLength = grades.length;  

//method does not take any parameter, returns (void), intilizes each element to -1
public void initialGrade()   
{
	for (int i = 0; i < MAX; i++) {
		grades[i] = -1; 
	}
}
//mutator method,takes in parameter anElement(type double), sets each element to the parameter value 
public void setGrade(double anElement) 
{
	for (int i = 0; i < MAX; i++) {
		grades[i] = anElement; 
	}
}
//method does not take any parameter, returns(void), displays grades without unoccupied spots in array 
public void displayGrade () 
{
	System.out.println("Your grades currently are:");
 	for (int i = 0; i < arrayLength; i++) {
 		if(grades[i] <= 0) continue;
 		System.out.print(grades[i] + " ");
 	}
}
//method does not take any parameter, returns(double), calculates average for elements greater then 0 
public double getAverageGrade () 
{
	int counter = 0; 
	double sum = 0.0;
	double average = 0.0;
	for (int i = 0; i < arrayLength; i++) {
	      	if (grades[i] > 0) {
	      		counter += 1; 
	 			sum += grades[i]; }
	 		}
	 average = (sum/counter); 
	 return average; 
}
//method does not take any parameter, returns(double), calculates maximum grade  
public double getHighestGrade () 
{
	double max = -1.0;
	for (int i = 0; i < arrayLength; i++) {
		if(grades[i] >= max) 
				max = grades[i]; }
	return(max); 	
}
//method does not take any parameter, returns(double), calculates minimum grade not including invalid values(-1)
public double getLowestGrade () 
{
double min = 5.0;
for (int i = 0; i < arrayLength; i++) {
	if(grades[i] == -1) continue;
	if(grades[i] <= min) 
		min = grades[i]; 
		if(grades[i] == -1)
			break; }
		return(min);  
}
//takes two parameters minimum and maximum (type int), returns(void), generates random integers to be put in array
public void randomAssign(int minimum, int maximum) 
{
	Random rand = new Random();	
	for (int i = 0; i <= 9; i++) {
	int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
	 grades[i] = randomNum;
	}
} 
}
	





	
