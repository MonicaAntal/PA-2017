package treemap;


public class Point {
	public Integer x;
	public Integer y;
	
	public Point(int x, int y)
	{
		
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		
		return "x = " + x + " y= " + y;
	}
}
