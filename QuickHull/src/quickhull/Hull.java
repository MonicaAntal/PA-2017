package quickhull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Hull {

	Queue<Point> Q = new LinkedList<Point>();
	Point pozMax;
	Point pozMin;
	
	public void FindExtr(ArrayList<Point> p)
	{
		
		Point pmin = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
		Point pmax = new Point(Integer.MIN_VALUE, Integer.MIN_VALUE);
		
		for(int i=0; i<p.size(); i++)
		{
			if(compare(p.get(i).a, pmin)==1)
				pmin=p.get(i);
			
			if(compare(p.get(i).a, pmax)==1)
				pmax=p.get(i);
				
		}
		Q.add(pmin);
		pozMin=pmin;
		Q.add(pmax);
		pozMax=pmax;
		
		ArrayList<Point> left = new ArrayList<Point>();
		ArrayList<Point> right = new ArrayList<Point>();
	
		
		
	}

	public Hull(ArrayList<Point> p)
	{
		ArrayList<Point> S1 = new ArrayList<Point>();
		ArrayList<Point> S2 = new ArrayList<Point>();
		for(int i=0; i<p.size(); i++)
		{
			if(Distanta(pozMax,pozMin,p.get(i))>0)
			{
				S1.add(p.get(i));
			}else
			{
				S2.add(p.get(i));
				
			}
		}
		FindHull(S1, pozMin, pozMax);
		FindHull(S2, pozMin, pozMax);
		
	}
	
	public void FindHull(ArrayList<Point> S, Point A, Point B)
	{
		
	}
	
	public double Distanta(Point A, Point B, Point C)
	{
		double dist = 0;
		int a,b,c;
		a=A.getB()-B.getB();
		b=B.getA()-A.getA();
		c=A.getA()*B.getB()-B.getA()*A.getB();
		dist =( a*C.getA()+b*C.getB()+c)/Math.sqrt(a*a+b*b);
		return dist;
				
	}
	
	
	
	private int compare(int a, Point pmin) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
