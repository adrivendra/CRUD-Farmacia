package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 2, max = 100, message = "O nome do produto deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo nome é obrigatorio")
	private String nome;
	
	@Size(min = 5, max = 100, message = "A descrição deve ter no mínimo 5 caracteres e no máximo 100")
	private String descricao;
	
	private String fabricante;
	
	private Integer quantidade;
	
	@NotNull(message = "Atributo preço é obrigatório")
	private Double preco;
	
	@Size(min = 10, max = 10, message = "A data de validade deve ter no mínimo 10 caracteres e no máximo 10 para ser uma data validade valida")
	private String dataValidade;
	
	private boolean precisaDeReceita;
	
	@Size(max = 5000, message = "A foto deve ter no máximo 5000 caracteres")
	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public boolean isPrecisaDeReceita() {
		return precisaDeReceita;
	}

	public void setPrecisaDeReceita(boolean precisaDeReceita) {
		this.precisaDeReceita = precisaDeReceita;
	}
	
	
	
}
