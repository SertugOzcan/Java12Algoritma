package lesson03;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Question19 {

	public static void main(String[] args) {
		// girilen sayının 5 in kuvveti olup olmadığını bulaılım

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("sayi gir");
//		
//		int sayi = scanner.nextInt();
//		
//		String besinKatimi ="5 in katı değildir";
//        
//        while (sayi!=1) {
//			if (sayi%5!=0) {
//				besinKatimi="5 in katı değildir";
//				sayi=1;
//				
//			}else {
//				besinKatimi="Beşin katıdır";
//				sayi/=5;
//			}
//		}System.out.println(besinKatimi);

		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi gir");
		int sayi = scanner.nextInt();
		boolean kontrol = true;
		while (kontrol == true) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
				if (sayi==1) {
					System.out.println("5in kuvvetidir");
					kontrol=false;
				}
			}else {
				System.out.println("5in kuvveti değildir");
				kontrol = false;
				
			}
		}

	}

}
