package np2;

import java.util.List;

public class Cidade extends Entidade {
	
	public String UF;
	public List<Hotel> hoteis;
	public List<Restaurante> restaurantes;
	
	
	public Cidade(String nome, String UF, List<Hotel> hotel, List<Restaurante> restaurante) {
		this.nome 		  = nome;
		this.hoteis 	  = hotel;
		this.restaurantes = restaurante;
		
	}
	

}
