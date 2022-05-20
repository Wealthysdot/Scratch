package two.Exercises;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        double weight;
        double height;
        double BMI;
        double min_weight;
        double max_weight;
        System.out.println("Please enter your age");
        age = input.nextInt();

        if (age < 18 && age > 65){
            System.out.println("Your BMI cannot be calculated");
        }

        if (age >18 && age < 65) {
            System.out.println("Please enter your weight in kg");
            weight = input.nextDouble();


            System.out.println("Please input your height in meters");
            height = input.nextDouble();


            BMI = weight / (height * height);
            System.out.println("bmi--> " + BMI);
            System.out.println("weight--> " + weight);
            System.out.println("height--> " + height);
            min_weight = 18.5 / (height * height);
            max_weight = 24.9 / (height * height);


            if (BMI <= 18.5) {
                System.out.println("Your BMI is" + BMI + "You under weight, your minimum weight should be" +
                        min_weight + "and your maximum weight should be" + max_weight);
            }


            if (BMI > 18.5 && BMI < 24.9) {
                System.out.println("Your BMI" + BMI + "is normal");
            }


            if (BMI > 25 && BMI <= 29.9) {
                System.out.println("You are Over weight, your suggested minimum weight should be" +
                        min_weight + "and your maximum weight should be" + max_weight);
            }


            if (BMI > 30) {
                System.out.println("You Obese, your minimum weight should be" +
                        min_weight + "and your maximum weight should be" + max_weight);
            }
        }
    }
}
