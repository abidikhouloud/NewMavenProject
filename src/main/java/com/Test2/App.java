package com.Test2;

import java.io.IOException;

;

public class App

{

	public static void main(String args[]) throws IOException {

		Classe2 obj = new Classe2();

		System.out.println("nobre de constructeur est : "
				+ obj.getConstructeurs());

		System.out.println("nobre des variable  est :" + obj.getVariables());
		System.out.println("nobre des methodes  est :" + obj.getMethodes());

		System.out.println("nobre des lignes de la classe  :" + obj.getNbreLigne());
	}
}
