import java.util.Scanner;  

public class budget {
  public static void main(String args[]) {
      int monthlyRent = 450; // average price for splitting rooms / apartments with other students
      int monthlyInternet = 60; 
      int groceryBill = 200; // avearge grocery bill is $163-$367 per month
      int monthlySavings = 100;

      Scanner myObj = new Scanner(System.in);
      System.out.println("How much will you make per hour?");
      double averageWage = myObj.nextDouble(); // average pay for college students is $8-$12 /hr but varies deeply on location so input is called
      System.out.println(""); // used to break up lines in between user input and system output
      System.out.println("How much money would you like to save monthly for fun?");
      int funFunds = myObj.nextInt();
      System.out.println(""); // used to break up lines in between user input and system output

      int totalBills = monthlyRent + monthlyInternet + groceryBill + funFunds;
      double hoursWorked = (totalBills / averageWage) / 4; // divided by four for a monthly average of four weeks in a month
      double savingHours = monthlySavings / averageWage;

      System.out.println("You are making $" + averageWage + " per hour.");
      System.out.println("Your bills are broken up in the following: \n\n Rent: $" + monthlyRent + "\n Internet Bill: $" + monthlyInternet);
      System.out.println(" Grocery Bill (Monthly): $" + groceryBill + "\n Monthly Savings: $" + monthlySavings + "\n Fun Money: $" + funFunds + "\n Total Bills: $" + totalBills + "\n");
      
      
      // if else tree to determine three different scenarios for explaining how many hours they will need to work
      if (hoursWorked < 40 && hoursWorked > 20){
      System.out.println("You will need to work " + hoursWorked + " hours per week.");
      }else if(hoursWorked > 40){
        System.out.println("You need a better job... You will have to work " + hoursWorked + " hours per week to stay in budget.");
      } else if (hoursWorked > 0 && hoursWorked <= 20){
        System.out.println("Sounds like you have a decent job, you will only have to work " + hoursWorked + " hours per week!");
      }

      if (savingHours == 1){ // this if else statement does nothing more than outputs hour or hours for proper grammer if only one hour is required
      System.out.println("In order to put away $" + monthlySavings + " you will have to work an extra " + savingHours + " hour.");
      }else {
        System.out.println("In order to put away $" + monthlySavings + " in savings, you will have to work an extra " + savingHours + " hours. ");
      }
    }
}