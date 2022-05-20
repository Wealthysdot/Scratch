package two.Exercises;


import java.util.Scanner;

    //(Negative, Positive and Zero Values) Write a program that inputs five numbers
// and determines and prints the number of negative numbers input, the number of positive numbers input and
//  the number of zeros input.
    public class NegZeroPos {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int a, b, c, d, e;
            int numberOfPositiveDigits=0;
            int numberOfNegativeDigits=0;
            int numberOfZeroDigits=0;

            System.out.println("input number");
            a = input.nextInt();
            System.out.println("input number");
            b= input.nextInt();
            System.out.println("input number");
            c = input.nextInt();
            System.out.println("input number");
            d = input.nextInt();
            System.out.println("input number");
            e = input.nextInt();



            if (a > 0) numberOfPositiveDigits=numberOfPositiveDigits+1;
            if (a < 0) numberOfNegativeDigits=numberOfNegativeDigits+1;
            if (a==0) numberOfZeroDigits = numberOfZeroDigits+1;

            if (b > 0) numberOfPositiveDigits=numberOfPositiveDigits+1;
            if (b < 0) numberOfNegativeDigits=numberOfNegativeDigits+1;
            if (b==0) numberOfZeroDigits = numberOfZeroDigits+1;

            if (c > 0) numberOfPositiveDigits=numberOfPositiveDigits+1;
            if (c < 0) numberOfNegativeDigits=numberOfNegativeDigits+1;
            if (c==0) numberOfZeroDigits = numberOfZeroDigits+1;

            if (d > 0) numberOfPositiveDigits=numberOfPositiveDigits+1;
            if (d < 0) numberOfNegativeDigits=numberOfNegativeDigits+1;
            if (d==0) numberOfZeroDigits = numberOfZeroDigits+1;

            if (e > 0) numberOfPositiveDigits=numberOfPositiveDigits+1;
            if (e < 0) numberOfNegativeDigits=numberOfNegativeDigits+1;
            if (e==0) numberOfZeroDigits = numberOfZeroDigits+1;

            System.out.println("Numbers of positive integers are " + numberOfPositiveDigits);
            System.out.println("Numbers of negative integers are " + numberOfNegativeDigits);
            System.out.println("Numbers of Zero are " + numberOfZeroDigits);



        }
    }


