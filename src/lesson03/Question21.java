package lesson03;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// girilen sayı hangi basamakta ve hangi sayı
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi girin");
		int sayi = scanner.nextInt();
		
		int basamakSayisi=1;
		int basamak;
		
		while (sayi!=0) {
			basamak=sayi%10;
			sayi=sayi/10;
			System.out.println(basamakSayisi);
		}

		
		
	

}

}
