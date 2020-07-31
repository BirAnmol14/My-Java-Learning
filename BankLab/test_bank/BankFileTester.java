package test_bank;

import java.io.IOException;
import java.util.Scanner;

public class BankFileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		Bank bank=null;
		boolean correct=true;
		do {
		correct=true;
		System.out.println("Enter input-file name: ");
		String fname=in.nextLine();
		
		try {
		bank=BankIO.buildBank(fname);
		BankIO.readFile(fname, bank);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			correct=false;
		}catch(NullPointerException e) {
			System.out.println("Bank not built");
			correct=false;
		}
		}while(!correct);
		System.out.println("Enter output-file name: ");
		String fname=in.nextLine();
		try {
		BankIO.write(bank, fname);
		}catch(NullPointerException e) {
			System.out.println("Bank not existing");
			System.exit(0);
		}
		finally {
			in.close();
		}
		
	}

}
