package np2;

public class Restaurante extends Entidade{
	
	public Cidade cidades;
	public float  valorRefeicao;
	
	public Restaurante(int id, String nome, float valorRefeicao, Cidade cidade) {
<<<<<<< HEAD
=======
		
		this.id 			= id;
		this.nome 	 		= nome;
		this.valorRefeicao 	= valorRefeicao;
		this.cidades 		= cidade;
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
		
		this.id 			= id;
		this.nome 	 		= nome;
		this.valorRefeicao 	= valorRefeicao;
		this.cidades 		= cidade;
        
		cidade.restaurantes.add(this);
		
	}

}
