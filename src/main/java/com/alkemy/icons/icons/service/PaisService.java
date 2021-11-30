package com.alkemy.icons.icons.service;

import java.util.List;

import com.alkemy.icons.icons.dto.PaisDTO;

public interface PaisService {

	PaisDTO save(PaisDTO dto);
	List<PaisDTO> getAllPaises();
}
