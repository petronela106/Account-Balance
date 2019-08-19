package accountBalance;

import java.util.Scanner;

//Write a program to calculate an account balance
//Read a sequence of incomes / expenses, until "End" is read
//Add the money to the balance (starting form 0) and print:"Increase: {money} " or "Decrease: {money}"
//Finally, print the account balance:"Balance: {balance}"

	public class AccountBalance {
		   public static void main(String[] args) {
		       Scanner scanner = new Scanner(System.in);
		       String income = scanner.nextLine();
		       double balance = 0.00 ;
		       while(!income.equals("End")){
		           double money = Double.parseDouble(income);
		           if(money < 0){
		               System.out.printf("Decrease: %.2f", (-money));
		               System.out.println();
		           }
		           if(money > 0){
		               System.out.printf("Increase: %.2f", money);
		               System.out.println();
		           }
		           
		           balance += money;
		           String in = scanner.nextLine();
		           income = in;
		       }
		      System.out.printf("Balance: %.2f", balance);
		    }
		}