package com.senati.Iti;

import java.util.Scanner;

public class Caso4_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Ingrese primer número : ");
		num1=sc.nextInt();
		System.out.print("Ingrese segundo número : ");
		num2=sc.nextInt();
		
		String res;
		
		if (num1==num2)
			res="Los números son  iguales";
		else if (num1<num2)
			res="El primer número es menor";
		else
			res="El segundo número es menor";
		
		System.out.println("R E S U L T A D O");
		System.out.println(res);

	}

}
