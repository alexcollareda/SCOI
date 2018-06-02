package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Alergia_has_TB_Anamnese database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Alergia_has_TB_Anamnese.findAll", query="SELECT t FROM TB_Alergia_has_TB_Anamnese t")
public class TB_Alergia_has_TB_Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Alergia_has_TB_AnamnesePK id;

	public TB_Alergia_has_TB_Anamnese() {
	}

	public TB_Alergia_has_TB_AnamnesePK getId() {
		return this.id;
	}

	public void setId(TB_Alergia_has_TB_AnamnesePK id) {
		this.id = id;
	}

}