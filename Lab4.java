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
        // translate();
        // seven();
        // reverse_mult();
        square_grid();
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
        
        while (true) {
            System.out.print("Please enter a number: ");
            num2 = scan.nextInt();

            // if input value under 2 than pop error message 
            if (num2<2) {
                System.out.println("***** Please enter a number greater than 2 *****");
            } else {
                break;
            }
        }

        total = 0;
        for (int i = num1; i<num2; i += 2) {
            total += i;
        }
        System.out.println(String.format("Sum of even numbers from " + 
                    "%d to %d is %d",num1,num2,total));
    
    }//sum_even
    
    public static void rock_paper_scissors() {
        //Question 5
        String personPlay, computerPlay;
        int computerInt;
        

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // generate computer's play (0,1,2)
        computerInt = generator.ints(0,3).findFirst().getAsInt();
        computerPlay = "";

        // game playes continue until who's win 
        while (true){

            //get player's play
            System.out.println("Enter your play: R for rocks, S for scissors and P for paper.");
            personPlay = scan.next().toUpperCase();

            //translate computer's randomly generated play to string
            switch (computerInt){
                case 0:
                    computerPlay = "R";
                    System.out.println("Computer trhows Rock");
                    break;
                case 1:
                    computerPlay = "S";
                    System.out.println("Computer trhows Scissors");
                    break;
                case 2:
                    computerPlay = "P";
                    System.out.println("Computer trhows Paper");
                    break;
            }

            //print computer's play and show result
            if (personPlay.equals(computerPlay)) {
                    System.out.println("It's a tie!");
            } else if (personPlay.equals("R")) {

                if (computerPlay.equals("S")) {
                    System.out.println("Rock crushes scissors, You won!");
                    break;
                } else {
                    System.out.println("Paper covers rock, You lose!");
                    break;
                }
            } else if (personPlay.equals("S")) {

                if (computerPlay.equals("P")) {
                    System.out.println("Scissors cuts paper, You won!");
                    break;
                } else {
                    System.out.println("Rock crushes scissors, You lose!");
                    break;
                }
            } else if (personPlay.equals("P")) {

                if (computerPlay.equals("R")) {
                    System.out.println("Paper covers rock, You won!");
                    break;
                } else {                
                    System.out.println("Scissors cuts paper, You lose!");
                    break;
                }
            } else {
                System.out.println("That's not a valid play. Check your spelling!");
            }
        }
    }
    
    public static void translate(){
        //Question 6
        String sen;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence you would like translate: ");
        sen = scan.nextLine();

        int len = sen.length();
        
        System.out.println(String.format("Your sentence is %d characters long",len));
        System.out.println(String.format("Your sentence start with the character: %s",sen.charAt(0)));
        System.out.println(String.format("Your sentence end with the character: %s",sen.charAt(len-1)));
        System.out.println(String.format("The middle character: %s",sen.charAt(len/2)));
        System.out.println(String.format("\nTranslation is: \n oi %s oi,oi,oi!",sen));
        
    }

    public static void seven() {
        //Question 7
        final int seven, seventy, last;
        seven = 7;
        seventy = 70;
        last = 494;

        for (int count = 1; count < last; count++) {
            if (count % seven == 0) {
                System.out.print(count + "\t");
                if (count % seventy == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static void reverse_mult() {
        //Question 8
        int total = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        if (num != 0 && num > 0) {
            for (int i = 0; num > i; num--) {
                total *= num;
            }
            System.out.println(total);
        } else {
            System.out.println("Input value must be greater than 0.");
        }
        
    }

    public static void square_grid() {
        //Question 9
        Scanner scan = new Scanner(System.in);
        
        System.out.print("number for square: ");
        int num = scan.nextInt();

        //star space and double space strings
        String sym1 = "* ";
        String sym2 = "  ";

        for (int i = 0; num > i; i++) {
            if (i == 0 || i == (num-1)) { //horizontal lines for first row and last row 
                System.out.println(sym1.repeat(num));
            } else {//perpndicular lines with space inside of square
                System.out.println("*  "+sym2.repeat(num-3)+" *");
            }
            // System.out.print("* ");
            // if (i == (num-1)) {
            //     System.out.print("\n* ");
            
        }


    }

        
}