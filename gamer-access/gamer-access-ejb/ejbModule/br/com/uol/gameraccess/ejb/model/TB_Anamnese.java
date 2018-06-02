package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Anamnese database table.
 * 
 */
@Entity
@NamedQuery(name="TB_Anamnese.findAll", query="SELECT t FROM TB_Anamnese t")
public class TB_Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoAnamnese")
	private int codigoAnamnese;

	@Column(name="Medicamento")
	private String medicamento;

	@Column(name="QueixaPrincipal")
	private String queixaPrincipal;

	//bi-directional one-to-one association to TB_CadastroDePaciente
	@OneToOne(mappedBy="tbAnamnese")
	private TB_CadastroDePaciente tbCadastroDePaciente;

	public TB_Anamnese() {
	}

	public int getCodigoAnamnese() {
		return this.codigoAnamnese;
	}

	public void setCodigoAnamnese(int codigoAnamnese) {
		this.codigoAnamnese = codigoAnamnese;
	}

	public String getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getQueixaPrincipal() {
		return this.queixaPrincipal;
	}

	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}

	public TB_CadastroDePaciente getTbCadastroDePaciente() {
		return this.tbCadastroDePaciente;
	}

	public void setTbCadastroDePaciente(TB_CadastroDePaciente tbCadastroDePaciente) {
		this.tbCadastroDePaciente = tbCadastroDePaciente;
	}

}