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
	        if (cocheServicio.listarTodosLosCoches().iterator().hasNext()) {
	            return;
	        }
	        
	        Coche coche1 = new Coche();
	        coche1.setNombre("Coche 1");
	        coche1.setPrecio(new Double("10843.99"));
	        coche1.setMatricula("1234ABC");
	        coche1.setColor("rojo");
	        cocheServicio.guardarCoche(coche1);
	        
	        // Coche coche1 = new Coche("Toyota", 28947.89, "1234ABC", "rojo");
	        
	        Coche coche2 = new Coche();
	        coche2.setNombre("Coche 2");
	        coche2.setPrecio(new Double("15998.49"));
	        coche2.setMatricula("4321CBA");
	        coche2.setColor("azul");
	        cocheServicio.guardarCoche(coche2);
	        
	     // Coche coche2 = new Coche("Ford", 28947.89, "1234ABC", "azul");
	    }
}

