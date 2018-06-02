package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Anamnese_has_Medicamento database table.
 * 
 */
@Embeddable
public class TB_Anamnese_has_MedicamentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Anamnese_CodigoAnamnese;

	@Column(name="Medicamento_CodigoMedicamento")
	private int medicamento_CodigoMedicamento;

	public TB_Anamnese_has_MedicamentoPK() {
	}
	public int getTB_Anamnese_CodigoAnamnese() {
		return this.TB_Anamnese_CodigoAnamnese;
	}
	public void setTB_Anamnese_CodigoAnamnese(int TB_Anamnese_CodigoAnamnese) {
		this.TB_Anamnese_CodigoAnamnese = TB_Anamnese_CodigoAnamnese;
	}
	public int getMedicamento_CodigoMedicamento() {
		return this.medicamento_CodigoMedicamento;
	}
	public void setMedicamento_CodigoMedicamento(int medicamento_CodigoMedicamento) {
		this.medicamento_CodigoMedicamento = medicamento_CodigoMedicamento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Anamnese_has_MedicamentoPK)) {
			return false;
		}
		TB_Anamnese_has_MedicamentoPK castOther = (TB_Anamnese_has_MedicamentoPK)other;
		return 
			(this.TB_Anamnese_CodigoAnamnese == castOther.TB_Anamnese_CodigoAnamnese)
			&& (this.medicamento_CodigoMedicamento == castOther.medicamento_CodigoMedicamento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Anamnese_CodigoAnamnese;
		hash = hash * prime + this.medicamento_CodigoMedicamento;
		
		return hash;
	}
}