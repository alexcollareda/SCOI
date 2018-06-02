package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_HistoricoDeDoenca database table.
 * 
 */
@Entity
@NamedQuery(name="TB_HistoricoDeDoenca.findAll", query="SELECT t FROM TB_HistoricoDeDoenca t")
public class TB_HistoricoDeDoenca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoHIstoricoDoenca")
	private int codigoHIstoricoDoenca;

	private int TB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca;

	//bi-directional one-to-one association to Tb_ListaDoenca
	@OneToOne
	@JoinColumn(name="Tb_ListaDoenca_CodigoDoenca")
	private Tb_ListaDoenca tbListaDoenca;

	//bi-directional one-to-one association to TB_Anamnese_has_TB_HistoricoDeDoenca
	@OneToOne(mappedBy="tbHistoricoDeDoenca")
	private TB_Anamnese_has_TB_HistoricoDeDoenca tbAnamneseHasTbHistoricoDeDoenca;

	public TB_HistoricoDeDoenca() {
	}

	public int getCodigoHIstoricoDoenca() {
		return this.codigoHIstoricoDoenca;
	}

	public void setCodigoHIstoricoDoenca(int codigoHIstoricoDoenca) {
		this.codigoHIstoricoDoenca = codigoHIstoricoDoenca;
	}

	public int getTB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca() {
		return this.TB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca;
	}

	public void setTB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca(int TB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca) {
		this.TB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca = TB_TipoHistoricoDeDoenca_CodigoHistoricoDoenca;
	}

	public Tb_ListaDoenca getTbListaDoenca() {
		return this.tbListaDoenca;
	}

	public void setTbListaDoenca(Tb_ListaDoenca tbListaDoenca) {
		this.tbListaDoenca = tbListaDoenca;
	}

	public TB_Anamnese_has_TB_HistoricoDeDoenca getTbAnamneseHasTbHistoricoDeDoenca() {
		return this.tbAnamneseHasTbHistoricoDeDoenca;
	}

	public void setTbAnamneseHasTbHistoricoDeDoenca(TB_Anamnese_has_TB_HistoricoDeDoenca tbAnamneseHasTbHistoricoDeDoenca) {
		this.tbAnamneseHasTbHistoricoDeDoenca = tbAnamneseHasTbHistoricoDeDoenca;
	}

}