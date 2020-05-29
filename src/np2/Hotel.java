package np2;

public class Hotel extends Entidade{
	
	public Cidade 		cidade;
	public float		valorDiaria;

	
	public Hotel(int id, String nome, float valorDiaria, Cidade cidade) {
		
		this.id 			= id;
		this.nome 			= nome;
		this.cidade 		= cidade;
		this.valorDiaria 	= valorDiaria;

        cidade.hoteis.add(this);
		
	}
	
	public int getId() {
		return this.id;
	}
	
	

}
