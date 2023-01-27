package introtojava;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Variable declaration and initialization
		int firstNum = 0, secondNum = 1;
		boolean invalidInput = true;
		
		//Print a message to the screen
		System.out.print("Enter a N number, to start: ");
		
		//Accepting user's input and storing into the variable
		int userInput = scanner.nextInt();
	
		//Looping user's input until positive value has been entered
		while(invalidInput) {
		//Checking for positive number
		if(userInput > 0) {
					//Exiting from the loop
					invalidInput = false;
					//Looping for user's input number
					for (int i = 0; i<userInput; i++) {
						//Summing up the first number and second number into variable total
						int total = firstNum + secondNum;
						//Printing the sum number to the screen
						System.out.println(total);
						//Assigning or swapping the value of Second into First for the iteration
						firstNum = secondNum;
						//Total assign it's value into secondNum
						//Total is consistent, it saves the last number, and adds it to the next value in the iteration
						secondNum = total;
					}
				}
				else {
					//Keep looping while user's enter an invalid input
					invalidInput = true;
					//Accept user's input
					System.out.print("Invalid input, please a number greater than 0: ");
					userInput = scanner.nextInt();
				}
			}

		}
   
}
