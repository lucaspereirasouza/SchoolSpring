package com.example.fixacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcurso;
	@Column(length = 50,nullable = false)
	private String titulocurso;
	@Column(length = 50,nullable = false)
	private String descricao;
	@Column(length = 50,nullable = false)
	private String cargahoraria;
	
//	private Area idarea;
//	private Unidade idunidade;
	
	public Curso() {}
	
	public Curso(Integer idcurso, String titulocurso, String descricao, String cargahoraria, Area idarea,
			Unidade idunidade) {
		this.idcurso = idcurso;
		this.titulocurso = titulocurso;
		this.descricao = descricao;
		this.cargahoraria = cargahoraria;
//		this.idarea = idarea;
//		this.idunidade = idunidade;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getTitulocurso() {
		return titulocurso;
	}

	public void setTitulocurso(String titulocurso) {
		this.titulocurso = titulocurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

//	public Area getIdarea() {
//		return idarea;
//	}
//
//	public void setIdarea(Area idarea) {
//		this.idarea = idarea;
//	}
//
//	public Unidade getIdunidade() {
//		return idunidade;
//	}
//
//	public void setIdunidade(Unidade idunidade) {
//		this.idunidade = idunidade;
//	}
	
	
}

