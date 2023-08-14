package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		// kullanıcadan aldığımız 2 değeri çarp
		
		Scanner input = new Scanner(System.in);
		int x,y,carp;
		System.out.println("1. sayı gir; ");
		x=input.nextInt();
		System.out.println("2. sayı gir: ");
		y=input.nextInt();
		carp=x*y;
		System.out.println(carp);

	}

}
