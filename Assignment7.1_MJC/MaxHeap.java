import java.util.Arrays;

public class MaxHeap <T extends Comparable <? super T>>{
	
	private T[] heap;
	private int lastIndex;
	
	
	public MaxHeap(int capacity) {
		heap = (T[]) new Comparable[capacity];
	}
	
	public void add(T newEntry) {
		lastIndex ++;
		int newIndex = lastIndex;
		int parentIndex = newIndex /2;
		while((parentIndex >0)&& newEntry.compareTo(heap[parentIndex]) > 0) { //compares the new value to its parents, if it is larger than its parent they will swap places. 
			heap[newIndex] = heap[parentIndex];
			newIndex = parentIndex;
			parentIndex = newIndex / 2;
			System.out.println(Arrays.toString(heap));
		}//end while
		heap[newIndex] = newEntry;
		System.out.println(Arrays.toString(heap));
	}//end add

	@Override
	public String toString() {
		return "MaxHeap [heap=" + Arrays.toString(heap) + ", lastIndex=" + lastIndex + "]";
	}

}
