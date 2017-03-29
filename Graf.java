package laborator3;

import java.util.*;

public class Graf {

	private int v;
	private int m;
	ArrayList<ArrayList<Integer>> list;

	
	Graf() {
		list = new ArrayList<ArrayList<Integer>>();
		
	}
	
	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	void nod() {
		for (int i = 0; i < v; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			list.add(a);
		}
	}
	void muchie(){
		for (int j=0; j<m; j++){
			ArrayList<Integer> b = new ArrayList<Integer>();
			list.add(b);
		}
	}
	
	public void verifica(int v){
		if (v<0 || v>=(v-1)){
			throw new IndexOutOfBoundsException(+ v + "nu este intre 0 si " +(v-1));
		}
		if(list.get(v)==null){
			list.set(v, new ArrayList<Integer>());
			
		}
	}

	
	public void addMuchie(int v, int u){
		verifica(v);
		verifica(u);
		m++;
		
		
	}
	
	

}
