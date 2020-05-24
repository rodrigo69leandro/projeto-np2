package np2;

public class Hotel extends Entidade{
	
	public Cidade 		cidades;
	public float		valorDiaria;
	
	public Hotel(int id, String nome, float valorDiaria, Cidade cidade) {
		
		this.id 			= id;
		this.nome 			= nome;
		this.cidades 		= cidade;
		this.valorDiaria 	= valorDiaria;
	}
	

}
