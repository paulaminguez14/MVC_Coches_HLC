package com.hlc.coche_mvc.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Coche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String Nombre;
	@NotBlank(message = "El nombre no puede estar vacio")
	@Size(min=2, max=50, message="El nombre debe tener entre 2 y 50 carácteres")
	
	private Double Precio;
	
	private String Matricula;
	@Pattern(regexp = "^\\d{4}[A-Za-z]{3}$", message = "La matrícula debe tener 4 dígitos seguidos de 3 letras (ej: 5251MHX).")

	private String Color;
	@Pattern(regexp = "^(rojo|azul|verde|amarillo)$", message = "El color debe ser uno de: rojo, azul, verde o amarillo.")
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
}
