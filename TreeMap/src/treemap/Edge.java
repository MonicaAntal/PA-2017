package treemap;

public class Edge implements Comparable<Edge> {

	public  int nodi;
	public int nodo;	
	
	
	public int compareTo(Edge arg0) {
		
		if (arg0.nodi < this.nodi)
			return 1;
		else if (arg0.nodi == this.nodi)
		{
			if (arg0.nodo < this.nodo)
				return 1;
			else if  (arg0.nodo == this.nodo)
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}

	
	
	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return super.hashCode();
		
	}



	@Override
	public boolean equals(Object obj) {
		Edge c = (Edge) obj;
		return (this.nodi==c.nodi && this.nodo == c.nodo)?true:false; 
	}



	public Edge(int in, int out)
	{
		nodi=in;
		nodo = out;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nodi + " " + nodo + " " ;
	}
	
	
}
