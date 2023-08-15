package lesson02;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// girilen 3 sayıdan en büyüğü
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. sayı girin");
		int sayi1=scanner.nextInt();
		
		System.out.println("2. sayı girin");
		int sayi2=scanner.nextInt();
		
		System.out.println("3. sayı girin");
		int sayi3=scanner.nextInt();
		
		if (sayi1>sayi2&&sayi1>sayi3) {
			System.out.println("En büyüğü "+sayi1);
		}else if (sayi2>sayi1&&sayi2>sayi3) {
			System.out.println("En büyüğü "+sayi2);
		}else {
			System.out.println("En büyüğü "+sayi3);
		}

	}

}
