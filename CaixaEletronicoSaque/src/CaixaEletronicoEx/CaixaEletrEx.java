package CaixaEletronicoEx;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CaixaEletrEx {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> notas = new ArrayList<>();
		
		System.out.println("Digite o valor que você deseja sacar:");
		int valor_c = input.nextInt();
		
		int nota200_c = 200;
		int nota100_c = 100;
		int nota50_c = 50;
		int nota20_c = 20;
		int nota10_c = 10;
		int nota5_c = 5;
		int nota2_c = 2;
		int soma = 0;
		int saldo = 1000;
		
		int value = valor_c;
		
		Calendar c =  Calendar.getInstance();
		
		if(nota200_c >= nota200_c) {
			nota200_c = valor_c / 200; 
			valor_c = valor_c % 200;   
			if (nota200_c != 0) {
				notas.add(nota200_c + " notas de R$ 200,00"); 
		//		System.out.println(nota200_c + " notas de R$ 200,00");
			    soma =+ soma + 200;
			    saldo =- saldo + 200; 
			}
		} 
		
		if(nota100_c >= nota100_c) {
			nota100_c = valor_c / 100; 
			valor_c = valor_c % 100;   
			if (nota100_c != 0) {
				notas.add(nota100_c + " notas de R$ 100,00"); 
		//		System.out.println(nota100_c + " notas de R$ 100,00");
			    soma =+ soma + 100;
			    saldo =- saldo + 100; 
			}
		} 
		
		if(nota50_c >= nota50_c) {
			nota50_c = valor_c / 50; 
			valor_c = valor_c % 50;   
			if (nota50_c != 0) {
				notas.add(nota50_c + " notas de R$ 50,00"); 
		//		System.out.println(nota50_c + " notas de R$ 50,00");
			    soma =+ soma + 50;
			    saldo =- saldo + 50; 
			}
		} 
		
		if(nota20_c >= nota20_c) {
			nota20_c = valor_c / 20; 
			valor_c = valor_c % 20;   
			if (nota20_c != 0) {
				notas.add(nota20_c + " notas de R$ 20,00"); 
		//		System.out.println(nota20_c + " notas de R$ 20,00");
			    soma =+ soma + 20;
			    saldo =- saldo + 20; 
			}
		} 
		
		if(nota10_c >= nota10_c) {
			nota10_c = valor_c / 10; 
			valor_c = valor_c % 10;   
			if (nota10_c != 0) {
				notas.add(nota10_c + " notas de R$ 10,00"); 
		//		System.out.println(nota10_c + " notas de R$ 10,00");
			    soma =+ soma + 10;
			    saldo =- saldo + 10; 
			}
		} 
		
		if(nota5_c >= nota5_c) {
			nota5_c = valor_c / 5; 
			valor_c = valor_c % 5;   
			if (nota5_c != 0) {
				notas.add(nota5_c + " notas de R$ 5,00"); 
		//		System.out.println(nota5_c + " notas de R$ 5,00");
			    soma =+ soma + 5;
			    saldo =- saldo + 5; 
			}
		} 
		
		if(nota2_c >= nota2_c) {
			nota2_c = valor_c / 2; 
			valor_c = valor_c % 2;   
			if (nota50_c != 0) {
				notas.add(nota2_c + " notas de R$ 2,00"); 
		//		System.out.println(nota2_c + " notas de R$ 2,00");
			    soma =+ soma + 2;
			    saldo =- saldo + 2; 
			}
		} 
		
		if (soma > value)  throw new RuntimeException("\n Não há cédulas sufientes o valor ou as cédulas não conseguem compor a quantia desejada. \""); 

	    System.out.println("Data e Hora atual : "+ c.getTime());
		System.out.println(notas);
		
	}

}
