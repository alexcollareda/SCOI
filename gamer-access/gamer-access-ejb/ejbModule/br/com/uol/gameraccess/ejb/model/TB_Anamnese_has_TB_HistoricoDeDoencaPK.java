package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Anamnese_has_TB_HistoricoDeDoenca database table.
 * 
 */
@Embeddable
public class TB_Anamnese_has_TB_HistoricoDeDoencaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Anamnese_CodigoAnamnese;

	private int TB_HistoricoDeDoenca_CodigoHIstoricoDoenca;

	public TB_Anamnese_has_TB_HistoricoDeDoencaPK() {
	}
	public int getTB_Anamnese_CodigoAnamnese() {
		return this.TB_Anamnese_CodigoAnamnese;
	}
	public void setTB_Anamnese_CodigoAnamnese(int TB_Anamnese_CodigoAnamnese) {
		this.TB_Anamnese_CodigoAnamnese = TB_Anamnese_CodigoAnamnese;
	}
	public int getTB_HistoricoDeDoenca_CodigoHIstoricoDoenca() {
		return this.TB_HistoricoDeDoenca_CodigoHIstoricoDoenca;
	}
	public void setTB_HistoricoDeDoenca_CodigoHIstoricoDoenca(int TB_HistoricoDeDoenca_CodigoHIstoricoDoenca) {
		this.TB_HistoricoDeDoenca_CodigoHIstoricoDoenca = TB_HistoricoDeDoenca_CodigoHIstoricoDoenca;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Anamnese_has_TB_HistoricoDeDoencaPK)) {
			return false;
		}
		TB_Anamnese_has_TB_HistoricoDeDoencaPK castOther = (TB_Anamnese_has_TB_HistoricoDeDoencaPK)other;
		return 
			(this.TB_Anamnese_CodigoAnamnese == castOther.TB_Anamnese_CodigoAnamnese)
			&& (this.TB_HistoricoDeDoenca_CodigoHIstoricoDoenca == castOther.TB_HistoricoDeDoenca_CodigoHIstoricoDoenca);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Anamnese_CodigoAnamnese;
		hash = hash * prime + this.TB_HistoricoDeDoenca_CodigoHIstoricoDoenca;
		
		return hash;
	}
}