package pruebas;

import java.util.Scanner;

public class HitoIndividual {
	public static double obtener_media(int[] numeros) {
		int suma = 0;
		int conta = 0;
		int suma2 = 0;
		int total_num = 0;

		for (int n : numeros) {
			if (n >= 20 && n <= 50) {
				suma += n;
				conta++;
			} else {
				suma2 += n;
				total_num++;
			}
		}
		return (double) suma / conta;
	}

	public static String calcularPrima(int numeroEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) {
		String prima;
		if (directivo == '+' && mesesTrabajo >= 12) {
			prima = "P1";
		} else if (directivo == '-' && mesesTrabajo >= 12) {
			prima = "P2";
		} else if (directivo == '+' && mesesTrabajo < 12) {
			prima = "P3";
		} else {
			prima = "P4";
		}
		return numeroEmpleado + " " + nombreEmpleado + ": " + prima;
	}

	public static void paresImpares(int[] numeros) {
		int c = 0, par = 0, impar = 0;
		while (c != numeros.length) {
			if (numeros[c] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			c++;
		}
		System.out.println(par + " - " + impar);
	}

	public static double media(double[] valores, double minimo, double maximo) {
		int totalEntrada = 0;
		int totalValido = 0;
		double suma = 0;

		for (int i = 0; i < valores.length && totalEntrada < 100; i++) {
			totalEntrada++;
			if (valores[i] >= minimo && valores[i] <= maximo) {
				totalValido++;
				suma += valores[i];
			}
		}

		return totalValido > 0 ? suma / totalValido : -999;
	}

}