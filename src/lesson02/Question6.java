package lesson02;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kullanıcıdan alınan vize ve final notlarını hesaplayarak
		// geçip geçmediğini hesapla
		// vize %40 final %60 50 geçer not

		Scanner scanner = new Scanner(System.in);
		
		double vizeCarpani = 0.40, finalCarpani = 0.60;
		
		System.out.println("Vize notu girin: ");
		int vizeNotu = scanner.nextInt();
		
		System.out.println("Final notu girin: ");
		int finalNotu = scanner.nextInt();

		if ((vizeNotu * vizeCarpani) + (finalNotu * finalCarpani) > 50) {
			System.out.println("Geçtiniz");
		} else {
			System.out.println("kaldınız");
		}

	}

}
