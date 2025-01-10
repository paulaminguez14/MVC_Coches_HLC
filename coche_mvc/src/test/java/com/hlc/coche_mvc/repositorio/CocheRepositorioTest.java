package com.hlc.coche_mvc.repositorio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyMap;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.hlc.coche_mvc.entidad.Coche;

@DataJpaTest
class CocheRepositorioTest {

	@Autowired
	private CocheRepositorio cocheRepositorio;
	
	@Test
	void testSaveAndFindAll() {
		// Crear y guardar coches
		Coche coche1 = new Coche("Toyota", 28957.99, "1234ABC", "rojo");
		Coche coche2 = new Coche("Ford", 20923.49, "1234ABC", "verde");
		
		cocheRepositorio.save(coche1);
		cocheRepositorio.save(coche2);
		
		List<Coche> coches = (List<Coche>) cocheRepositorio.findAll();
		
		Integer resultadoEsperado = 2;
		
		assertEquals(resultadoEsperado, coches.size(), "Debería haber 2 coches en la BBDD.");
		assertTrue(coches.stream().anyMatch(c -> c.getNombre().equals("Toyota")), "Debería ser Toyota");
		assertTrue(coches.stream().anyMatch(c -> c.getNombre().equals("Ford")), "Debería ser Ford");
	}
}
