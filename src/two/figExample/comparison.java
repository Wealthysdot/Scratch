package two.figExample;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first_fig;
        int second_fig;


        System.out.println("Please enter first figure");
        first_fig = input.nextInt();

        System.out.println("Please enter second figure ");
        second_fig = input.nextInt();

        if (first_fig == second_fig)
        System.out.println(first_fig + " is equal " + second_fig );

        if (first_fig < second_fig)
        System.out.println(first_fig + " is less than " + second_fig );

        if (first_fig > second_fig)
        System.out.println(first_fig + " is greater than " + second_fig );

        if (first_fig != second_fig)
        System.out.println(first_fig + " is not equals " + second_fig );

        if (first_fig >= second_fig)
        System.out.println(first_fig + " is greater than or equal to  " + second_fig );

        if (first_fig <= second_fig)
        System.out.println(first_fig + " is less than or equal " + second_fig );









    }
}
