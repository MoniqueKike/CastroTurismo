/**
 * 
 */
package br.com.monique.domain.pessoa;
import java.io.Serializable;
/**
 * @author monique.0935
 *@version 1.0.0
 */
public class Funcionario extends PessoaFisica implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer numeroRegistro;
	
	private Boolean estaAtivo;

	private PessoaFisica PessoaFisica;
	/**
	 * 
	 */
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroRegistro
	 */
	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}

	/**
	 * @param numeroRegistro the numeroRegistro to set
	 */
	public void setNumeroRegistro(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	/**
	 * @return the estaAtivo
	 */
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}

	/**
	 * @param estaAtivo the estaAtivo to set
	 */
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
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
		int result = super.hashCode();
		result = prime * result + ((estaAtivo == null) ? 0 : estaAtivo.hashCode());
		result = prime * result + ((numeroRegistro == null) ? 0 : numeroRegistro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (estaAtivo == null) {
			if (other.estaAtivo != null)
				return false;
		} else if (!estaAtivo.equals(other.estaAtivo))
			return false;
		if (numeroRegistro == null) {
			if (other.numeroRegistro != null)
				return false;
		} else if (!numeroRegistro.equals(other.numeroRegistro))
			return false;
		return true;
	}

	public PessoaFisica getPessoaFisica() {
		return PessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		PessoaFisica = pessoaFisica;
	}
	
	
}
