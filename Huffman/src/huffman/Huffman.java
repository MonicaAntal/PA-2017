package huffman;

import java.util.*;

public class Demo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String text;
		int[] frecv = new int[256];
		Arrays.fill(frecv, 0);

		System.out.println("Introduceti textul de codificat: ");
		text = s.nextLine();

		for (int i = 0; i < text.length(); i++)
			frecv[text.charAt(i)]++;

		Heap h = new Heap();
		ArrayList<Byte> bit = new ArrayList<Byte>();
		int k = 1;
		for (int i = 97; i < 122; i++) {
			if (frecv[i] > 0) {
				Nod n = new Nod((char) i, frecv[i], bit);
				// h.heap.add(k,n);
				h.insert(n);
				k++;
			}
		}

		System.out.println("Frecventele: ");
		for (int i = 1; i < h.heap.size(); i++) {
			System.out.println(h.heap.get(i).getValoare() + " cu "
					+ h.heap.get(i).getFrecventa());
		}

		h.make_heap();
		System.out.println("Min-heap:");
		h.afisare();

		Nod radacina = Huffman(h);
		System.out.println("Radacina lui Huffman: ");
		System.out.println(radacina);

		System.out.println("Codarea este:");
		int n = 0;
		ArrayList<Byte> a = new ArrayList<Byte>();
		Codare(radacina, a, n);

	}

	public static Nod Huffman(Heap h) {
		Nod left, right;
		ArrayList<Byte> bit = new ArrayList<Byte>();

		do {
			left = h.findmin();
			h.delete_min();
			right = h.findmin();
			h.delete_min();
			Nod nou = new Nod('*', left.getFrecventa() + right.getFrecventa(),
					bit);
			nou.setLeft(left);
			nou.setRight(right);
			h.insert(nou);
		} while (h.heap.size() >= 3);
		return h.findmin();
	}

	public static void Codare(Nod radacina, ArrayList<Byte> cod, int i) {
		if (radacina.left != null) {
			cod.add((byte) 0);
			Codare(radacina.left, cod, i + 1);
			cod.remove(cod.size() - 1);
		}
		if (radacina.right != null) {
			cod.add((byte) 1);
			Codare(radacina.right, cod, i + 1);
			cod.remove(cod.size() - 1);
		}
		if (radacina.left == null && radacina.right == null) {

			System.out.println(radacina.getFrecventa() + "  ---  "
					+ radacina.getValoare() + "  ---  " + cod);
		}
	}

}
