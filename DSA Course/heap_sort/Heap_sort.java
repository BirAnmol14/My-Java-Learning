package heap_sort;
import binary_HEAP.*;
public class Heap_sort {
	public static void sort(Heap h) {
		//Complexity O(nlog(n))
		if(h==null) {
			return;
		}
		h.heap_sort(Heap.max_heap);//Most Important --> implementation in binary_Heap.Heap
	}
	public static void show(Heap h) {
		if(h!=null) {
			h.show();
		}
	}
}
