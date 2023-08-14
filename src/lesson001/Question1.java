package lesson001;

import java.util.Scanner;

import javax.naming.StringRefAddr;

public class Question1 {

	public static void main(String[] args) {
		
		// verilen isim ve soyisim değerlerini
		//hoşgeldiniz isim + sayisim yazdırarlım
		
		Scanner input = new Scanner(System.in);
		String ad,soyad ;
		System.out.println("isim girin: ");
		ad=input.next();
		System.out.println("soyisim girin");
		soyad=input.next();
		
		System.out.println("Hoşgeldiniz: " +ad+" "+soyad);
		
	}

}
