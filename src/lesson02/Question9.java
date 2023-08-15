package lesson02;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// girilen ortalamanın harf notuna göre geçip geçmediği
		// 90 aa
		// 80-90 bb
		// 70-80 cc
		// 6070 dd
		// 60 dan küçük ff kaldı

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ortalama girin: ");
		int ortalama = scanner.nextInt();

		if (ortalama > 100 || ortalama < 0) {
			System.out.println("geçerli değer girin");
		} else {
			if (ortalama >= 90) {
				System.out.println("Not AA ");
			} else if (ortalama >= 80) {
				System.out.println("Not BB");
			} else if (ortalama >= 70) {
				System.out.println("Not CC");
			} else if (ortalama >= 60) {
				System.out.println("Not DD");
			} else {
				System.out.println("Not FF kaldı");
			}

		}

	}

}
