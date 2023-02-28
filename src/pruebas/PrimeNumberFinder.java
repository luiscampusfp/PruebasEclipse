package pruebas;

import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite inferior: ");
        int lower = sc.nextInt();
        System.out.print("Ingrese el límite superior: ");
        int upper = sc.nextInt();

        int[] primeNumbers = getPrimeNumbers(lower, upper);

        if (primeNumbers.length == 0) {
            System.out.println("No hay numeros primos entre esos limites");
        } else {
            System.out.print("Los números primos encontrados son: ");
            for (int prime : primeNumbers) {
                System.out.print(prime + " ");
            }
            System.out.println();
        }
    }

    public static int[] getPrimeNumbers(int lower, int upper) {
        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        int[] primeNumbers = new int[count];
        int index = 0;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                primeNumbers[index++] = i;
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}