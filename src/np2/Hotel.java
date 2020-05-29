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
	
<<<<<<< HEAD
	public int getId() {
		return this.id;
=======
	public Hotel(int id, String nome, float valorDiaria, Cidade cidade) {
		
		this.id 			= id;
		this.nome 			= nome;
		this.cidades 		= cidade;
		this.valorDiaria 	= valorDiaria;
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
	}
	
	

}
