package two.Exercises;

//(Multiples) Write an application that reads two integers, determines whether the first is a
// multiple of the second and prints the result. [Hint: Use the remainder operator.]

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Please enter your First number");
        a = input.nextInt();

        System.out.println("Please enter your Second number");
        b = input.nextInt();

        if (b % a  == 0)
            System.out.println(a + "Is a multiple of " + b);

        if (b % a != 0)
            System.out.println(a + "is not a multiple of " + b);
    }
}
