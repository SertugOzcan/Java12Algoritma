package lesson02;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// veilen iki sayıdan hangisinin büyük olduğu

		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2;

		System.out.println("1. sayı girin: ");
		sayi1 = scanner.nextInt();

		System.out.println("2. sayı girin: ");
		sayi2 = scanner.nextInt();

		if (sayi1 >= sayi2) {
			System.out.println(sayi1);
		} else if (sayi1 == sayi2) {
			System.out.println("sayılar eşittir");

		} else {

			System.out.println(sayi2);
		}

	}

}
