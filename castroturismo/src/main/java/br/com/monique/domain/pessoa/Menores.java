/**
 * 
 */
package br.com.monique.domain.pessoa;
import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
public class Menores extends Passageiro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean autorizacaoEmbarque;
	
	private Passageiro responsavel;

	/**
	 * 
	 */
	public Menores() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the autorizacaoEmbarque
	 */
	public Boolean getAutorizacaoEmbarque() {
		return autorizacaoEmbarque;
	}

	/**
	 * @param autorizacaoEmbarque the autorizacaoEmbarque to set
	 */
	public void setAutorizacaoEmbarque(Boolean autorizacaoEmbarque) {
		this.autorizacaoEmbarque = autorizacaoEmbarque;
	}

	/**
	 * @return the responsavel
	 */
	public Passageiro getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
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
		result = prime * result + ((autorizacaoEmbarque == null) ? 0 : autorizacaoEmbarque.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		Menores other = (Menores) obj;
		if (autorizacaoEmbarque == null) {
			if (other.autorizacaoEmbarque != null)
				return false;
		} else if (!autorizacaoEmbarque.equals(other.autorizacaoEmbarque))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		return true;
	}
	
	
}
