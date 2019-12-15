package lab.pkg4;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Random;

public class Lab4 {
    
    public static void main(String[] args) {
        // average();
        // formatting();
        // two_decimal_num();
        // sum_even();
        // rock_paper_scissors();
        test();
    }//main
    
    public static void average() {
        // Question 1
        double val1, val2, val3, average;
        
        Scanner scan = new Scanner(System.in);
        
        // user input values phase
        System.out.println("Please enter three integres and I will compute their average.");
        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();
        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();
        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();
        
        //compute average of input values
        average = (val1+val2+val3)/3;
        
        System.out.println("The average is " + average);
    }//average()
    
    public static void formatting() {
        // Question 2
        final double gramsPerKG = 1000;
        
        double pricePerKG, grams, weight, total;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Wlcome to Coles supermarkets.");
        System.out.print("Enter the price per kg of item: $");
        pricePerKG = scan.nextDouble();
        
        System.out.print("Enter the weight(grams): ");
        grams = scan.nextDouble();
        
        //covert grams to kilograms and compute the total price
        weight = grams / gramsPerKG;
        total = pricePerKG * weight;
        
        System.out.println("\n  **** Coles ****  ");
        System.out.println("Unit Price: $" + pricePerKG + " per kilogram");
        System.out.println("Weight: " + weight + " kilogram\n");
        System.out.println("TOTAL: " + fmt.format(total));
    }//formatting()
    
    public static void two_decimal_num() {
        // Question 3
        float num1, num2, division;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a decimal number: ");
        num1 = scan.nextFloat();
        System.out.print("Please enter another decimal number: ");
        num2 = scan.nextFloat();
        
        division = num1/num2;
        
        //print out with string formatting
        System.out.println(String.format("The first number" +
                "%1.2f divided by the second number %2.2f is :- %3.2f", num1,num2,division));
    }//two_decimal_num()
    
    public static void sum_even() {
        // Question 4
        final int num1 = 2;
        int num2, total;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        num2 = scan.nextInt();
        // if input value under 2 than pop error message 

        // if (num2<2) {
        //     System.out.println("Please")
        // }

        total = 0;
        for (int i = num1; i<num2; i += 2) {
            total += i;
        }
        System.out.println(String.format("Sum of even numbers from " + 
                    "%d to %d is %d",num1,num2,total));
    
    }//sum_even
    
    public static void rock_paper_scissors() {
        String personPlay, computerPlay;
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //get player's play
        System.out.println("Enter your play: R for rocks, S for scissors and P for paper.");
        personPlay = scan.next();

        // generate computer's play (0,1,2)
        computerInt = generator.ints(0,3).findFirst().getAsInt();

        //translate computer's randomly generated play to string
        switch (computerInt){
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "S";
                break;
            case 2:
                computerPlay = "P";
                break;
        }

        //print computer's play and show result
    }
    public static void test() {
        
    }
}
