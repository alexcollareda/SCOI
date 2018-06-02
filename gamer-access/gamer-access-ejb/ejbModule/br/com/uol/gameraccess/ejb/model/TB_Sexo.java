package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Sexo database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Sexo.findAll", query="SELECT t FROM TB_Sexo t")
public class TB_Sexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoSexo")
	private int codigoSexo;

	@Column(name="DescricaoSexp")
	private String descricaoSexp;

	public TB_Sexo() {
	}

	public int getCodigoSexo() {
		return this.codigoSexo;
	}

	public void setCodigoSexo(int codigoSexo) {
		this.codigoSexo = codigoSexo;
	}

	public String getDescricaoSexp() {
		return this.descricaoSexp;
	}

	public void setDescricaoSexp(String descricaoSexp) {
		this.descricaoSexp = descricaoSexp;
	}

}