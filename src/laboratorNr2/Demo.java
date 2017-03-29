package laboratorNr2;

public class Demo {

	public static void main(String[] args) {
	
		Graf graf = new Graf(4);
		graf.AdaugaMuchie(0, 1);
		graf.AdaugaMuchie(1, 2);
		graf.AdaugaMuchie(2, 0);
		graf.AdaugaMuchie(3, 0);
		System.out.println(graf);

		
	}

}
