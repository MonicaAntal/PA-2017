package huffman;

import java.util.*;

public class Heap implements Comparator<Nod> {

	ArrayList<Nod> heap = new ArrayList<Nod>();

	Heap() {
		heap.add(0, null);
	}

	public int compare(Nod a, Nod b) {
		if (a.getFrecventa() > b.getFrecventa())
			return -1;
		else if (a.getFrecventa() < b.getFrecventa())
			return 1;
		return 0;
	}

	public void Swap(int i, int j) {
		Nod aux = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, aux);
	}

	public void sift_down(int i) {
		int k, j;
		k = i;
		do {
			j = k;
			if (2 * j <= heap.size() - 1
					&& compare(heap.get(2 * j), heap.get(k)) == 1)
				k = 2 * j;
			if (2 * j + 1 <= heap.size() - 1
					&& compare(heap.get(2 * j + 1), heap.get(k)) == 1)
				k = 2 * j + 1;
			Swap(j, k);
		} while (k != j);
	}

	public void make_heap() {
		for (int i = (heap.size() - 1) / 2; i >= 1; i--)
			sift_down(i);
	}

	public void insert(Nod value) {
		heap.add(value);
		sift_down(1);
	}

	public Nod findmin() {
		return heap.get(1);
	}
	
	public void delete_min() {
		if (heap.size() == 2) {
			heap.remove(heap.size() - 1);
		} else {
			heap.set(1, heap.get(heap.size() - 1));
			heap.remove(heap.size() - 1);
			sift_down(1);
		}
	}

	public void afisare() {
		for (int i = 1; i < heap.size(); i++) {
			System.out.println(heap.get(i));
		}
	}
}
