package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Procedimento_has_TB_Atendimento database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Procedimento_has_TB_Atendimento.findAll", query="SELECT t FROM TB_Procedimento_has_TB_Atendimento t")
public class TB_Procedimento_has_TB_Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Procedimento_has_TB_AtendimentoPK id;

	public TB_Procedimento_has_TB_Atendimento() {
	}

	public TB_Procedimento_has_TB_AtendimentoPK getId() {
		return this.id;
	}

	public void setId(TB_Procedimento_has_TB_AtendimentoPK id) {
		this.id = id;
	}

}