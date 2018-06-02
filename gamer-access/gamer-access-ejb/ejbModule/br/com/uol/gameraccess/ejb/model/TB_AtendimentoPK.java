package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Atendimento database table.
 * 
 */
@Embeddable
public class TB_AtendimentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CodigoDeAtendimento")
	private int codigoDeAtendimento;

	private int TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;

	public TB_AtendimentoPK() {
	}
	public int getCodigoDeAtendimento() {
		return this.codigoDeAtendimento;
	}
	public void setCodigoDeAtendimento(int codigoDeAtendimento) {
		this.codigoDeAtendimento = codigoDeAtendimento;
	}
	public int getTB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento() {
		return this.TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
	}
	public void setTB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento(int TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento) {
		this.TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento = TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_AtendimentoPK)) {
			return false;
		}
		TB_AtendimentoPK castOther = (TB_AtendimentoPK)other;
		return 
			(this.codigoDeAtendimento == castOther.codigoDeAtendimento)
			&& (this.TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento == castOther.TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigoDeAtendimento;
		hash = hash * prime + this.TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento;
		
		return hash;
	}
}