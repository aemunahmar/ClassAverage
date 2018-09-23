//Created by Aemun Ahmar ID 1047508
//CSCI 125 M04 Fall 2016
//Professor Wenjia Li
//Classwork: Class Average Verison 2.0
//Date Created: Tuesday, October 18, 2016

import javax.swing.JOptionPane;

public class Class_Average 
{
	public static void main(String args[])
	{
		//Declaring Variables
		int counter, grade, total;
		float average;
		String gradeInput;
		
		//Initialization
		total = 0;
		counter = 0;
		
		//Priming read
		gradeInput = JOptionPane.showInputDialog(null, "Enter a grade: " + "\nType -1 to exit");
		grade = Integer.parseInt(gradeInput);
		
		//Get grades until sentinal value and compute grade total and grade count
		while(grade != -1)
		{
			total = total + grade;
			counter = counter + 1;
			gradeInput = JOptionPane.showInputDialog(null, "Enter a grade: " + "\nType -1 to exit");
			grade = Integer.parseInt(gradeInput);
		}
		
		//Compute and display average
		average = (float) total / counter;
		JOptionPane.showMessageDialog(null,  "Class average is: " + average);
		
	}
}
