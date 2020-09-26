import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {


		//Simple introduction

		System.out.println("Welcome to Aidan's Edition of the classic, Rock Paper Scissors! (Java)");

		//Following will ask for user input; rock, paper or scissors

		
			Scanner playerChoice = new Scanner(System.in);  


			System.out.println("To begin, enter your selection of either rock, paper, or scissors. (Type your selection below)");

			String choice = playerChoice.nextLine();



			/* Assigning one of the three choices to an integer. 
			 * If the player selection !rock !paper !scissors 
			 * Then the selection will be deemed invalid and player will restart, and retype
			 * Note* that none of the selections is case sensitive
			 */

			

			
			int selection = 0;
			

			do {


				if(choice.equalsIgnoreCase("rock")){
					selection = 1;

				} else if(choice.equalsIgnoreCase("paper")) {
					selection = 2;

				} else if(choice.equalsIgnoreCase("scissors")) {
					selection = 3;
				}
				if(selection == 0) {
					System.out.println("The selection you entered is invalid, please enter either rock, paper or scissors");
					choice = playerChoice.nextLine();
				}


			} while(selection == 0);
			 







			System.out.println("The computer will now choose...");
			System.out.println("                               ");


			//unnecessary function but it's something new and I thought it would be cool
			//dosn't interrupt with actually functionality of the program

			Thread.sleep(3000);

			//Using the random import

			Random compChoice = new Random();

			//Declaring computers random integer

			int chosen;
			for(int counter=1; counter<=1; counter++) {
				chosen = 1+compChoice.nextInt(3);

				if((chosen == 1 && selection == 1)) {
					System.out.println("The computer chose rock as well, it's a tie!");

				} else if((chosen == 2 && selection == 2)) {
					System.out.println("The computer chose paper as well, it's a tie!");
				} else if((chosen == 3 && selection == 3)) {
					System.out.println("The computer chose scissors as well, it's a tie!");
				} else if((chosen == 1 && selection == 2)) {
					System.out.println("The computer chose rock, you win!");
				} else if((chosen == 1 && selection == 3)) {
					System.out.println("The computer chose rock, you lose!"); 
				} else if((chosen == 2 && selection == 1)) {
					System.out.println("The computer chose paper, you lose!");
				} else if((chosen == 2 && selection == 3)) {
					System.out.println("The computer chose paper, you win!");
				} else if((chosen == 3 && selection == 1)) {
					System.out.println("The computer chose scissors, you win!");
				} else if((chosen == 3 && selection == 2)) {
					System.out.println("The computer chose scissors, you lose!");

				}

				//The previous is all the possible outcomes.

				/*It will take user input (selection) and compare it to the randomly generated integer.
				 * which was chronologically chosen (1 = rock, 2 = paper, 3 = scissors)
				 */


			}
			
			Thread.sleep(500);
			System.out.println("                               ");
			System.out.println("Good game! Restart to play again.");
		}
	}




