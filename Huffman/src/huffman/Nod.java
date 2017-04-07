package huffman;

import java.util.List;

class Nod {
	String value; // a,b,c,d,e
	Integer freq;     // 2,3,4,1,5
	List<Boolean> code;
	
	public Nod(Integer freq, String value )
	{
		this.freq = freq;
		this.value = value;
	}
}

	
