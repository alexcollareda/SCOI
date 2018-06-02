package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_CriticidadeDeAtendimento database table.
 * 
 */
@Entity
@NamedQuery(name="TB_CriticidadeDeAtendimento.findAll", query="SELECT t FROM TB_CriticidadeDeAtendimento t")
public class TB_CriticidadeDeAtendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoCriticidadeAtendimento")
	private int codigoCriticidadeAtendimento;

	@Column(name="DescricaoDeCriticidade")
	private String descricaoDeCriticidade;

	//bi-directional one-to-one association to TB_Atendimento
	@OneToOne(mappedBy="tbCriticidadeDeAtendimento")
	private TB_Atendimento tbAtendimento;

	public TB_CriticidadeDeAtendimento() {
	}

	public int getCodigoCriticidadeAtendimento() {
		return this.codigoCriticidadeAtendimento;
	}

	public void setCodigoCriticidadeAtendimento(int codigoCriticidadeAtendimento) {
		this.codigoCriticidadeAtendimento = codigoCriticidadeAtendimento;
	}

	public String getDescricaoDeCriticidade() {
		return this.descricaoDeCriticidade;
	}

	public void setDescricaoDeCriticidade(String descricaoDeCriticidade) {
		this.descricaoDeCriticidade = descricaoDeCriticidade;
	}

	public TB_Atendimento getTbAtendimento() {
		return this.tbAtendimento;
	}

	public void setTbAtendimento(TB_Atendimento tbAtendimento) {
		this.tbAtendimento = tbAtendimento;
	}

}