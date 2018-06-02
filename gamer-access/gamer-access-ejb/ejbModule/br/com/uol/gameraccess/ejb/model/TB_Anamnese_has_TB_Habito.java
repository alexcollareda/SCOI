package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the TB_Anamnese_has_TB_Habitos database table.
 * 
 */
@Entity
@Table(name = "TB_Anamnese_has_TB_Habitos")
@NamedQuery(name = "TB_Anamnese_has_TB_Habito.findAll", query = "SELECT t FROM TB_Anamnese_has_TB_Habito t")
public class TB_Anamnese_has_TB_Habito implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Anamnese_has_TB_HabitoPK id;

	// bi-directional one-to-one association to TB_Habito
	@OneToOne
	@JoinColumn(name = "TB_Habitos_CodigoHabitos", insertable = false, updatable = false)
	private TB_Habito tbHabito;

	public TB_Anamnese_has_TB_Habito() {
	}

	public TB_Anamnese_has_TB_HabitoPK getId() {
		return this.id;
	}

	public void setId(TB_Anamnese_has_TB_HabitoPK id) {
		this.id = id;
	}

	public TB_Habito getTbHabito() {
		return this.tbHabito;
	}

	public void setTbHabito(TB_Habito tbHabito) {
		this.tbHabito = tbHabito;
	}

}