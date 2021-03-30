package com.senati.Iti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Sueldo:");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.03f + sueldo;
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.08f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		System.out.println("----- R E S U L T A D O S -----");
		System.out.println("Sueldo Bruto....:" + sueldo );
		System.out.println("Impuesto a Pagar:" + impuesto );
		

	}

}
