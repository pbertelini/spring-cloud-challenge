package br.com.caelum.eats.restaurante;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDoCardapioDto {

	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private BigDecimal precoPromocional;

	public ItemDoCardapioDto(ItemDoCardapio item) {
		this(item.getId(), item.getNome(), item.getDescricao(), item.getPreco(), item.getPrecoPromocional());
	}

	public ItemDoCardapioDto(ItemDoCardapio id2, Object nome2, Object descricao2, Object preco2,
			Object precoPromocional2) {
		// TODO Auto-generated constructor stub
	}

}
