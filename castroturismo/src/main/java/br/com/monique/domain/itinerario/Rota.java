/**
 * 
 */
package br.com.monique.domain.itinerario;
import java.io.Serializable;

import br.com.monique.domain.pessoa.Motorista;
import br.com.monique.domain.pessoa.Rodoviaria;
import br.com.monique.domain.veiculo.Onibus;
import br.com.monique.domain.viagem.Passagem;
/**
 * @author monique.0935
 *
 */
public class Rota implements Serializable {

	private static final long serialVersionUID = 1L; 

	private Integer id;
	
	private Rodoviaria origem;
	
	private Rodoviaria destino;
	
	private Double quilometragem;
	
	private Double precopassagem;
	
	private Onibus onibus;
	
	private Motorista motorista;
	
	private Rodoviaria rodoviaria;
	
	private Passagem passagem;

	/**
	 * 
	 */
	public Rota() {
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
	 * @return the origem
	 */
	public Rodoviaria getOrigem() {
		return origem;
	}

	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(Rodoviaria origem) {
		this.origem = origem;
	}

	/**
	 * @return the destino
	 */
	public Rodoviaria getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Rodoviaria destino) {
		this.destino = destino;
	}

	/**
	 * @return the quilometragem
	 */
	public Double getQuilometragem() {
		return quilometragem;
	}

	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Double quilometragem) {
		this.quilometragem = quilometragem;
	}

	/**
	 * @return the precopassagem
	 */
	public Double getPrecopassagem() {
		return precopassagem;
	}

	/**
	 * @param precopassagem the precopassagem to set
	 */
	public void setPrecopassagem(Double precopassagem) {
		this.precopassagem = precopassagem;
	}

	/**
	 * @return the onibus
	 */
	public Onibus getOnibus() {
		return onibus;
	}

	/**
	 * @param onibus the onibus to set
	 */
	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	/**
	 * @return the motorista
	 */
	public Motorista getMotorista() {
		return motorista;
	}

	/**
	 * @param motorista the motorista to set
	 */
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	/**
	 * @return the rodoviaria
	 */
	public Rodoviaria getRodoviaria() {
		return rodoviaria;
	}

	/**
	 * @param rodoviaria the rodoviaria to set
	 */
	public void setRodoviaria(Rodoviaria rodoviaria) {
		this.rodoviaria = rodoviaria;
	}

	/**
	 * @return the passagem
	 */
	public Passagem getPassagem() {
		return passagem;
	}

	/**
	 * @param passagem the passagem to set
	 */
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + ((onibus == null) ? 0 : onibus.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((passagem == null) ? 0 : passagem.hashCode());
		result = prime * result + ((precopassagem == null) ? 0 : precopassagem.hashCode());
		result = prime * result + ((quilometragem == null) ? 0 : quilometragem.hashCode());
		result = prime * result + ((rodoviaria == null) ? 0 : rodoviaria.hashCode());
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
		Rota other = (Rota) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (onibus == null) {
			if (other.onibus != null)
				return false;
		} else if (!onibus.equals(other.onibus))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (passagem == null) {
			if (other.passagem != null)
				return false;
		} else if (!passagem.equals(other.passagem))
			return false;
		if (precopassagem == null) {
			if (other.precopassagem != null)
				return false;
		} else if (!precopassagem.equals(other.precopassagem))
			return false;
		if (quilometragem == null) {
			if (other.quilometragem != null)
				return false;
		} else if (!quilometragem.equals(other.quilometragem))
			return false;
		if (rodoviaria == null) {
			if (other.rodoviaria != null)
				return false;
		} else if (!rodoviaria.equals(other.rodoviaria))
			return false;
		return true;
	}

	
	

}