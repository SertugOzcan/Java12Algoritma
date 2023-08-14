package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// satış fiyatının içinde %18 kdv ve %15 kar olduğunu
		// biliyoruz verilen ürün fiyatının ham fiyatını bulan program
		Scanner scanner = new Scanner(System.in);
		int urunFıat;
		double hamFıat;
		double kdv = 1.18;
		double kar = 1.15;
		System.out.println("Ürünün fiyatını girin: ");
		urunFıat = scanner.nextInt();
		hamFıat = urunFıat / (kdv * kar);
		System.out.println(hamFıat);
	}

}
