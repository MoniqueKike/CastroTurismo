/**
 * 
 */
package br.com.monique.domain.pessoa;

import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
public class Motorista extends Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer CNH;
	
	private Boolean EAR;
	
	private String CategoriaCNH;

	private Funcionario Funcionario;
	
	/**
	 * 
	 */
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cNH
	 */
	public Integer getCNH() {
		return CNH;
	}

	/**
	 * @param cNH the cNH to set
	 */
	public void setCNH(Integer cNH) {
		CNH = cNH;
	}

	/**
	 * @return the eAR
	 */
	public Boolean getEAR() {
		return EAR;
	}

	/**
	 * @param eAR the eAR to set
	 */
	public void setEAR(Boolean eAR) {
		EAR = eAR;
	}

	/**
	 * @return the categoriaCNH
	 */
	public String getCategoriaCNH() {
		return CategoriaCNH;
	}

	/**
	 * @param categoriaCNH the categoriaCNH to set
	 */
	public void setCategoriaCNH(String categoriaCNH) {
		CategoriaCNH = categoriaCNH;
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
		result = prime * result + ((CNH == null) ? 0 : CNH.hashCode());
		result = prime * result + ((CategoriaCNH == null) ? 0 : CategoriaCNH.hashCode());
		result = prime * result + ((EAR == null) ? 0 : EAR.hashCode());
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
		Motorista other = (Motorista) obj;
		if (CNH == null) {
			if (other.CNH != null)
				return false;
		} else if (!CNH.equals(other.CNH))
			return false;
		if (CategoriaCNH == null) {
			if (other.CategoriaCNH != null)
				return false;
		} else if (!CategoriaCNH.equals(other.CategoriaCNH))
			return false;
		if (EAR == null) {
			if (other.EAR != null)
				return false;
		} else if (!EAR.equals(other.EAR))
			return false;
		return true;
	}

	public Funcionario getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		Funcionario = funcionario;
	}
	
	
}
