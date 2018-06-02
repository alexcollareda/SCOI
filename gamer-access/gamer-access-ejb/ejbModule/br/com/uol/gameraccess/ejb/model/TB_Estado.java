package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Estado database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Estado.findAll", query="SELECT t FROM TB_Estado t")
public class TB_Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoEstado")
	private int codigoEstado;

	@Column(name="DescricaoEstado")
	private String descricaoEstado;

	public TB_Estado() {
	}

	public int getCodigoEstado() {
		return this.codigoEstado;
	}

	public void setCodigoEstado(int codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getDescricaoEstado() {
		return this.descricaoEstado;
	}

	public void setDescricaoEstado(String descricaoEstado) {
		this.descricaoEstado = descricaoEstado;
	}

}