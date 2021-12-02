import java.util.Scanner;

class Main {
public static void main(String[] args) {
    System.out.println("I'm thinking of a number from 1-100...");
    System.out.println("Enter your guess!");
    int rand = (int) (Math.random() * 100);
    Scanner scn = new Scanner(System.in);
    boolean didGuessCorrect = false;
    while (!didGuessCorrect) {
        String line = scn.nextLine();
        int input = Integer.parseInt(line);
        if (input >rand){
            System.out.println("Your guess was too high! Try again.");
        } else if (input<rand){
            System.out.println("Your guess was too low! Try again.");
        } else {
            System.out.println("Correct! Stop cheating!");
            didGuessCorrect = true;
        }
    }
}}