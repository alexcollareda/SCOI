package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 * The persistent class for the Tb_ListaDoenca database table.
 * 
 */
@Entity
@NamedQuery(name = "Tb_ListaDoenca.findAll", query = "SELECT t FROM Tb_ListaDoenca t")
public class Tb_ListaDoenca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CodigoDoenca")
	private int codigoDoenca;

	@Column(name = "DescricaoDoenca")
	private String descricaoDoenca;

	@Column(name = "NomeDoenca")
	private String nomeDoenca;

	@OneToOne(mappedBy = "tbListaDoenca")
	private TB_HistoricoDeDoenca tbHistoricoDeDoenca;

	@Transient
	private int respostasPacienteConsulta;

	@Transient
	private List<Integer> respostasFamiliarConsulta;

	public Tb_ListaDoenca() {
	}

	public int getCodigoDoenca() {
		return this.codigoDoenca;
	}

	public void setCodigoDoenca(int codigoDoenca) {
		this.codigoDoenca = codigoDoenca;
	}

	public String getDescricaoDoenca() {
		return this.descricaoDoenca;
	}

	public void setDescricaoDoenca(String descricaoDoenca) {
		this.descricaoDoenca = descricaoDoenca;
	}

	public String getNomeDoenca() {
		return this.nomeDoenca;
	}

	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}

	public TB_HistoricoDeDoenca getTbHistoricoDeDoenca() {
		return this.tbHistoricoDeDoenca;
	}

	public void setTbHistoricoDeDoenca(TB_HistoricoDeDoenca tbHistoricoDeDoenca) {
		this.tbHistoricoDeDoenca = tbHistoricoDeDoenca;
	}

	public int getRespostasPacienteConsulta() {
		return respostasPacienteConsulta;
	}

	public void setRespostasPacienteConsulta(int respostasPacienteConsulta) {
		this.respostasPacienteConsulta = respostasPacienteConsulta;
	}

	public List<Integer> getRespostasFamiliarConsulta() {
		respostasFamiliarConsulta = new ArrayList<Integer>();
		return respostasFamiliarConsulta;
	}

	public void setRespostasFamiliarConsulta(List<Integer> respostasFamiliarConsulta) {
		this.respostasFamiliarConsulta = respostasFamiliarConsulta;
	}

}