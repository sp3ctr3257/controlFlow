package com.ControlFlowproj;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		// pt. 1
		
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		// pt. 2

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter your name");
			String name = input.nextLine();
			System.out.printf("Hello %s!\n", name);

			// pt.3

			while (true) {
				System.out.printf(
						"Would you like to continue with the interactive portion %s? (enter yes or y to continue or q to quit)",
						name);
				String choice = input.nextLine();
				if (choice.equals("y") || choice.equals("yes")) {
					System.out.println("yay!, now lets continue...");
					System.out.println("do you have a red car?");
					String redCar = input.nextLine();
					System.out.println("What is your favorite pets name?");
					String petName = input.nextLine();
					System.out.println("What is the age of your favorite pet?");
					Integer petAge = Integer.parseInt(input.nextLine());
					System.out.println("Enter your lucky number!");
					Integer luckyNum = Integer.parseInt(input.nextLine());
					System.out.println("Do you hava a favorite Quarter Back?");
					String qBack = input.nextLine();
					
				if (qBack.equals("yes") || qBack.equals("Yes")) {
					System.out.println("oh really? what is their jersey number?");
					Integer jersNum = Integer.parseInt(input.nextLine());
					System.out.println("What is the two digit model year of your car?");					
					Integer modYear = Integer.parseInt(input.nextLine());
					System.out.println("What is the first name of your favorite actor or actress?");
					String act = input.nextLine();					
					System.out.println("Okay now enter a random number between 1 and 50");
					Integer ranNum = Integer.parseInt(input.nextLine());
					lotteryNumbers user = new lotteryNumbers (name, redCar, petName, petAge,luckyNum, jersNum, modYear, act, ranNum);
					System.out.println(user.toString());
					System.out.println("Okay let's move on to the lottery portion of the game");
					while (true) {
					lotteryNumbers.letsplay();
					lotteryNumbers.randomNumbers();
					lotteryNumbers.randomNumbers2();
					lotteryNumbers.randomNumbers3();
					lotteryNumbers.thirdLetterFavPet(petName);
					lotteryNumbers.modYearPlusLucNum(modYear,luckyNum);
					lotteryNumbers.ranNumMinusGenNum(ranNum);
					lotteryNumbers.frstLetFavAct(act);
					lotteryNumbers.fortyTwo();
					lotteryNumbers.magicBall(jersNum, ranNum);
				
					System.out.printf("Would you like to play Again %s? (enter yes or y to continue or q to quit)", name); 
					String lastChoice = input.nextLine();
					if (lastChoice.equals("y") || lastChoice.equals("yes")) {
					System.out.println("okay!");
					break;
					} else {
						System.out.println("Thanks for Playing!");
						System.exit(0);
					}
					}
					
				
				} else {
					System.out.println("What is the two digit model year of your car?");
					Integer modYear = Integer.parseInt(input.nextLine());
					System.out.println("What is the first name of your favorite actor or actress?");
					String act = input.nextLine();
					System.out.println("Okay now enter a random number between 1 and 50");
					Integer ranNum = Integer.parseInt(input.nextLine());
					lotteryNumbers user = new lotteryNumbers(name, redCar, petName, petAge,luckyNum, modYear, act, ranNum);
					System.out.println(user.toString2());
					System.out.println("Okay let's move on to the lottery portion of the game");
					while (true) {
					lotteryNumbers.letsplay();
					lotteryNumbers.randomNumbers();
					lotteryNumbers.randomNumbers2();
					lotteryNumbers.randomNumbers3();
					lotteryNumbers.thirdLetterFavPet(petName);
					lotteryNumbers.modYearPlusLucNum(modYear,luckyNum);
					lotteryNumbers.ranNumMinusGenNum(ranNum);
					lotteryNumbers.frstLetFavAct(act);
					lotteryNumbers.fortyTwo();
					lotteryNumbers.magicBall2(luckyNum, ranNum);
					System.out.printf("Would you like to play Again %s? (enter yes or y to continue or q to quit)", name); 
					String lastChoice = input.nextLine();
					if (lastChoice.equals("y") || lastChoice.equals("yes")) {
					System.out.println("okay!");
					break;
					} else {
						System.out.println("Thanks for Playing!");
						System.exit(0);
					}
					
					}

				}
				} else if (choice.equals("q") || choice.equals("Q")) {
					System.out.println("Please return later to complete the survey!");
					System.exit(0);

				} else {
					System.out.println("Invalid response, lets try that again...");
					continue;
				}
			}
		}
	}
}
