package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Procedimento database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Procedimento.findAll", query="SELECT t FROM TB_Procedimento t")
public class TB_Procedimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoProcedimento")
	private int codigoProcedimento;

	@Column(name="DescricaoProcedimento")
	private String descricaoProcedimento;

	@Column(name="SiglaProcedimento")
	private String siglaProcedimento;

	public TB_Procedimento() {
	}

	public int getCodigoProcedimento() {
		return this.codigoProcedimento;
	}

	public void setCodigoProcedimento(int codigoProcedimento) {
		this.codigoProcedimento = codigoProcedimento;
	}

	public String getDescricaoProcedimento() {
		return this.descricaoProcedimento;
	}

	public void setDescricaoProcedimento(String descricaoProcedimento) {
		this.descricaoProcedimento = descricaoProcedimento;
	}

	public String getSiglaProcedimento() {
		return this.siglaProcedimento;
	}

	public void setSiglaProcedimento(String siglaProcedimento) {
		this.siglaProcedimento = siglaProcedimento;
	}

}