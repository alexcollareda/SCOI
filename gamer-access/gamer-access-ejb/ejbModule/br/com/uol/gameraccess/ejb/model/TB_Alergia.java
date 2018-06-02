package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Alergia database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Alergia.findAll", query="SELECT t FROM TB_Alergia t")
public class TB_Alergia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoAlergia")
	private int codigoAlergia;

	@Column(name="DescricaoAlergia")
	private String descricaoAlergia;

	public TB_Alergia() {
	}

	public int getCodigoAlergia() {
		return this.codigoAlergia;
	}

	public void setCodigoAlergia(int codigoAlergia) {
		this.codigoAlergia = codigoAlergia;
	}

	public String getDescricaoAlergia() {
		return this.descricaoAlergia;
	}

	public void setDescricaoAlergia(String descricaoAlergia) {
		this.descricaoAlergia = descricaoAlergia;
	}

}