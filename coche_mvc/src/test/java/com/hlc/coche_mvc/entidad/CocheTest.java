package com.hlc.coche_mvc.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CocheTest {
	
	private Coche coche;
	
	@BeforeEach
	void setup() {
		coche = new Coche();
	}

	@Test
	@DisplayName("Prueba de Getter and Setter de ID")
	void testSetAndGetID() {
		Long id = 1L;
		coche.setId(1L);
		
		assertEquals(id, coche.getId(), "El ID no es el mismo que se esperaba");
	}

	@Test
	@DisplayName("Prueba de Getter and Setter de Nombre")
	void testSetAndGetNombre() {
		String nombre = "Dacia";
		coche.setNombre("Dacia");
		
		assertEquals(nombre, coche.getNombre(), "El nombre no es el mismo que se esperaba");
	}
	
	@Test
	@DisplayName("Prueba de Getter and Setter de Precio")
	void testSetAndGetPrecio() {
		Double precio = 12379.87;
		coche.setPrecio(12379.87);
		
		assertEquals(precio, coche.getPrecio(), "El precio no es el mismo que se esperaba");
	}
	
	@Test
	@DisplayName("Prueba de Getter and Setter de Matrícula")
	void testSetAndGetMatricula() {
		String matricula = "1234ABC";
		coche.setMatricula("1234ABC");
		
		assertEquals(matricula, coche.getMatricula(), "La matrícula no es la mismo que se esperaba");
	}
	
	@Test
	@DisplayName("Prueba de Constructor con parámetros")
	void testConstructorParametros() {
		String nombre = "Dacia";
		Double precio = 12379.87;
		String matricula = "1234ABC";
		String color = "azul";
		
		Coche coche = new Coche(nombre, precio, matricula, color);
		
		assertEquals(nombre, coche.getNombre(), "El nombre no es el mismo que se esperaba");
		assertEquals(precio, coche.getPrecio(), "El precio no es el mismo que se esperaba");
		assertEquals(matricula, coche.getMatricula(), "La matrícula no es la mismo que se esperaba");
		assertEquals(color, coche.getColor(), "El color no es el mismo que se esperaba");
		
		
	}
}
