package com.example.bmiindexcalculation;

import java.util.Scanner;

public class BmiIndexCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height and weight to calculate BMI index.");

        System.out.print("Height in cm: ");
        float height = input.nextFloat();

        System.out.print("Weight in kg: ");
        float weight = input.nextFloat();

        input.close();

        float bmiIndex = (float) (weight / Math.pow(height / 100, 2));
        System.out.println("BMI index = " + bmiIndex);

        if (bmiIndex < 16.00) {
            System.out.println("16.00 - starvation");
        }
        else if (bmiIndex < 17.00) {
            System.out.println("16.00 - 16.99 - emaciation");
        }
        else if (bmiIndex < 18.50) {
            System.out.println("17.00 - 18.49 - underweight");
        }
        else if (bmiIndex < 23.00) {
            System.out.println("18.50 - 22.99 - normal, low range");
        }
        else if (bmiIndex < 25.00) {
            System.out.println("23.00 - 24.99 - normal, high range");
        }
        else if (bmiIndex < 27.50) {
            System.out.println("25.00 - 27.49 - overweight, low range");
        }
        else if (bmiIndex < 30) {
            System.out.println("27.50 - 29.99 - overweight, high range");
        }
        else if (bmiIndex < 35) {
            System.out.println("30 - 34.9 - 1st degree obesity");
        }
        else if (bmiIndex < 40 ) {
            System.out.println("35 - 39.9 - 2nd degree obesity");
        }
        else {
            System.out.println("40 - 3rd degree obesity");
        }
    }
}
