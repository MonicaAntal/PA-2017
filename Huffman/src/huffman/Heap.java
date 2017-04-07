package huffman;

import java.util.ArrayList;
import java.util.List;


public class Heap{
	ArrayList<Nod> tree;
	
	public Heap()
	{
		tree = new ArrayList<Nod>();
	}
	
	void MakeHeap(){
		
		
	}
	
	void Insert(){
		
		
	}
	
	void SiftDown(int i){
		
		int k = i;
		int j=k;
		do
		{
			j=k;
			if (2*j < tree.size() && tree.get(2*j).freq > tree.get(k).freq)
			{
				k = 2*j;
			}
			if (2*j+1 < tree.size() && tree.get(2*j+1).freq > tree.get(k).freq)
			{
				k = 2*j+1;
			}
			Swap(j,k);
		}
		while(j!=k);
		
	}
	
	static void Swap(Nod a , Nod b) 
	{
		Nod aux = a;
		a = b;
		b = aux;
	}
	void Swap(int i, int j) 
	{
		Nod aux = tree.get(i);
		tree.set(i, tree.get(j));
		tree.set(j, aux);
		
	}
	
	void Percolate(int k){
		
		int k = i;
		int j;
		do
		{
			j=k;
			if(j>1 && tree.get(j/2).freq < tree.get(k).freq)
			{
				k=j/2;
			}
			Swap(j,k);
			
		}
		while(j!=k);  //nu cred ca functioneaza chestia asta
		
		
	}
}
