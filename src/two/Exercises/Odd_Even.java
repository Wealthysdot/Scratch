package two.Exercises;


import java.util.Scanner;

//Write an application that reads an integer and determines and prints whether it’s odd or even.
//[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a
// remainder of 0 when divided by 2.]
public class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("Please input a number");
        a = input.nextInt();

        if (a % 2 == 0)
            System.out.println("The number even");

        if (a % 2 != 0)
            System.out.println("The number is odd");
    }
}
