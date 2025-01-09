package com.hlc.coche_mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hlc.coche_mvc.entidad.Coche;
import com.hlc.coche_mvc.servicio.CocheServicio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializarDatos {
	 @Autowired
	    private CocheServicio cocheServicio;
	    
	    @PostConstruct
	    public void init() {
	        // Crear y guardar algunos coches de ejemplo
	        if (cocheServicio.listarTodosLosCoches().iterator().hasNext()) {
	            // Si ya hay datos, no inicializamos.
	            return;
	        }
	        
	        Coche coche1 = new Coche();
	        coche1.setNombre("Coche 1");
	        coche1.setPrecio(new Double("10.99"));
	        coche1.setMatricula("1234ABC");
	        coche1.setColor("rojo");
	        cocheServicio.guardarCoche(coche1);
	        
	        Coche coche2 = new Coche();
	        coche2.setNombre("Coche 2");
	        coche2.setPrecio(new Double("15.49"));
	        coche2.setMatricula("4321CBA");
	        coche2.setColor("azul");
	        cocheServicio.guardarCoche(coche2);
	    }
}

