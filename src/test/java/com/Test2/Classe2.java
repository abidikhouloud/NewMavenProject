package com.Test2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;


public class Classe2 {
	
	
	Classe1 a = new Classe1() ;
	Class cA = a.getClass() ;
	
	
	static  int j = 0;
	static  int d = 0;
	static  int m = 0;
	public  int getConstructeurs() {
	
		Constructor[] constructeurs = cA.getConstructors();
		for (int i = 0; i < constructeurs.length; i++) {
			j = j + 1;
		}

		return j;
	

	}
	public int getVariables() { 
		

		  Field[] champs = cA.getDeclaredFields(); 
		  for (int i = 0; i < champs.length; i++) {
		    d=d+1;}
		  return d;
		}
	public int getMethodes() { 
		

		Method[] methodes = cA.getDeclaredMethods();
		  for (int i = 0; i <methodes .length; i++) {
		    m=m+1;}
		  return m;
		}
	
	public int  getNbreLigne () throws IOException{
		
		int count=0;
		String str="";
	
		FileInputStream fis = new FileInputStream("C:\\Test2\\Projet\\src\\test\\java\\com\\Test2\\Classe1.java");
		LineNumberReader l = new LineNumberReader(new BufferedReader(new InputStreamReader(fis)));
		while ((str=l.readLine())!=null)
		{
		count = l.getLineNumber();
		}
		return count;

	}
		
		
	
	}
