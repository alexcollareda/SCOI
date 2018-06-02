package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the TB_Atendimento database table.
 * 
 */
@Entity
@NamedQuery(name = "TB_Atendimento.findAll", query = "SELECT t FROM TB_Atendimento t")
public class TB_Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TB_AtendimentoPK id;

	@Column(name = "Aluno_RA")
	private int aluno_RA;

	@Column(name = "DataHoraFim")
	private Timestamp dataHoraFim;

	@Column(name = "DataHoraInicio")
	private Timestamp dataHoraInicio;

	@Column(name = "NotaAtendimento")
	private int notaAtendimento;

	@Column(name = "NumBox")
	private int numBox;

	@Column(name = "Professor_RT")
	private int professor_RT;

	private int TB_CadastroDePaciente_CodigoPaiciente;

	// bi-directional one-to-one association to TB_CriticidadeDeAtendimento
	@OneToOne
	@JoinColumn(name = "TB_CriticidadeDeAtendimento_CodigoCriticidadeAtendimento", insertable = false, updatable = false)
	private TB_CriticidadeDeAtendimento tbCriticidadeDeAtendimento;

	// bi-directional one-to-one association to TB_StatusDeAtendimento
	@OneToOne
	@JoinColumn(name = "TB_StatusDeAtendimento_CodigoStatusAtendimento", insertable = false, updatable = false)
	private TB_StatusDeAtendimento tbStatusDeAtendimento;

	// bi-directional one-to-one association to TB_SinaisVitai
	@OneToOne
	@JoinColumn(name = "TB_SinaisVitais_CodigoSinaisVitais", insertable = false, updatable = false)
	private TB_SinaisVitai tbSinaisVitai;

	public TB_Atendimento() {
	}

	public TB_AtendimentoPK getId() {
		return this.id;
	}

	public void setId(TB_AtendimentoPK id) {
		this.id = id;
	}

	public int getAluno_RA() {
		return this.aluno_RA;
	}

	public void setAluno_RA(int aluno_RA) {
		this.aluno_RA = aluno_RA;
	}

	public Timestamp getDataHoraFim() {
		return this.dataHoraFim;
	}

	public void setDataHoraFim(Timestamp dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public Timestamp getDataHoraInicio() {
		return this.dataHoraInicio;
	}

	public void setDataHoraInicio(Timestamp dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public int getNotaAtendimento() {
		return this.notaAtendimento;
	}

	public void setNotaAtendimento(int notaAtendimento) {
		this.notaAtendimento = notaAtendimento;
	}

	public int getNumBox() {
		return this.numBox;
	}

	public void setNumBox(int numBox) {
		this.numBox = numBox;
	}

	public int getProfessor_RT() {
		return this.professor_RT;
	}

	public void setProfessor_RT(int professor_RT) {
		this.professor_RT = professor_RT;
	}

	public int getTB_CadastroDePaciente_CodigoPaiciente() {
		return this.TB_CadastroDePaciente_CodigoPaiciente;
	}

	public void setTB_CadastroDePaciente_CodigoPaiciente(int TB_CadastroDePaciente_CodigoPaiciente) {
		this.TB_CadastroDePaciente_CodigoPaiciente = TB_CadastroDePaciente_CodigoPaiciente;
	}

	public TB_CriticidadeDeAtendimento getTbCriticidadeDeAtendimento() {
		return this.tbCriticidadeDeAtendimento;
	}

	public void setTbCriticidadeDeAtendimento(TB_CriticidadeDeAtendimento tbCriticidadeDeAtendimento) {
		this.tbCriticidadeDeAtendimento = tbCriticidadeDeAtendimento;
	}

	public TB_StatusDeAtendimento getTbStatusDeAtendimento() {
		return this.tbStatusDeAtendimento;
	}

	public void setTbStatusDeAtendimento(TB_StatusDeAtendimento tbStatusDeAtendimento) {
		this.tbStatusDeAtendimento = tbStatusDeAtendimento;
	}

	public TB_SinaisVitai getTbSinaisVitai() {
		return this.tbSinaisVitai;
	}

	public void setTbSinaisVitai(TB_SinaisVitai tbSinaisVitai) {
		this.tbSinaisVitai = tbSinaisVitai;
	}

}