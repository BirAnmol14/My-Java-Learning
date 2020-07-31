package test_bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BankIO {
	public static Bank buildBank(String filename) throws IOException {
			File f=null;
			Scanner in=null;
			BankAccount b=null;
			int count=0;
			try {
			 f=new File(filename);
			 in=new Scanner(f);
			 
			 while(in.hasNextLine()) {
				  b=BankAccountreadAccount(in);
				  if(b!=null) {
					  count++;
				  }
			 }
			 
			}catch(FileNotFoundException e) {
				System.out.println("Unable to find File");
			}
			finally {
				if(in!=null) {
					in.close();}
			}
			if(count>0) {
			return new Bank(count);
			}
			return null;
		}
	public static void readFile(String filename,Bank bank) throws IOException{
		File f=null;
		Scanner in=null;
		BankAccount b=null;
		try {
		 f=new File(filename);
		 in=new Scanner(f);
		 ArrayList<BankAccount> list=new ArrayList<BankAccount>();
		 while(in.hasNextLine()) {
			  b=BankAccountreadAccount(in);
			  if(b!=null) {
				  list.add(b);
			  }
		 }
		 if(bank==null) {
			 bank=new Bank(list.size());
		 }
		 for(BankAccount a:list) {
			 bank.add(a);
		 }
		}catch(FileNotFoundException e) {
			System.out.println("Unable to find File");
		}
		finally {
			if(in!=null) {
				in.close();}
		}
	}
	public static BankAccount BankAccountreadAccount(Scanner in) throws IOException{
		String data=in.nextLine();
		String [] arr=data.split("\\s");
		if(arr.length!=2) {
			throw new IOException("Corrupt data in line");
		}
		return new BankAccount(Double.parseDouble(arr[1]),Integer.parseInt(arr[0]));
	}
	public static void write(Bank bank,String filename) {
		PrintWriter pw = null;
		try {
			pw=new PrintWriter(filename);
			pw.print(bank.toString());
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(NullPointerException e) {
			System.out.println("No Bank Exists");
		}
		finally {
			if(pw!=null) {
			pw.close();}
		}
	}
}
