package lesson03;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefona maille bir kod gelicek bu kodları biz tanımlicaz
//		kullanıcıdan maile ce telefona gelen kodu isticez
//		eğer onun mailine ve telefona giden kod ile uyuşuyosa
//		sisteme kayıt oldunuz diyelim
//		ya maili hatalıdır ya telefonu yada ikiside hatalıdır
//		kullanıcıyı bilgilendir
		
		int telefonKod= 123;
		int mailKod = 456;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Telefona gelen kodu girin");
		int kullaniciTelefon=scanner.nextInt();
		System.out.println("Maile gelen kodu girin");
		int kullaniciMail=scanner.nextInt();
		
		if (telefonKod!=kullaniciTelefon) {
			System.out.println("Telefon kodu yanlış");
		}else if (mailKod!=kullaniciMail) {
			System.out.println("Mail kodu yanlış");
		} else {
			System.out.println("Kayıt oldunuz");
		}
	}

}
