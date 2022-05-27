/**
 * 
 */
package br.com.monique.domain.veiculo;
import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
public class Onibus extends Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	private Integer poltrona;

	/**
	 * 
	 */
	public Onibus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the poltrona
	 */
	public Integer getPoltrona() {
		return poltrona;
	}

	/**
	 * @param poltrona the poltrona to set
	 */
	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
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
		result = prime * result + ((poltrona == null) ? 0 : poltrona.hashCode());
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
		Onibus other = (Onibus) obj;
		if (poltrona == null) {
			if (other.poltrona != null)
				return false;
		} else if (!poltrona.equals(other.poltrona))
			return false;
		return true;
	}
	
	
		
}
