package exercise1;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short number;

		// Le pedimos al usuario que introduzca un valor
		System.out.print("Introduzca un número: ");
		number = sc.nextShort();
		System.out.println("The number is " + number);
		
		System.lineSeparator();
	}
}
