package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Anamnese_has_ExameFisico database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Anamnese_has_ExameFisico.findAll", query="SELECT t FROM TB_Anamnese_has_ExameFisico t")
public class TB_Anamnese_has_ExameFisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Anamnese_has_ExameFisicoPK id;

	public TB_Anamnese_has_ExameFisico() {
	}

	public TB_Anamnese_has_ExameFisicoPK getId() {
		return this.id;
	}

	public void setId(TB_Anamnese_has_ExameFisicoPK id) {
		this.id = id;
	}

}