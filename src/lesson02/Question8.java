package lesson02;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Question8 {

	public static void main(String[] args) {
		// kenarları girilen üçgen nasıl bir üçgen olduğunu söyleyen

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. kenar girin:");
		int kenar1 = scanner.nextInt();
		System.out.println("2. kenar girin:");
		int kenar2 = scanner.nextInt();
		System.out.println("3. kenar girin:");
		int kenar3 = scanner.nextInt();

		if (kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Eşkenar üçgen");
		} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
			System.out.println("ikizkenar");
		} else {
			System.out.println("çeşitkenar");
		}
	}

}
