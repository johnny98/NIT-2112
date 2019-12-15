package lab.pkg3;

import java.util.Scanner;
import java.text.NumberFormat;

public class Lab3 {
    
    public static void main(final String[] args) {
        // average();
        formatting();
    }
    public static void average() {
        
        double val1, val2, val3, average;
        
        final Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter three integres and I will compute their average.");
        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();
        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();
        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();
        
        average = (val1+val2+val3)/3;
        
        System.out.println("The average is " + average);
    }
    public static void formatting() {
        final double gramsPerKG = 1000;
        
        double pricePerKG, grams, weight, total;
        
        final Scanner scan = new Scanner(System.in);
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Wlcome to Coles supermarkets.");
        System.out.print("Enter the price per kg of item: $");
        pricePerKG = scan.nextDouble();
        
        System.out.print("Enter the weight(grams): ");
        grams = scan.nextDouble();
        
        weight = grams / gramsPerKG;
        total = pricePerKG * weight;
        
        System.out.println("\n  **** Coles ****  ");
        System.out.println("Unit Price: $" + pricePerKG + " per kilogram");
        System.out.println("Weight: " + weight + " kilogram\n");
        // System.out.println("TOTAL: " + fmt.format(total));
        System.out.println("TOTAL: %.2f" + total);
    }
}
