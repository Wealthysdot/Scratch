package two.figExample;

import java.util.Scanner;

public class addingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstInteger;
        int secondInteger;
        int sum;

        System.out.println("Please enter your first integer:");
        firstInteger = input.nextInt();

        System.out.println("Please enter your second integer:");
        secondInteger = input.nextInt();

        sum = firstInteger + secondInteger;

//        System.out.println("The sum of your integer is " + sum);

        System.out.printf("The sum of your integer is %d%n", sum);
    }

}