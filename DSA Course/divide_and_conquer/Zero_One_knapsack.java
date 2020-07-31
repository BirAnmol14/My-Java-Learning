package divide_and_conquer;

import java.util.ArrayList;

public class Zero_One_knapsack {

	public static void main(String[] args) {
		ArrayList<Item> list=new ArrayList<Item>();
		list.add(new Item(3,31));
		list.add(new Item(1,26));
		list.add(new Item(5,72));
		list.add(new Item(2,17));
		System.out.println("Max Stolen: "+ans(0,list,0,7));
	}
	public static int ans(int index,ArrayList<Item> list,int weight,int capacity) {
		if(index>=list.size()||index<0) {
			return 0;
		}
		Item tmp=list.get(index);
		if(weight+tmp.weight>capacity) {
			return 0+ans(index+1,list,weight,capacity);
		}
		return Integer.max(tmp.value+ans(index+1,list,weight+tmp.weight,capacity), ans(index+1,list,weight,capacity));
	}
}
class Item{
	public int weight;
	public int value;
	public Item(int weight,int value) {
		this.value=value;
		this.weight=weight;
	}
}