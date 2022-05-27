/**
 * 
 */
package br.com.monique.domain.veiculo;
import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
public class Carro extends Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	private Integer setor;
	
	private Veiculo veiculo;

	/**
	 * 
	 */
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the setor
	 */
	public Integer getSetor() {
		return setor;
	}

	/**
	 * @param setor the setor to set
	 */
	public void setSetor(Integer setor) {
		this.setor = setor;
	}

	/**
	 * @return the veiculo
	 */
	public Veiculo getVeiculo() {
		return veiculo;
	}

	/**
	 * @param veiculo the veiculo to set
	 */
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
		result = prime * result + ((veiculo == null) ? 0 : veiculo.hashCode());
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
		Carro other = (Carro) obj;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		if (veiculo == null) {
			if (other.veiculo != null)
				return false;
		} else if (!veiculo.equals(other.veiculo))
			return false;
		return true;
	}
	
	
}
