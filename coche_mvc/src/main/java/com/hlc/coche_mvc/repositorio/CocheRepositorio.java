package com.hlc.coche_mvc.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.hlc.coche_mvc.entidad.Coche;

public interface CocheRepositorio extends CrudRepository<Coche, Long>{

}