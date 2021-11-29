package com.alkemy.icons.icons.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	@Column(name="cant_habitantes")
	private Long cantidadHabitantes;
	
	private Long superficie;
	
	@ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "continente_id", insertable = false, updatable = false)
	private Continente continente;
	
	
	@ManyToOne(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	@JoinTable(
			name= "icon_pais",
			joinColumns = @JoinColumn(name = "pais_id"),
			inverseJoinColumns = @JoinColumn(name = "icon_id")
			)
	private Set<Icon> icons = new HashSet<>();
	
	
	
	
	

}
