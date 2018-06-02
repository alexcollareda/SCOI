package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_StatusDeAtendimento database table.
 * 
 */
@Entity
@NamedQuery(name="TB_StatusDeAtendimento.findAll", query="SELECT t FROM TB_StatusDeAtendimento t")
public class TB_StatusDeAtendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoStatusAtendimento")
	private int codigoStatusAtendimento;

	@Column(name="DescricaodeStatusAtendimento")
	private String descricaodeStatusAtendimento;

	//bi-directional one-to-one association to TB_Atendimento
	@OneToOne(mappedBy="tbStatusDeAtendimento")
	private TB_Atendimento tbAtendimento;

	public TB_StatusDeAtendimento() {
	}

	public int getCodigoStatusAtendimento() {
		return this.codigoStatusAtendimento;
	}

	public void setCodigoStatusAtendimento(int codigoStatusAtendimento) {
		this.codigoStatusAtendimento = codigoStatusAtendimento;
	}

	public String getDescricaodeStatusAtendimento() {
		return this.descricaodeStatusAtendimento;
	}

	public void setDescricaodeStatusAtendimento(String descricaodeStatusAtendimento) {
		this.descricaodeStatusAtendimento = descricaodeStatusAtendimento;
	}

	public TB_Atendimento getTbAtendimento() {
		return this.tbAtendimento;
	}

	public void setTbAtendimento(TB_Atendimento tbAtendimento) {
		this.tbAtendimento = tbAtendimento;
	}

}