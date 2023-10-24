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
    }
}
