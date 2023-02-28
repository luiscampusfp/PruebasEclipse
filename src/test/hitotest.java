package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pruebas.HitoIndividual;

class hitotest {

	int[] datos = { 10, 45, 60, 35, 10, 12 };

	@Test
	void test() {
		double r = HitoIndividual.obtener_media(datos);
		assertEquals(40, r, 0.01);
	}

}
