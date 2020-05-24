package np2;

public class Cidade extends Entidade {
	
	public EnumUF UF;
	
	
	public Cidade(int id, String nome, EnumUF UF) {
		
		this.id 		  = id;
		this.nome 		  = nome;
		this.UF 		  = UF;
	}
	
	public String getNome() {
		return this.nome;
	}


	public Object getHoteis() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getRestaurantes() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
