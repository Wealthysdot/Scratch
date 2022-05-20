package two.Exercises;

import java.util.Scanner;

public class Reassign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Enter an integer");
        b = input.nextInt();

        System.out.println("Enter another integer");
        c = input.nextInt();

        //This performs a simple payroll calculation
        a = b * c;

        System.out.println(a + "is a product between b and c ");




    }
}
