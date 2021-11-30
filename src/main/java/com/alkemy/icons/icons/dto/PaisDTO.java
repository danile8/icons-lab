package com.alkemy.icons.icons.dto;

import java.util.HashSet;
import java.util.Set;

import com.alkemy.icons.icons.entity.Continente;
import com.alkemy.icons.icons.entity.Icon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaisDTO {

	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	private Long cantidadHabitantes;
	
	private Long superficie;
	
	private Continente continente;
	
	private Set<Icon> icons = new HashSet<>();
}
