package two.Exercises;


//Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//representation of the average. So, if the sum of the values is 7, the average should be 2, not
//2.3333….]

import java.util.Scanner;

public class ArithSmaLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        int product;
        int average;


        System.out.println("please enter a digit");
        a = input.nextInt();

        System.out.println("please enter second digit");
        b = input.nextInt();

        System.out.println("please enter third digit");
        c = input.nextInt();

        sum = a + b + c;
        average = sum/3;
        product = a * b * c;

        int largest = a;
        int smallest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        System.out.println("Your sum is " + sum);
        System.out.println("Your average is " + average);
        System.out.println("Your product is " + product);
        System.out.println("The smallest number is " + smallest + " and the largest is " + largest);



    }


}
