package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import pruebas.clase1;

class pruebas1 {
	int num1 = 15;
	int num2 = 15;
	int[] numeros1 = { 3, 5, 7 };
	int[] numeros2 = { 4, 7, 8 };
	// List<String> texto1=new ArrayList<>();

	@Test
	void valorMayor() {
		if (num2 > num1)
			fail("El numero 1 siempre debe ser mayor o igual al numero 2");
		assertFalse(num2 < num1);

	}

	@Test
	void pruebaSumna() {
		assertEquals(10, num1 + num2);
	}

	@Test
	void pruebaResta() {
		assertEquals(0, num1 - num2);
		// assertEquals(5, num1 - num2);
		assertEquals("Hola", "Hol" + "sa");
	}

	@Test
	void pruebaDivision() {
		assertThrows(Exception.class, () -> clase1.division(15, 0));
		assertEquals(10, clase1.division(100, 10));
	}

	@Test
	void pruebasGenerales() {
		// comentario original
		// dado 2 arreglos de numeros la funcion sumar recibe ambos arreglos y suma de
		// forma vectoraial
		// ejemplo 1,2,3 y 4,5,6 la suma seria 5,7,9
		assertArrayEquals(new int[] { 7, 10, 15 }, clase1.sumar(numeros1, numeros2));
		//assertNotEquals(null, null);
		assertSame(numeros2, numeros1);// iguasl que el eguals pero para objetos
		assertThrows(Exception.class, () -> clase1.division(15, 0));

	}

}
