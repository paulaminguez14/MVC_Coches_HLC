package com.hlc.coche_mvc.servicio;

import org.springframework.stereotype.Service;

import com.hlc.coche_mvc.entidad.Coche;
import com.hlc.coche_mvc.repositorio.CocheRepositorio;

@Service
public class CocheServicioImpl implements CocheServicio{
	
	private CocheRepositorio cocheRepositorio;
	
	public CocheServicioImpl(CocheRepositorio cocheRepositorio) {
		this.cocheRepositorio = cocheRepositorio;
	}

	//@Override
	public Coche obtenerCochePorID(Long id) {
		//return cocheRepositorio.findById(id).orElseThrow(() -> new RunTimeException("Coche no encontrado"));
	}
	
	//@Override
	public void guardarCoche(Coche coche) {
		return cocheRepositorio.save(coche);
	}
	
	//@Override
	public void eliminarCoche(Long id) {
		cocheRepositorio.deleteById(id);
	}
}
