import java.util.Scanner;

public class GessingGame {
	static void guessingGameTen() {
		// Excercise Slide 49
		// this is the answer number
		int trueNum = 6;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Guessing 1-10");
		System.out.println("Enter your guessing number between 1-10?");
		int guessNum = userInput.nextInt();

		if (trueNum == guessNum) {
			System.out.println("Wow!");
		} else {
			System.out.println("Nope!");
		}
	}
	
	static void passingGrade() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Fail or Pass my Grade");
		System.out.println("Enter your number grade");
		int userGrade = userInput.nextInt();
		if(userGrade <= 60) {
			System.out.println("You failed, do it again next semaster");
		} else {
			System.out.println("You Passed !!");
		}
	}
	
	static void gessingGameHundred() {
		
		int answer = 85;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guessing 1-100");
		System.out.println("Enter your guessing number between 1-100");
		int userNum = userInput.nextInt();
		if(userNum == answer) {
			System.out.println("Wow!");
		} else if(userNum == 80 || userNum == 90) {
			System.out.println("Oh! so close!!");
		} else {
			System.out.println("Nope !!");
		}
	}
	
	static void animalSound() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Animal Sound");
		System.out.println("Enter animal name");
		String animalName = userInput.nextLine();
		
		
		int animal = 0;
		
		//convert string to number
		//equal is chacking string value 
		//cannot use  == since String is an object not primitive value
		if(animalName.equals("dog")) {
			animal = 1;
		} else if (animalName.equals("cat")) {
			animal = 2;
		}else if (animalName.equals("pig")) {
			animal = 3;
		}else if (animalName.equals("cow")) {
			animal = 4;
		} 
		
		
		//using == to check the value since interget is a primitive value 
		if(animal == 1) {
			System.out.println("Woof Woof");
		}else if (animal == 2) {
			System.out.println("Meoww");
		} else if (animal == 3) {
			System.out.println("Oink Oink");
		} else if (animal == 4) {
			System.out.println("Moo Moo");
		} else {
			System.out.println("Unknow animal");
		}
		
	
		
	}

	public static void main(String[] args) {

		// Do the exercises from slides 49, 50, and 66 and submit them.
		guessingGameTen();
		System.out.println("*************************************************");
		passingGrade();
		System.out.println("*************************************************");
		gessingGameHundred();
		System.out.println("*************************************************");
		animalSound();

	}
}
