package com.hlc.coche_mvc.servicio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hlc.coche_mvc.entidad.Coche;
import com.hlc.coche_mvc.repositorio.CocheRepositorio;

class CocheServicioImplTest {

	@Mock // -> Simulamos el repositorio como Dependencia
	private CocheRepositorio cocheRepositorio;
	
	@InjectMocks // -> Creamos una instancia real del CocheServicioImpl y se inyecta automáticamente el m
	private CocheServicioImpl cocheServicio;
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void obtenerTodosLosCoches() {
		List<Coche> coches = Arrays.asList(
				new Coche("Toyota", 123456.79, "1234ABC", "rojo"),
				new Coche("Ford", 654321.18, "1234ABC", "azul")
				);
		when(cocheRepositorio.findAll()).thenReturn(coches);
		
		//Llamar al servicio
		//List<Coche> resultado = cocheServicio.obtenerTodosLosCoches();
		
		//assertEquals(2, resultado.size(), "Debe devolver 2 coches");
		verify(cocheRepositorio, times(1));
	}
}
