package lesson03;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// girilen sayıya kadar tek olan sayıların toplamı
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi gir");
		int sayi = scanner.nextInt();
		int i=1;
		int toplam=0;
		while (i<=sayi) {
			if (i%2!=0) {
				toplam=toplam+i;
			}
			i++;
		}System.out.println(toplam);
	}

}
