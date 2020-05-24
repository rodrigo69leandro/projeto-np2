package np2;

public class Restaurante extends Entidade{
	
	public Cidade cidades;
	public float  valorRefeicao;
	
	public Restaurante(int id, String nome, float valorRefeicao, Cidade cidade) {
		
		this.id 			= id;
		this.nome 	 		= nome;
		this.valorRefeicao 	= valorRefeicao;
		this.cidades 		= cidade;
		
		
	}

}
