package binary_HEAP;

public class App {

	public static void main(String[] args) {
		Heap h=new Heap(4);
		System.out.println("Heap size: "+h.getSize());
		h.add(1);
		h.add(2);
		h.add(3);
		h.show();
		h.add(4);
		h.show();
		System.out.println("Used size: "+h.used_size());
		System.out.println("Deleting element: "+h.delete_elem());
		System.out.println("Used size: "+h.used_size());
		h.show();
		h.add(6);
		h.show();
		int val = h.min_or_max(Heap.max_heap);
		h.show();
		System.out.println("Largest element: "+val);
		val=h.min_or_max(Heap.min_heap);
		h.show();
		System.out.println("Minimum element: "+val);
		//Heap sort
		h.heap_sort(Heap.max_heap);
		//Ascending Order
		h.show();
		h.heap_sort(Heap.min_heap);
		//Descending Order
		h.show();
		h.deleteAll();
	}

}
