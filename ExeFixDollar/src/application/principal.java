package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class principal {
	
	//public double IOF = 0.6;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.println("What's the dollar price?");
		System.out.printf("The Dollar's Price is: %.2f", CurrencyConverter.DOLLAR);
		
		System.out.println("");
		System.out.println("How Many dollars will be bought?");
		currencyConverter.qtd = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f ", currencyConverter.buyDollar );
		
		
		
		
		
		sc.close();
	}

}
