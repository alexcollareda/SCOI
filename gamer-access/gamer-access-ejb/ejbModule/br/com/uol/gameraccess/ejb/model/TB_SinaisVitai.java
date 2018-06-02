package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_SinaisVitais database table.
 * 
 */
@Entity
@Table(name="TB_SinaisVitais")
@NamedQuery(name="TB_SinaisVitai.findAll", query="SELECT t FROM TB_SinaisVitai t")
public class TB_SinaisVitai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoSinaisVitais")
	private int codigoSinaisVitais;

	private int PAMax;

	private int PAMin;

	@Column(name="Pulso")
	private int pulso;

	@Column(name="Respisacao")
	private int respisacao;

	@Column(name="Tamperatura")
	private BigDecimal tamperatura;

	//bi-directional one-to-one association to TB_Atendimento
	@OneToOne(mappedBy="tbSinaisVitai")
	private TB_Atendimento tbAtendimento;

	public TB_SinaisVitai() {
	}

	public int getCodigoSinaisVitais() {
		return this.codigoSinaisVitais;
	}

	public void setCodigoSinaisVitais(int codigoSinaisVitais) {
		this.codigoSinaisVitais = codigoSinaisVitais;
	}

	public int getPAMax() {
		return this.PAMax;
	}

	public void setPAMax(int PAMax) {
		this.PAMax = PAMax;
	}

	public int getPAMin() {
		return this.PAMin;
	}

	public void setPAMin(int PAMin) {
		this.PAMin = PAMin;
	}

	public int getPulso() {
		return this.pulso;
	}

	public void setPulso(int pulso) {
		this.pulso = pulso;
	}

	public int getRespisacao() {
		return this.respisacao;
	}

	public void setRespisacao(int respisacao) {
		this.respisacao = respisacao;
	}

	public BigDecimal getTamperatura() {
		return this.tamperatura;
	}

	public void setTamperatura(BigDecimal tamperatura) {
		this.tamperatura = tamperatura;
	}

	public TB_Atendimento getTbAtendimento() {
		return this.tbAtendimento;
	}

	public void setTbAtendimento(TB_Atendimento tbAtendimento) {
		this.tbAtendimento = tbAtendimento;
	}

}