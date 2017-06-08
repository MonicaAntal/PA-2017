package huffman;
import java.util.*;
public class Nod {

	Nod left;
	Nod right;
	
	char valoare;
	int frecventa;
	ArrayList<Byte> cod = new ArrayList<Byte>();
	
	Nod(char valoare, int frecventa, ArrayList<Byte>cod)
	{
		this.valoare=valoare;
		this.frecventa=frecventa;
		this.cod=cod;
	}

	public char getValoare() {
		return valoare;
	}

	public void setValoare(char valoare) {
		this.valoare = valoare;
	}

	public int getFrecventa() {
		return frecventa;
	}

	public void setFrecventa(int frecventa) {
		this.frecventa = frecventa;
	}

	public ArrayList<Byte> getCod() {
		return cod;
	}

	public void setCod(ArrayList<Byte> cod) {
		this.cod = cod;
	}

	public Nod getLeft() {
		return left;
	}

	public void setLeft(Nod left) {
		this.left = left;
	}

	public Nod getRight() {
		return right;
	}

	public void setRight(Nod right) {
		this.right = right;
	}
	
	public String toString()
	{
		return "valoare="+valoare+" frecventa="+frecventa+" cod="+cod;
	}
}
