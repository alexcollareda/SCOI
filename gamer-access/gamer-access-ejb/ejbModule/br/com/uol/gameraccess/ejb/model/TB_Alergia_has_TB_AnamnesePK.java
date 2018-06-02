package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Alergia_has_TB_Anamnese database table.
 * 
 */
@Embeddable
public class TB_Alergia_has_TB_AnamnesePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Alergia_CodigoAlergia;

	private int TB_Anamnese_CodigoAnamnese;

	public TB_Alergia_has_TB_AnamnesePK() {
	}
	public int getTB_Alergia_CodigoAlergia() {
		return this.TB_Alergia_CodigoAlergia;
	}
	public void setTB_Alergia_CodigoAlergia(int TB_Alergia_CodigoAlergia) {
		this.TB_Alergia_CodigoAlergia = TB_Alergia_CodigoAlergia;
	}
	public int getTB_Anamnese_CodigoAnamnese() {
		return this.TB_Anamnese_CodigoAnamnese;
	}
	public void setTB_Anamnese_CodigoAnamnese(int TB_Anamnese_CodigoAnamnese) {
		this.TB_Anamnese_CodigoAnamnese = TB_Anamnese_CodigoAnamnese;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Alergia_has_TB_AnamnesePK)) {
			return false;
		}
		TB_Alergia_has_TB_AnamnesePK castOther = (TB_Alergia_has_TB_AnamnesePK)other;
		return 
			(this.TB_Alergia_CodigoAlergia == castOther.TB_Alergia_CodigoAlergia)
			&& (this.TB_Anamnese_CodigoAnamnese == castOther.TB_Anamnese_CodigoAnamnese);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Alergia_CodigoAlergia;
		hash = hash * prime + this.TB_Anamnese_CodigoAnamnese;
		
		return hash;
	}
}