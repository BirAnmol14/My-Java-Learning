package binary_HEAP;

public class Heap {
	private int[] arr;
	private int last_index;
	private int size;
	public static int min_heap=0;
	public static int max_heap=1;

	public Heap(int size) {
		if(size>=1) {
		this.size = size + 1;
		arr = new int[size + 1];
		last_index = 0;
		}else {
			this.size = 2;
			arr = new int[2];
			last_index = 0;
		}
	}
	

	// Always like binary tree array addition takes place at index 1
	public void add(int k) {
		
		if (last_index < size-1 && arr != null) {
			last_index++;
			arr[last_index] = k;
			//heapify(max_heap);
			//adjust(1, max_heap);
			//heapify_bottom_up(last_index/2);
			return;
		}
		if(arr==null) {
			System.out.println("no heap exits");return;
		}
		System.out.println("Full");
	}

	public int peek() {
		if (last_index >= 1 && arr != null) {
			return arr[1];
		}
		System.out.println("No value was added");
		return Integer.MIN_VALUE;
	}

	public int getSize() {
		return size-1;
	}
	public int used_size() {
		return last_index;
	}
	private void heapify_bottom_up(int index) {
		if(index<1) {
			return;
		}
		if(index==1) {
			if(2>last_index) {
				return;
			}
			if(3>last_index) {
				int ls = arr[2 * index];
				int curr = arr[index];
				if (curr < ls) {
					arr[index] = ls;
					arr[2 * index] = curr;
				}
				return;
			}else {
				int ls = arr[2 * index];
				int curr = arr[index];
				int rs = arr[2 * index + 1];
				if (curr < ls || curr < rs) {
					if (ls > rs) {
						arr[index] = ls;
						arr[2 * index] = curr;
						
					} else if (rs > ls) {
						arr[index] = rs;
						arr[2 * index + 1] = curr;
					}
				}
			}
			return;
		}
		if(2*index<=last_index) {
			if (2 * index + 1 > last_index) {
				int ls = arr[2 * index];
				int curr = arr[index];
				if (curr < ls) {
					arr[index] = ls;
					arr[2 * index] = curr;
					heapify(index/2);
				}
				return;
			}
			int ls = arr[2 * index];
			int curr = arr[index];
			int rs = arr[2 * index + 1];
			if (curr < ls || curr < rs) {
				if (ls > rs) {
					arr[index] = ls;
					arr[2 * index] = curr;
					heapify(index/2);
				} else if (rs > ls) {
					arr[index] = rs;
					arr[2 * index + 1] = curr;
					heapify(index/2);
				}
			}
		}
	}
	public void show() {
		System.out.println("Printing Heap");
		for (int i = 1; i <= last_index && arr != null; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
	}

	public void deleteAll() {
		arr = null;
	}

	private void adjust(int index, int choice) {
		if (arr == null) {
			return;
		}
		if (2 * index > last_index) {
			return;
		}
		if (choice == Heap.max_heap) {
			if (2 * index + 1 > last_index) {
				int ls = arr[2 * index];
				int curr = arr[index];
				if (curr < ls) {
					arr[index] = ls;
					arr[2 * index] = curr;
					adjust(2 * index, choice);
				}
				return;
			}
			int ls = arr[2 * index];
			int curr = arr[index];
			int rs = arr[2 * index + 1];
			if (curr < ls || curr < rs) {
				if (ls > rs) {
					arr[index] = ls;
					arr[2 * index] = curr;
					adjust(2 * index, choice);
				} else if (rs > ls) {
					arr[index] = rs;
					arr[2 * index + 1] = curr;
					adjust(2 * index + 1, choice);
				}
			}
			return;
		}else if(choice == Heap.min_heap) {
			if (2 * index + 1 > last_index) {
				int ls = arr[2 * index];
				int curr = arr[index];
				if (curr > ls) {
					arr[index] = ls;
					arr[2 * index] = curr;
					adjust(2 * index, choice);
				}
				return;
			}
			int ls = arr[2 * index];
			int curr = arr[index];
			int rs = arr[2 * index + 1];
			if (curr > ls || curr > rs) {
				if (ls < rs) {
					arr[index] = ls;
					arr[2 * index] = curr;
					adjust(2 * index, choice);
				} else if (rs < ls) {
					arr[index] = rs;
					arr[2 * index + 1] = curr;
					adjust(2 * index + 1, choice);
				}
			}
			return;
		}
	}
	private void heapify(int choice) {
		if(arr==null) {
			return;
		}
		if(last_index>=1) {
			for(int j=size/2;j>=1;j--) {
				adjust(j, choice);
			}
		}
	}
	public int min_or_max(int choice) {
		if(choice==max_heap) {
			heapify(choice);
			return peek();
		}
		else if(choice == min_heap) {
			heapify(choice);
			return peek();
		}
		System.out.println("Invalid choice");
		return peek();
	}
	public int delete_elem() {
		if(arr==null||last_index<1) {
			return Integer.MIN_VALUE;
		}
		int val=arr[1];
		arr[1]=arr[last_index];
		last_index--;
		adjust(1, Heap.max_heap);
		return val;
	}
	public int delete_elem(int choice) {
		if(arr==null||last_index<1) {
			return Integer.MIN_VALUE;
		}
		int val=arr[1];
		arr[1]=arr[last_index];
		last_index--;
		adjust(1, choice);
		return val;
	}
	public void heap_sort(int choice) {
		//nlog(n) complexity
		if(arr==null) {
			return;
		}
		heapify(choice);
		int last=last_index;
		for(int i=last;i>=2;i--) {
			int val=delete_elem(choice);
			arr[i]=val;
		}
		last_index=last;
	}
}
