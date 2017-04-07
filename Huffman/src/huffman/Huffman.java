package huffman;
import java.util.*;

public class Huffman {

	public static void main(String[] args) {
		
		
		Heap H = new Heap();
		H.tree.add(new Nod(-1, "dummy"));
		H.tree.add(new Nod(1, "c"));
		H.tree.add(new Nod(4, "b"));
		H.tree.add(new Nod(2, "a"));
		H.SiftDown(1);
	}

	

}
