package bellman;
/*
 * rezolva treaba asta, incat sa iti dea valorile matricei D^4 din curs (programare dinamica II)
 * nu trebuie sa dea infinit!
 */
import java.util.*;

public class BellmanFord {

	static double getMin(double a, double b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		double[][] d = new double[5][5];
		double[][] w = new double[5][5];

		w[0][0] = 0;
		w[0][1] = 3;
		w[0][2] = 8;
		w[0][3] = Double.POSITIVE_INFINITY;
		w[0][4] = -4;

		w[1][0] = Double.POSITIVE_INFINITY;
		w[1][1] = 0;
		w[1][2] = Double.POSITIVE_INFINITY;
		w[1][3] = 1;
		w[1][4] = 7;

		w[2][0] = Double.POSITIVE_INFINITY;
		w[2][1] = 4;
		w[2][2] = 0;
		w[2][3] = Double.POSITIVE_INFINITY;
		w[2][4] = Double.POSITIVE_INFINITY;

		w[3][0] = 2;
		w[3][1] = Double.POSITIVE_INFINITY;
		w[3][2] = -5;
		w[3][3] = 0;
		w[3][4] = Double.POSITIVE_INFINITY;

		w[4][0] = Double.POSITIVE_INFINITY;
		w[4][1] = Double.POSITIVE_INFINITY;
		w[4][2] = Double.POSITIVE_INFINITY;
		w[4][3] = 6;
		w[4][4] = 0;

		for(int i=0; i<5; i++)
		for(int j=0; j<5; j++)
		d[i][j]=w[i][j];	
		
		int i = 0;
		for (int j = 0; j < 5; j++) {
			//d[i][j] = Double.POSITIVE_INFINITY;
			for (int k = 0; k < 5; k++) 
			{
				if(i!=j){
					if(d[i][j] > d[i][k] + w[k][j])
					
						d[i][j] =d[i][k] + w[k][j];
				}
			}
			
		}

		for (int n = 0; n<5; n++)
		{
			for(int m=0; m<5; m++)
			
				
				System.out.print(d[n][m] + "          ");
			
			System.out.println();
		}
		
	}

}
