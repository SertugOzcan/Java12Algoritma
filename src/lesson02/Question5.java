package lesson02;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// girilen tl değerini usd çeviren program
		Scanner scanner = new Scanner(System.in);
		double dolar= 27.06;
		double tl;
		System.out.println("tl giriniz");
		tl = scanner.nextDouble();
		dolar = tl/dolar;
		System.out.println("Dolar miktarı "+ dolar);
		
		
	}

}
