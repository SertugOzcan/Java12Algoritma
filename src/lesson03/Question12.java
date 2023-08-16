package lesson03;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// girilen iki sayının toplamı çift ise true tek ise false boolean
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.sayı girin");
		int sayi1 =scanner.nextInt();
		System.out.println("2.sayı girin");
		int sayi2 =scanner.nextInt();
		boolean dogruMu=true;
		if ((sayi1+sayi2)%2==0) {
			dogruMu=true;
			System.out.println("çift");
		}else {
			System.out.println("tek");
		}
	}

}
