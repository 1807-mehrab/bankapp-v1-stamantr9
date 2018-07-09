import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	List<Account> allaccounts;
	Account bobsaccount = new Account("Bob", "bob94");
	Account joesaccount = new Account("Joe", "joe68");
	int numInput = 0;
	String input = "o", input2 = "o";
	System.out.println("Welcome to wells fargo");
	System.out.println("System Commands: \nQ - quit \nD - deposit \nW - withdraw \n");
	Scanner sc = new Scanner(System.in);
	while(!input.equals("q")){
		System.out.println("Please input a command:");
		input = sc.nextLine().trim();
		/*if(input.equals("c") || input.equals("C")){
			System.out.println("Create a new account\n");
		}*/
		if(input.equals("t") || input.equals("T")){
			System.out.println("Transfer from where?");
			input = sc.nextLine().trim();
			if(input.equals(bobsaccount.getOwner())){
				System.out.println("Transfer to where?");
				input2 = sc.nextLine().trim();
				if(input2.equals(joesaccount.getOwner()))
				{
					if(bobsaccount.withdraw(input, numInput))
						joesaccount.deposit(input2, numInput);
				}
			}
		}
		else if(input.equals("d") || input.equals("D")){
			System.out.println("\nDeposit to which account");
			input = sc.nextLine().trim();
			if(input.equals(bobsaccount.getOwner())){
				bobsaccount.deposit(input, numInput);
			}
			else if(input.equals(joesaccount.getOwner())){
				joesaccount.deposit(input, numInput);
			}
			else{
				System.out.println("invalid input");
			}

		}
		else if(input.equals("w") || input.equals("W")){
			System.out.println("Withdraw from which account\n");
			input = sc.nextLine().trim();
			if(input.equals(bobsaccount.getOwner())){
				bobsaccount.withdraw(input, numInput);
			}
			else if(input.equals(joesaccount.getOwner())){
				joesaccount.withdraw(input, numInput);
			}
			else{
				System.out.println("invalid input");
			}
		}else if(input.equals("q"))
		{
		}else{
			System.out.println("Invalid command");
		}
    }
	System.out.println("Goodbye");
	}

}