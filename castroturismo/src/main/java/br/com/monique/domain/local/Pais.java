package br.com.monique.domain.local;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Classe que recebe os dados de estado.
 * 
 * @author monique.0935
 * @version 1.0.0
 * @since 1.0.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder


public class Pais implements Serializable {


	private static final long seralversionUID = 1L;

	private Integer id;

	private String nome;

}
