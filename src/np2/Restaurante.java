package np2;

public class Restaurante extends Entidade{
	
	public Hotel  hotel;
	public float  valorRefeicao;
	
	public Restaurante(int id, String nome, float valorRefeicao, Cidade cidade) {
		
		this.id 			= id;
		this.nome 	 		= nome;
		this.valorRefeicao 	= valorRefeicao;

		cidade.restaurantes.add(this);
	}
	
	public int getId() {
		return this.id;
	}
}
