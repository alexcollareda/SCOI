package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Raca database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Raca.findAll", query="SELECT t FROM TB_Raca t")
public class TB_Raca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoRaca")
	private int codigoRaca;

	@Column(name="DescricaoRaca")
	private String descricaoRaca;

	public TB_Raca() {
	}

	public int getCodigoRaca() {
		return this.codigoRaca;
	}

	public void setCodigoRaca(int codigoRaca) {
		this.codigoRaca = codigoRaca;
	}

	public String getDescricaoRaca() {
		return this.descricaoRaca;
	}

	public void setDescricaoRaca(String descricaoRaca) {
		this.descricaoRaca = descricaoRaca;
	}

}