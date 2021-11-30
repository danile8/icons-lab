package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.Continente;

@Component
public class ContinenteMapper {

	public Continente continenteDTO2Entity(ContinenteDTO dto) {
		Continente continente = new Continente ();
		continente.setImagen(dto.getImagen());
		continente.setDenominacion(dto.getDenominacion());
		return continente;
	}
	
	public ContinenteDTO continenteEntity2DTO(Continente entity) {
		ContinenteDTO dto = new ContinenteDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		return dto;
	}
	
	public List<ContinenteDTO> continenteEntityList2DTOList(List<Continente> entities){
		List<ContinenteDTO> dtos = new ArrayList<>();
		for (Continente entity : entities) {
			dtos.add(this.continenteEntity2DTO(entity));
		}
		return dtos;
	}
}
