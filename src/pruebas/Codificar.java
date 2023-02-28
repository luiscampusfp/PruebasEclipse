package pruebas;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Codificar {
	public static String generateHash(String name, String dni) {
		String input = name + dni;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger no = new BigInteger(1, messageDigest);
			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static boolean findUserByHash(String hash, String[] names, String[] dnis) {
		for (int i = 0; i < names.length; i++) {
			if (generateHash(names[i], dnis[i]).equals(hash)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String[] names = { "Emma", "Noah", "Olivia", "Liam", "Ava", "Mason", "Sophia", "Jacob", "Isabella", "William" };
		String[] dnis = { "12345678A", "23456789B", "34567890C", "45678901D", "56789012E", "67890123F", "78901234G",
				"89012345H", "90123456I", "01234567J" };
		System.out.println(generateHash("Pedro", "56735412E"));
		System.out.println(findUserByHash("d111afb15b383222a3cf579c815361c6b1660a27275532245f00240048391d53",names, dnis));
	}
}
