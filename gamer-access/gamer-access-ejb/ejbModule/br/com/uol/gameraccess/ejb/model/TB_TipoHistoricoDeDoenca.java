package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_TipoHistoricoDeDoenca database table.
 * 
 */
@Entity
@NamedQuery(name="TB_TipoHistoricoDeDoenca.findAll", query="SELECT t FROM TB_TipoHistoricoDeDoenca t")
public class TB_TipoHistoricoDeDoenca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoHistoricoDoenca")
	private int codigoHistoricoDoenca;

	@Column(name="NomeDoTipoDeHistorico")
	private String nomeDoTipoDeHistorico;

	public TB_TipoHistoricoDeDoenca() {
	}

	public int getCodigoHistoricoDoenca() {
		return this.codigoHistoricoDoenca;
	}

	public void setCodigoHistoricoDoenca(int codigoHistoricoDoenca) {
		this.codigoHistoricoDoenca = codigoHistoricoDoenca;
	}

	public String getNomeDoTipoDeHistorico() {
		return this.nomeDoTipoDeHistorico;
	}

	public void setNomeDoTipoDeHistorico(String nomeDoTipoDeHistorico) {
		this.nomeDoTipoDeHistorico = nomeDoTipoDeHistorico;
	}

}