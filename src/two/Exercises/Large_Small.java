package two.Exercises;

//(Largest and Smallest Integers) Write an application that reads five integers and determines
//and prints the largest and smallest integers in the group. Use only the programming techniques you
//learned in this chapter.

import java.util.Scanner;

public class Large_Small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int largest;
        int smallest;

        System.out.println(" Enter first int");
        a = input.nextInt();

        System.out.println(" Enter sec int");
        b = input.nextInt();

        System.out.println(" Enter third int");
        c = input.nextInt();

        System.out.println(" Enter fourth int");
        d = input.nextInt();

        System.out.println(" Enter fifth int");
        e = input.nextInt();



        largest = a;
        if (b > largest)
            largest=b;
        if (c > largest)
            largest=c;
        if (d > largest)
            largest=d;
        if (e > largest)
            largest=e;

        System.out.println("largest is-> "+largest);

        smallest = a;
        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;
        if (d < smallest)
            smallest = d;
        if (e < smallest)
            smallest = e;


        System.out.println("the smallest number is " + smallest + " the largest number is " + largest);


    }
}
