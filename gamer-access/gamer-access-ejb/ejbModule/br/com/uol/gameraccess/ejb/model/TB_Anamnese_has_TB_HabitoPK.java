package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Anamnese_has_TB_Habitos database table.
 * 
 */
@Embeddable
public class TB_Anamnese_has_TB_HabitoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Anamnese_CodigoAnamnese;

	private int TB_Habitos_CodigoHabitos;

	public TB_Anamnese_has_TB_HabitoPK() {
	}
	public int getTB_Anamnese_CodigoAnamnese() {
		return this.TB_Anamnese_CodigoAnamnese;
	}
	public void setTB_Anamnese_CodigoAnamnese(int TB_Anamnese_CodigoAnamnese) {
		this.TB_Anamnese_CodigoAnamnese = TB_Anamnese_CodigoAnamnese;
	}
	public int getTB_Habitos_CodigoHabitos() {
		return this.TB_Habitos_CodigoHabitos;
	}
	public void setTB_Habitos_CodigoHabitos(int TB_Habitos_CodigoHabitos) {
		this.TB_Habitos_CodigoHabitos = TB_Habitos_CodigoHabitos;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Anamnese_has_TB_HabitoPK)) {
			return false;
		}
		TB_Anamnese_has_TB_HabitoPK castOther = (TB_Anamnese_has_TB_HabitoPK)other;
		return 
			(this.TB_Anamnese_CodigoAnamnese == castOther.TB_Anamnese_CodigoAnamnese)
			&& (this.TB_Habitos_CodigoHabitos == castOther.TB_Habitos_CodigoHabitos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Anamnese_CodigoAnamnese;
		hash = hash * prime + this.TB_Habitos_CodigoHabitos;
		
		return hash;
	}
}