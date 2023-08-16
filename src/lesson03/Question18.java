package lesson03;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// girilen sayının basamaklarının toplamı

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi girin");
		int sayi = scanner.nextInt();

		int sayac = 0, toplam = 0;

		while (sayi != 0) {
			toplam = (sayi % 10) + toplam;
			sayi /= 10;
			sayac++;
		}

		System.out.println("Basamak Toplamı: " + toplam);
	}

}
