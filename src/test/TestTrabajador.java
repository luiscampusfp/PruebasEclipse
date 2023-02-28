package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pruebas.Trabajador;
import pruebas.clase1;

class TestTrabajador {
	Trabajador t1 = new Trabajador("Luis", 17000, 30, 0, 1);
	Trabajador t2 = new Trabajador("Luis", 27000, 30, 1, 0);
	Trabajador t3 = new Trabajador("Luis", 47000, 20, 2, 0);
	Trabajador t4 = new Trabajador("Luis", 117000, 30, 1, 4);
	Trabajador t5 = new Trabajador("Luis", 17000, 30, 3, 0);
	Trabajador t6 = new Trabajador("Luis", 18000, 20, 4, 0);
	Trabajador t7 = new Trabajador("Luis", 100000, 30, 0, 2);
	Trabajador t8 = new Trabajador("Luis", 197000, 50, 0, 0);
	Trabajador t9 = new Trabajador("Luis", -37000, 40, 0, 1);
	Trabajador t10 = new Trabajador("Luis", 19000, 22, 1, 0);

	@Test
	void calcularSalarioBrutoMensual() throws Exception {
		assertEquals(1416.67, t1.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(2250, t2.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(3916.67, t3.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(9750, t4.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(1416.67, t5.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(1500, t6.calcularSalarioBrutoMensual(), 0.01);// adasdadw
		assertEquals(8333.33, t7.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(16416.67, t8.calcularSalarioBrutoMensual(), 0.01);
		assertEquals(1583.33, t10.calcularSalarioBrutoMensual(), 0.01);
		assertThrows(Exception.class, () -> t9.calcularSalarioBrutoMensual());
	}

}
