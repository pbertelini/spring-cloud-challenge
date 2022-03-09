package br.com.caelum.eats.administrativo;

import br.com.caelum.eats.administrativo.FormaDePagamento.Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormaDePagamentoDto {

	private Long id;
	private Tipo tipo;
	private String nome;

	public FormaDePagamentoDto(FormaDePagamento forma) {
		this(forma.getId(), forma.getTipo(), forma.getNome());
	}

	public FormaDePagamentoDto(FormaDePagamento id2, Object tipo2, Object nome2) {
		// TODO Auto-generated constructor stub
	}
	
}
