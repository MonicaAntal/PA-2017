package laboratorNr2;

import java.util.*;

public class Graf {

	private int m;
	private int v;
	ArrayList<ArrayList<Integer>> list;
	private String sir;

	Graf() {
		list = new ArrayList<ArrayList<Integer>>();

	}

	public Graf(int V) {
		InitializareGraf(V);
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public void verificaV(int V) {
		if (V < 0 || V >= v) {
			throw new IndexOutOfBoundsException("varful" + V
					+ "nu este intre 0 si " + (v - 1));
		}
		if (list.get(V) == null) {
			list.set(V, new ArrayList<Integer>());
		}

	}
/*
	void nod() {
		for (int i = 0; i < v; i++) {
			ArrayList<Integer> nod = new ArrayList<Integer>();
			list.add(nod);
		}
	}

	void muchie() {
		for (int j = 0; j < m; j++) {
			ArrayList<Integer> muchie = new ArrayList<Integer>();
			list.add(muchie);
		}
	}
*/
	public void InitializareGraf(int V) {
		this.v=V;
		list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i<V; i++){
			list.add(new ArrayList<Integer>());
		}
	}
	
	public void AdaugaMuchie(int u, int w){
		verificaV(u);
		verificaV(w);
		m++;
		list.get(u).add(w);
		list.get(w).add(u);
	}
	
	public String toString(){
		
		String sir = " ";
		for(int i=0; i<v; i++){
			sir+="Nodul cu numarul " + i + " are vecinii acestia: ";
			for(int j=0; j<list.get(i).size(); j++){
				sir+=" " + list.get(i).get(j);
			}
			sir+="\n";
		}
		return sir;
	}
}
