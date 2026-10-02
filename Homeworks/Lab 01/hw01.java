/*
1. Create a String variable name and assign the value of the user’s input.
2. Create an int variable points and assign the value of the user’s input.
3. Create a double variable balance and assign the value of the user’s input.
4. Print these variables in ONE LINE.
*/


import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Creating a String variable name and assign user's input
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        // 2. Creating an int variable points and assign user's input
        System.out.println("Enter points: ");
        int points = scanner.nextInt();

        // 3. Creating a double variable balance and assign user's input
        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();

        // 4. Print these variables in ONE LINE
        System.out.println(name + " " + points + " " + balance);
        
        scanner.close();
    }
}


