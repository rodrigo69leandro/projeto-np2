package np2;

import java.util.List;

public class Hotel extends Entidade{
	
	public Cidade 		cidades;
	public float		valorDiaria;
	
	public Hotel(String nome, Cidade cidade, float valorDiaria) {
		this.nome = nome;
		this.cidades = cidade;
		this.valorDiaria = valorDiaria;
	}
	

}
