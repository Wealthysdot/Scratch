package two.Exercises;

import java.util.Scanner;

public class threeInteger {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        int first;
        int second;
        int third;
        int prod;

        System.out.println("please enter first digit");
        first = input.nextInt();

        System.out.println("please enter second digit");
        second = input.nextInt();

        System.out.println("please enter third digit");
        third = input.nextInt();

        prod = first * second * third;
        System.out.println("The product of your number is" +  prod);


    }
}
