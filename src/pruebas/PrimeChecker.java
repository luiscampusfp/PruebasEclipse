package pruebas;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " es un número primo.");
		} else {
			System.out.println(num + " no es un número primo.");
		}

		int previousPrime = getPreviousPrime(num);
		int nextPrime = getNextPrime(num);

		System.out.println("El número primo anterior es: " + previousPrime);
		System.out.println("El siguiente número primo es: " + nextPrime);
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num<2147483645) {
			System.out.println("Positivo"+num);
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getPreviousPrime(int num) {
		while (true) {
			num--;
			if (isPrime(num)) {
				return num;
			}
		}
	}

	public static int getNextPrime(int num) {
		while (true) {
			num++;
			if (isPrime(num)) {
				return num;
			}
		}
	}
}
