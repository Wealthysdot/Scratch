package two.Exercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.println("Please enter first digit");
        a = input.nextInt();

        System.out.println("Please enter second digit");
        b = input.nextInt();

        sum = a + b;
        product = a * b;
        difference = a - b;
        quotient = a % b;

        System.out.println("The sum of your interger is " + sum);
        System.out.println("The product of your interger is " + product);
        System.out.println("The difference of your interger is " + difference);
        System.out.println("The quotient of your interger is " + quotient);
    }
}
