package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Anamnese_has_Medicamento database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Anamnese_has_Medicamento.findAll", query="SELECT t FROM TB_Anamnese_has_Medicamento t")
public class TB_Anamnese_has_Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Anamnese_has_MedicamentoPK id;

	public TB_Anamnese_has_Medicamento() {
	}

	public TB_Anamnese_has_MedicamentoPK getId() {
		return this.id;
	}

	public void setId(TB_Anamnese_has_MedicamentoPK id) {
		this.id = id;
	}

}