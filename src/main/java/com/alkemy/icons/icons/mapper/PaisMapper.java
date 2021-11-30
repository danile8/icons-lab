package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.alkemy.icons.icons.dto.PaisDTO;
import com.alkemy.icons.icons.entity.Pais;

@Component
public class PaisMapper {
	
	
	public Pais paisDTO2Entity(PaisDTO dto) {
		Pais pais = new Pais ();
		pais.setImagen(dto.getImagen());
		pais.setDenominacion(dto.getDenominacion());
		pais.setCantidadHabitantes(dto.getCantidadHabitantes());
		pais.setContinente(dto.getContinente());
		pais.setIcons(dto.getIcons());
		pais.setSuperficie(dto.getSuperficie());
		return pais;
	}
	
	public PaisDTO paisEntity2DTO(Pais entity) {
		PaisDTO dto = new PaisDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		dto.setCantidadHabitantes(entity.getCantidadHabitantes());
		dto.setContinente(entity.getContinente());
		dto.setIcons(entity.getIcons());
		dto.setSuperficie(entity.getSuperficie());
		return dto;
	}
	
	public List<PaisDTO> paisEntityList2DTOList(List<Pais> entities){
		List<PaisDTO> dtos = new ArrayList<>();
		for (Pais entity : entities) {
			dtos.add(this.paisEntity2DTO(entity));
		}
		return dtos;
	}
}
