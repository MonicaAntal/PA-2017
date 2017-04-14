package treemap;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
TreeMap<Edge, Integer> graf = new TreeMap<Edge,Integer>();
		
		
		graf.put(new Edge(1,2),1);
		graf.put(new Edge(2,3),2);
		graf.put(new Edge(3,4),1);
		graf.put(new Edge(4,5),7);
		graf.put(new Edge(2,4),6);
		
		TreeSet<Point> set = new TreeSet<Point>(new PointComparator());
		
		set.add(new Point(1,2));
		set.add(new Point(2,3));
		set.add(new Point(6,4));
		set.add(new Point(3,5));
		
		System.out.println(set);
	
		List<Integer> list = new ArrayList<Integer>(); 
			list.addAll(graf.values());
		Collections.sort(list);	
		System.out.println(list);
		System.out.println(graf);
		
		//to do : implement kruskal, prim

	}

}
