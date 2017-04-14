package kruskal;

public class Muchie {

	int v1;
	int v2;
	int value;

	public Muchie(int v1, int v2, int value) {
		this.v1 = v1;
		this.v2 = v2;
		this.value = value;
	}

	public int getvalue() {
		return value;
	}

	public void setvalue(int value) {
		this.value = value;
	}

	public void Swap(Muchie a) {
		int aux;
		aux = this.v1;
		this.v1 = a.v1;
		a.v1 = aux;
		aux = this.v2;
		this.v2 = a.v2;
		a.v2 = aux;
		aux = this.value;
		this.value = a.value;
		a.value = aux;

	}

	public void afis() {
		System.out.println(v1 + " " + v2 + " " + value);
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}

}
