package lesson02;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen sayının tek mi çift mi

		Scanner scanner = new Scanner(System.in);
		int sayi;
		System.out.println("sayı gir");
		sayi = scanner.nextInt();
		if (sayi % 2 == 0) {
			System.out.println("çift");
		} else {
			System.out.println("tek");

		}

	}

}
