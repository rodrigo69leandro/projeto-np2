package np2;

<<<<<<< HEAD
import java.util.ArrayList;

public class Cidade extends Entidade {
	
	public EnumUF UF;
    public ArrayList<Hotel> 	  hoteis;
    public ArrayList<Restaurante> restaurantes;
	
	public Cidade(int id, String nome, EnumUF UF) {
		
		this.id 		  		= id;
		this.nome 		  		= nome;
		this.UF					= UF;
        hoteis 			  		= new ArrayList<Hotel>();
        restaurantes			= new ArrayList<Restaurante>();
	}
	
	
=======
public class Cidade extends Entidade {
	
	public EnumUF UF;
	
	
	public Cidade(int id, String nome, EnumUF UF) {
		
		this.id 		  = id;
		this.nome 		  = nome;
		this.UF 		  = UF;
	}
	
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
	public String getNome() {
		return this.nome;
	}


<<<<<<< HEAD
	public ArrayList<Hotel> getHoteis() {

		return this.hoteis;
	}

=======
	public Object getHoteis() {
		// TODO Auto-generated method stub
		return null;
	}


>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
	public Object getRestaurantes() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
