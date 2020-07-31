package heap_sort;

import java.util.Random;

import binary_HEAP.Heap;
public class App {

	public static void main(String[] args) {
		Heap h = new Heap(20);
		Random r = new Random();
		for (int i = 0; i < h.getSize(); i++) {//Insetion will make nlog(n) --> n*addition to complexity of log(n)
			h.add(r.nextInt(1500));
		}
		Heap_sort.show(h);
		Heap_sort.sort(h);
		Heap_sort.show(h);
	}

}
