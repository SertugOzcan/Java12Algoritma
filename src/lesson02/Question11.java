package lesson02;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// dairenin çevresini ve alanını hesaplayalım

		Scanner scanner = new Scanner(System.in);

		System.out.println("Yarıçap girin; ");
		double yarıcap = scanner.nextInt();
		double pi = 3.14;
		if (yarıcap <= 0) {
			System.out.println("lütfen pozitifsayı gir");
		} else {
			double cevre = pi * yarıcap * 2;
			double alan = pi * yarıcap * yarıcap;

			System.out.println("Çevresi " + cevre);
			System.out.println("Alanı " + alan); 

		}

	}

}
