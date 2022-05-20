package two.Exercises;

import java.util.Scanner;

// Write an application that asks the user to enter two integers, obtains
//them from the user and displays the larger number followed by the words "is larger".
// If the numbers are equal, print the message "These numbers are equal".
// Use the techniques shown in Fig. 2.15.


public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Please input first int");
        a = input.nextInt();

        System.out.println("Please input second int");
        b= input.nextInt();

        if (a > b)
            System.out.println(a + "is larger " );
        if (b > a)
            System.out.println(b + "is larger ");
        if (a == b)
            System.out.println("These numbers are equal");
    }
}
