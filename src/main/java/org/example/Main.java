package org.example;
import java.util.Scanner;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter temperature in Celsius: ");

        Scanner scan = new Scanner(System.in);
        float C = scan.nextFloat();
        float F = (C * (9.0f/5.0f)) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f", F);
    }
}