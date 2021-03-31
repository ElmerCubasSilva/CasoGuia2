package com.senati.Iti;

import java.util.Scanner;
public class Caso4_2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		
	    System.out.print("Ingrese el primer numero..........: ");
	    int numero1 = sc.nextInt();
	    
	    System.out.print("Ingrese el segundo numero.........: ");
	    int numero2 = sc.nextInt();
	    
	    System.out.print("Ingrese el tercer numero..........: ");
	    int numero3 = sc.nextInt();
	    
	    String mensaje = "";
	    
	    if (numero1==numero2 && numero1==numero3)
	      mensaje= "Los tres numeros son iguales";
	    
	  
	    else if (numero1==numero2||numero2==numero3) 
	      mensaje="Hay dos numeros iguales";
	    
	    else if (numero1<numero2 && numero1<numero3 )
	      mensaje = "El primer numero " + numero1 + " es menor";
	    
	    else if (numero2<numero1 && numero2<numero3 )
		  mensaje = "El segundo numero " + numero2 + " es menor";
	    
	    else
	      mensaje= "El tercer numero " + numero3 + " es menor ";
	    
	    System.out.println("\nR E S U L T A D O S");
	    System.out.println("Mensaje : " + mensaje);
	    

	}

}