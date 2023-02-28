package pruebas;

public class clase1 {
	public static void main(String[] args) {
		int num = 2;
		while (true) {
			if (isPrime(num)) {
				System.out.println(num);
			}
			num++;
		}
	}

	public static boolean isPrime(int num2) {
		if (num2 < 2) {
			return false;
		}
		for (int i = 2; i <= num2 / 2; i++) {
			if (num2 % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] sumar(int[] num1, int[] num2) {
		int[] res = new int[num1.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = num1[i] + num2[i];
		}
		return res;
	}
	
	public static int division(int n1, int n2) {
		return n1/n2;
	}
}
