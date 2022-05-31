/**
 * 
 */
package br.com.monique.domain.viagem;

import java.io.Serializable;

import br.com.monique.domain.itinerario.Rota;
import br.com.monique.domain.pessoa.Passageiro;

public class Passagem implements Serializable {

	private Integer id;

	private Integer numeroPassagem;

	private FormaPagamentoEnum formaPagamento;

	private Integer NumeroPoltrona;

	private Boolean possuiBagagem;

	private Passageiro passageiro;

	private Rota rota;

	/**
	 * 
	 */
	public Passagem() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numeroPassagem
	 */
	public Integer getNumeroPassagem() {
		return numeroPassagem;
	}

	/**
	 * @param numeroPassagem the numeroPassagem to set
	 */
	public void setNumeroPassagem(Integer numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}

	/**
	 * @return the formaPagamento
	 */
	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @return the numeroPoltrona
	 */
	public Integer getNumeroPoltrona() {
		return NumeroPoltrona;
	}

	/**
	 * @param numeroPoltrona the numeroPoltrona to set
	 */
	public void setNumeroPoltrona(Integer numeroPoltrona) {
		NumeroPoltrona = numeroPoltrona;
	}

	/**
	 * @return the possuiBagagem
	 */
	public Boolean getPossuiBagagem() {
		return possuiBagagem;
	}

	/**
	 * @param possuiBagagem the possuiBagagem to set
	 */
	public void setPossuiBagagem(Boolean possuiBagagem) {
		this.possuiBagagem = possuiBagagem;
	}

	/**
	 * @return the passageiro
	 */
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	/**
	 * @return the rota
	 */
	public Rota getRota() {
		return rota;
	}

	/**
	 * @param rota the rota to set
	 */
	public void setRota(Rota rota) {
		this.rota = rota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NumeroPoltrona == null) ? 0 : NumeroPoltrona.hashCode());
		result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroPassagem == null) ? 0 : numeroPassagem.hashCode());
		result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
		result = prime * result + ((possuiBagagem == null) ? 0 : possuiBagagem.hashCode());
		result = prime * result + ((rota == null) ? 0 : rota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		if (NumeroPoltrona == null) {
			if (other.NumeroPoltrona != null)
				return false;
		} else if (!NumeroPoltrona.equals(other.NumeroPoltrona))
			return false;
		if (formaPagamento != other.formaPagamento)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroPassagem == null) {
			if (other.numeroPassagem != null)
				return false;
		} else if (!numeroPassagem.equals(other.numeroPassagem))
			return false;
		if (passageiro == null) {
			if (other.passageiro != null)
				return false;
		} else if (!passageiro.equals(other.passageiro))
			return false;
		if (possuiBagagem == null) {
			if (other.possuiBagagem != null)
				return false;
		} else if (!possuiBagagem.equals(other.possuiBagagem))
			return false;
		if (rota == null) {
			if (other.rota != null)
				return false;
		} else if (!rota.equals(other.rota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Passagem [id=%s, numeroPassagem=%s, formaPagamento=%s, NumeroPoltrona=%s, possuiBagagem=%s, passageiro=%s, rota=%s, toString()=%s]",
				id, numeroPassagem, formaPagamento, NumeroPoltrona, possuiBagagem, passageiro, rota, super.toString());
	}

}