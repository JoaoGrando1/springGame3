package com.senai.joao.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String plataform;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getplataform() {
		return plataform;
	}

	public void setId(Long Id) {
		this.id = Id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

}