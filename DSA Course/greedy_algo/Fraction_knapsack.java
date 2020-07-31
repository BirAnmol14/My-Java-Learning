package greedy_algo;

import java.util.ArrayList;
import java.util.Collections;

public class Fraction_knapsack{
	public static void main(String[] args) {
		ArrayList<Items> list =new ArrayList<Items>();
		list.add(new Items("A", 20.0, 100.0));
		list.add(new Items("B", 30.0, 120.0));
		list.add(new Items("C", 10.0, 60.0));
		System.out.println(list);
		find_solution(50.0, list);
	}
	public static void find_solution(Double max_weight,ArrayList<Items> list) {
		Collections.sort(list);
		double total=0.0;
		for(int i=0;i<list.size()&&max_weight>0;i++) {
			Items it=list.get(i);
			double qty=max_weight/it.getWeight();
			if(qty>1) {
				qty=1;
			}
			total+=qty*it.getPrice();
			max_weight-=qty*it.getWeight();
			System.out.println(it.getName()+"\tQty: "+(float)qty+"\tCost: "+qty*it.getPrice());
		}
		System.out.println("Final val: "+total);
	}
}
class Items implements Comparable<Items>{
	private String name;
	private Double weight;
	private Double price;
	private Double ratio;
	
	public Items(String name,Double weight, Double price) {
		this.name=name;
		this.weight = weight;
		this.price = price;
		this.ratio=this.price/this.weight;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Items o) {
		if(this.ratio>o.ratio) {
			return -1;
		}
		if(this.ratio<o.ratio) {
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Items [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
}