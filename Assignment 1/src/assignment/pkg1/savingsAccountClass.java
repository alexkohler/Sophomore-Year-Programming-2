//Savings Account Class - Assignment 1- CMPSC 221
//Written by Alexander Kohler 
package assignment.pkg1;

//importts for sake of rounding money values to nearest cent 
import java.math.BigDecimal;
import java.math.RoundingMode;

//8.6 (Savings Account Class) Create class SavingsAccount. 
//Use a static variable annualInterestRate to store the annual interest rate for all account holders.
//Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12—
//this interest should be added to savings-Balance. 
//Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. 
//Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
//saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
//to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
//both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
//the new balances for both savers.
public class savingsAccountClass {

    static public double annualInterestRate;//annual interest rate for all account holders 

    private double savingsBalance; //private instance variable savingsBalance that indciates amount saver currently has on deposit

//setInterestRate- Interest rate setter
    void setInterestRate(double interestValue) {
        annualInterestRate = interestValue;
    }

//setSavingsBalance- Set savings balance of each savings account object 
    void setSavingsBalance(double savingsValue) {
        savingsBalance = savingsValue;
    }

//calculateMonthlyInterest- Compute interest gained after one month, based on annual interest rate and current savings balance of the savings account object
    double calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
        BigDecimal bd = new BigDecimal(savingsBalance).setScale(2, RoundingMode.HALF_EVEN);
        savingsBalance = bd.doubleValue();
        return savingsBalance;
    }

    public static void main(String args[]) {

        //create new savings account objects    
        savingsAccountClass saver1;
        savingsAccountClass saver2;
        saver1 = new savingsAccountClass();
        saver2 = new savingsAccountClass();

        //set initial balances and annual interest rates for each saving account object
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        saver1.setInterestRate(.04);
        saver2.setInterestRate(.04);

        double monthlyIterator1;//monthly savings for Saver 1
        double monthlyIterator2;//monthly savings for Saver 2

        //For loop that computes the gained interest over 12 months 
        System.out.print("Savings Account Balances \n");
        System.out.print("Month   Saver 1      Saver 2 \n");
        for (int i = 1; i < 13; i++) {
            monthlyIterator1 = saver1.calculateMonthlyInterest();
            monthlyIterator2 = saver2.calculateMonthlyInterest();

            //If/else for sake of allignment of each value
            if (i < 10) {
                System.out.print(i + "       ");
            } else {
                System.out.print(i + "      ");
            }

            //More formatting code, printing to two decimal points
            System.out.printf("%.2f", (double) monthlyIterator1);
            System.out.print("      ");
            System.out.printf("%.2f", (double) monthlyIterator2);
            System.out.print("\n");

        }

        //Change the interest rate to 5%
        saver1.setInterestRate(.05);
        saver2.setInterestRate(.05);

        //Compute the new interest given the changed interest rate
        monthlyIterator1 = saver1.calculateMonthlyInterest();
        monthlyIterator2 = saver2.calculateMonthlyInterest();

        System.out.print("13      ");
        System.out.printf("%.2f", (double) monthlyIterator1);
        System.out.print("      ");
        System.out.printf("%.2f", (double) monthlyIterator2);
        System.out.print("\n");
    }

}
