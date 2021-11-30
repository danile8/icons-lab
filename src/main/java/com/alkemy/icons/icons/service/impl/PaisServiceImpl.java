package com.alkemy.icons.icons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.icons.icons.dto.PaisDTO;
import com.alkemy.icons.icons.entity.Pais;
import com.alkemy.icons.icons.mapper.PaisMapper;
import com.alkemy.icons.icons.repository.PaisRepository;
import com.alkemy.icons.icons.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisMapper paisMapper;
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public PaisDTO save(PaisDTO dto) {
		Pais entity = paisMapper.paisDTO2Entity(dto);
		Pais entitySaved = paisRepository.save(entity);
		PaisDTO result = paisMapper.paisEntity2DTO(entitySaved);
		return result;
	}

	@Override
	public List<PaisDTO> getAllPaises() {
		List<Pais> entities = paisRepository.findAll();
		List<PaisDTO> result = paisMapper.paisEntityList2DTOList(entities);
		return result;
	}
	

}
