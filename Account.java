import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Account {
    private String owner, passID;
    private int balance;

    public Account (String owner, String pass) {
        this.owner = owner;
		this.passID = passID;
		balance = 0;
    }

	public String getOwner() {
        return owner;
    }

	public String getID() {
        return owner;
    }

	public int getBalance() {
        return balance;
    }

	public void addBalance(int addition){
		this.balance = this.balance + addition;
	}
	public boolean subtractBalance(int subtraction){
	if(subtraction <= balance){
		this.balance = this.balance - subtraction;
		return true;
	}else{
		System.out.println("Not enough funds in " + this.owner + "'s account");
		return false;
	}
	}

	public boolean deposit(String input, int numInt){
	Scanner sc = new Scanner(System.in);
		if(input.equals(owner))
		{
			System.out.println("\nHow much?");
			int numInput = sc.nextInt();
			sc.nextLine();
			this.addBalance(numInput);
			System.out.println("\nDeposited " + numInput + " to " + this.owner + "\nNew balance is: " + balance);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean withdraw(String input, int numInt){
	Scanner sc = new Scanner(System.in);
		if(input.equals(owner))
		{
			System.out.println("\nHow much?");
			int numInput = sc.nextInt();
			sc.nextLine();
			boolean temp = this.subtractBalance(numInput);
			if(temp){
				System.out.println("\nWithdrew " + numInput + " from " + this.owner);
			}
			System.out.println("New balance is: " + balance);
			return temp;
		}
		else{
			return false;
		}
	}
}