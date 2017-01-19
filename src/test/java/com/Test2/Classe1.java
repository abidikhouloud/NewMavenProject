package com.Test2;

public class Classe1 {
	public int a;
	public int b;
	private int nbre;

	public Classe1() {

	}

	public Classe1(int a, int b, int nbre) {
		super();
		this.a = a;
		this.b = b;
		this.nbre = nbre;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getNbre() {
		return nbre;
	}

	public void setNbre(int nbre) {
		this.nbre = nbre;
	}

	public int somme1(int a, int b) {
		return (a + b);
	}

	public boolean comparaison(int nbre, int a, int b) {
		if (somme1(a, b) < nbre) {
			return true;
		} else
			return false;

	}
}
