package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_Anamnese_has_ExameFisico database table.
 * 
 */
@Embeddable
public class TB_Anamnese_has_ExameFisicoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int TB_Anamnese_CodigoAnamnese;

	@Column(name="ExameFisico_CodigoExameFisico")
	private int exameFisico_CodigoExameFisico;

	public TB_Anamnese_has_ExameFisicoPK() {
	}
	public int getTB_Anamnese_CodigoAnamnese() {
		return this.TB_Anamnese_CodigoAnamnese;
	}
	public void setTB_Anamnese_CodigoAnamnese(int TB_Anamnese_CodigoAnamnese) {
		this.TB_Anamnese_CodigoAnamnese = TB_Anamnese_CodigoAnamnese;
	}
	public int getExameFisico_CodigoExameFisico() {
		return this.exameFisico_CodigoExameFisico;
	}
	public void setExameFisico_CodigoExameFisico(int exameFisico_CodigoExameFisico) {
		this.exameFisico_CodigoExameFisico = exameFisico_CodigoExameFisico;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TB_Anamnese_has_ExameFisicoPK)) {
			return false;
		}
		TB_Anamnese_has_ExameFisicoPK castOther = (TB_Anamnese_has_ExameFisicoPK)other;
		return 
			(this.TB_Anamnese_CodigoAnamnese == castOther.TB_Anamnese_CodigoAnamnese)
			&& (this.exameFisico_CodigoExameFisico == castOther.exameFisico_CodigoExameFisico);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.TB_Anamnese_CodigoAnamnese;
		hash = hash * prime + this.exameFisico_CodigoExameFisico;
		
		return hash;
	}
}