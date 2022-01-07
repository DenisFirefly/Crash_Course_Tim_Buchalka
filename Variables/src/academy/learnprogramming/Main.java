package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        Random randomGenerator = new Random();

	    int firstNumber = randomGenerator.nextInt(8) +2;
        int secondNumber = randomGenerator.nextInt(8) +2;

        var subtraction = randomGenerator.nextInt(8) +2;
        int answer = firstNumber * secondNumber - substraction;
        System.out.println("PREDICTION: " + answer);
        String prompt = ". Don't type in the answer, just press ENTER when ready";

        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply a number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of" + prompt);
        scanner.nextLine();
        System.out.println("Now subtract " + substraction + prompt);
        scanner.nextLine();

        System.out.println("The answer is: " + answer);

        scanner.close();
    }
}
