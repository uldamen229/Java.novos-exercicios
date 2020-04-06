package apliccation;

import java.util.Scanner;

import entities.accountBank;

public class Program {

	public static void main(String[] args) {

		accountBank accBank = new accountBank(0, null, 0, 'a');
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		accBank.setAccount(account);
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		accBank.setName(name);
		
		System.out.println("Is there a initial deposit? (y/n): ");
		char cond = sc.next().charAt(0);
		accBank.setCond(cond);
		
		
		
		if(cond == 'y') {
			System.out.println("Enter initial deposit value: ");
			double accValue = sc.nextDouble();
			accBank.setAccValue(accValue);
		}
	
		
		System.out.println("Account data:");
		System.out.println(accBank);
		
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double accValue = sc.nextDouble();
		
		accBank.setAccValue(accBank.addValue(accValue));
		accBank.getAccValue();
		System.out.println("updated account data: ");
		System.out.println(accBank);
		
		System.out.println();
		System.out.print("Enter a withdraw: ");
		accValue = sc.nextDouble();
		
		accBank.setAccValue(accBank.removeValue(accValue));
		accBank.getAccValue();
		System.out.println("updated account data: ");
		System.out.println(accBank);
		
		
		
		
		sc.close();
	}

}
