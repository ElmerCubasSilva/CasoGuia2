package com.senati.Iti;

import java.util.Scanner;

public class Caso4_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Ingrese primer n�mero : ");
		num1=sc.nextInt();
		System.out.print("Ingrese segundo n�mero : ");
		num2=sc.nextInt();
		
		String res;
		
		if (num1==num2)
			res="Los n�meros son  iguales";
		else if (num1<num2)
			res="El primer n�mero es menor";
		else
			res="El segundo n�mero es menor";
		
		System.out.println("R E S U L T A D O");
		System.out.println(res);

	}

}
