package kruskal;
import java.util.*;

public class KruskalDemo {

	public static void main(String[] args) {
		
		ArrayList<Muchie> m = new ArrayList<Muchie>(); //creez un sir de muchii si adaug muchii la el
		m.add(new Muchie(1,2,4));
		m.add(new Muchie(1,5,1));
		m.add(new Muchie(1,4,5));
		m.add(new Muchie(1,4,3));
		m.add(new Muchie(3,6,2));
		m.add(new Muchie(2,4,5));
		m.add(new Muchie(2,5,7));
	
		
		//Ordonarea sirului dupa cost
		
		for(int i=0;i<m.size();i++)
			for(int j=0; j<m.size();j++)
			{
				if(m.get(i).getvalue()<m.get(j).getvalue())
				{
					m.get(i).Swap(m.get(j));
				}
			}
		int[] noduri = new int[7];
		//sir cu numerele nodurilor
		for(int i=1;i<=6;i++)
			noduri[i] = i;
		
		ArrayList<Muchie> arbore = new ArrayList<Muchie>();
		int NrMuchii = 0; //Numara muchiile din arbore
		arbore.add(m.get(0));
		NrMuchii++;
		noduri[m.get(0).getV2()] = noduri[m.get(0).getV1()];
		int k = 1;
 		while(NrMuchii<6-1&& k<m.size())
 		{
 			if(noduri[m.get(k).getV1()]!=noduri[m.get(k).getV2()])
 			{
 				arbore.add(m.get(k));
 				for(int j = 1;j<=6;j++)
 					if(noduri[j] == noduri[m.get(k).getV2()])
 						noduri[j] = noduri[m.get(k).getV1()];
 				NrMuchii++;
 			}
 			k++;
 		}
 		
		for(int i=0;i<arbore.size();i++)
			arbore.get(i).Afisare();
		
	}
}
