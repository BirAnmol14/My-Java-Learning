package greedy_algo;

public class Coin_Problem {

	public static void main(String[] args) {
		int price=2130;
		int total=0;
		int n=price/1000;
		System.out.println("Number of 1000 coins: "+n);
		total+=n;
		price=price-n*1000;
		n=(price)/500;
		System.out.println("Number of 500 coins: "+n);
		total+=n;
		price=price-n*500;
		n=(price)/100;
		System.out.println("Number of 100 coins: "+n);
		total+=n;
		price=price-n*100;
		n=(price)/50;
		System.out.println("Number of 50 coins: "+n);
		total+=n;
		price=price-n*50;
		n=(price)/20;
		System.out.println("Number of 20 coins: "+n);
		total+=n;
		price=price-n*20;
		n=(price)/10;
		System.out.println("Number of 10 coins: "+n);
		total+=n;
		price=price-n*10;
		n=(price)/5;
		System.out.println("Number of 5 coins: "+n);
		total+=n;
		price=price-n*5;
		n=(price)/2;
		System.out.println("Number of 2 coins: "+n);
		total+=n;
		price=price-n*2;
		n=(price)/1;
		System.out.println("Number of 1 coins: "+n);
		total+=n;
		price=price-n*1;
		System.out.println("Total coins: "+total);
	}

}
