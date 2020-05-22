package np2;

import java.util.List;

public class Restaurante extends Entidade{
	
	public Cidade cidades;
	
	public Restaurante(String nome, Cidade cidade) {
		
		this.nome 	 = nome;
		this.cidades = cidade;
		
		
	}

}
