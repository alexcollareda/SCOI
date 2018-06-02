package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Anamnese_has_TB_HistoricoDeDoenca database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Anamnese_has_TB_HistoricoDeDoenca.findAll", query="SELECT t FROM TB_Anamnese_has_TB_HistoricoDeDoenca t")
public class TB_Anamnese_has_TB_HistoricoDeDoenca implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_Anamnese_has_TB_HistoricoDeDoencaPK id;

	//bi-directional one-to-one association to TB_HistoricoDeDoenca
	@OneToOne
	@JoinColumn(name = "TB_HistoricoDeDoenca_CodigoHIstoricoDoenca", insertable = false, updatable = false)
	private TB_HistoricoDeDoenca tbHistoricoDeDoenca;

	public TB_Anamnese_has_TB_HistoricoDeDoenca() {
	}

	public TB_Anamnese_has_TB_HistoricoDeDoencaPK getId() {
		return this.id;
	}

	public void setId(TB_Anamnese_has_TB_HistoricoDeDoencaPK id) {
		this.id = id;
	}

	public TB_HistoricoDeDoenca getTbHistoricoDeDoenca() {
		return this.tbHistoricoDeDoenca;
	}

	public void setTbHistoricoDeDoenca(TB_HistoricoDeDoenca tbHistoricoDeDoenca) {
		this.tbHistoricoDeDoenca = tbHistoricoDeDoenca;
	}

}