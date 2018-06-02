package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Procedimento_has_TB_Atendimento database table.
 * 
 */
@Embeddable
public class TB_Procedimento_has_TB_AtendimentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Procedimento_CodigoProcedimento;

	private int TB_Atendimento_CodigoDeAtendimento;

	private int TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;

	public TB_Procedimento_has_TB_AtendimentoPK() {
	}
	public int getTB_Procedimento_CodigoProcedimento() {
		return this.TB_Procedimento_CodigoProcedimento;
	}
	public void setTB_Procedimento_CodigoProcedimento(int TB_Procedimento_CodigoProcedimento) {
		this.TB_Procedimento_CodigoProcedimento = TB_Procedimento_CodigoProcedimento;
	}
	public int getTB_Atendimento_CodigoDeAtendimento() {
		return this.TB_Atendimento_CodigoDeAtendimento;
	}
	public void setTB_Atendimento_CodigoDeAtendimento(int TB_Atendimento_CodigoDeAtendimento) {
		this.TB_Atendimento_CodigoDeAtendimento = TB_Atendimento_CodigoDeAtendimento;
	}
	public int getTB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento() {
		return this.TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
	}
	public void setTB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento(int TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento) {
		this.TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento = TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Procedimento_has_TB_AtendimentoPK)) {
			return false;
		}
		TB_Procedimento_has_TB_AtendimentoPK castOther = (TB_Procedimento_has_TB_AtendimentoPK)other;
		return 
			(this.TB_Procedimento_CodigoProcedimento == castOther.TB_Procedimento_CodigoProcedimento)
			&& (this.TB_Atendimento_CodigoDeAtendimento == castOther.TB_Atendimento_CodigoDeAtendimento)
			&& (this.TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento == castOther.TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Procedimento_CodigoProcedimento;
		hash = hash * prime + this.TB_Atendimento_CodigoDeAtendimento;
		hash = hash * prime + this.TB_Atendimento_TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
		
		return hash;
	}
}