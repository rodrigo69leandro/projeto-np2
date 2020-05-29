package np2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake extends Entidade{
    public List<Hotel          > hoteis;
    public List<Cidade         > cidades;
<<<<<<< HEAD
    public Cidade         		 cidade;
    public Hotel				 hotel;
=======
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
    public List<Restaurante    > restaurantes;
    public List<PacoteTuristico> pacotesTuristicos;
    public float valorDiaria;
    public float valorRefeicao;
    public EnumUF UF;
    
    
    public BancoDeDadosFake(){
        hoteis            = new ArrayList<Hotel          >();
        cidades           = new ArrayList<Cidade         >();
        restaurantes      = new ArrayList<Restaurante    >();
        pacotesTuristicos = new ArrayList<PacoteTuristico>();
    }
	
<<<<<<< HEAD
    public void addCidade(Cidade cidade) {
    	
    	hoteis 		= new ArrayList<Hotel>();	

        if(!cidades.contains(cidade)){
            cidades.add(cidade);
        }
=======
    public Cidade addCidade(Cidade cidade) {
    	
    	cidades.add(id, cidade);
    	
    	return cidade;
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
    }
 
    
	public void addHotel(Hotel hotel) {
		
		this.hoteis.add(hotel);
	}
    
<<<<<<< HEAD
	public void addRestaurante(Restaurante restaurante) {
		
		this.restaurantes.add(restaurante);
	}

	public Cidade getCidadePeloId(int idEscolhido) {

		for(int i = 0; i<cidades.size(); i++) {
			if(cidades.get(i).id == idEscolhido) {
				return cidades.get(i);
			}
		}
		
		return cidades.get(idEscolhido);
	}
	
	public Hotel getHotel(Hotel hotel) {
		
		return this.hotel;
	}

	public Hotel getHotelPeloId(int idEscolhido) {
		
		for(Hotel h: hoteis.getI) {
			h.id.equals(idEscolhido);
		}
		
		
		if (hotel.get(id).contains(idEscolhido)) {
			this.hotel.id = idEscolhido;
		};
		
		
		return hotel;
	} 
    
	public Restaurante getRestaurantePeloId(int idEscolhido) {
		
		for(int i = 0; i<restaurantes.size(); i++) {
			if(cidades.get(i).id == idEscolhido) {
				return restaurantes.get(i);
			}
		}
		
		return restaurantes.get(idEscolhido);
=======
	public void addHotel(String nome, float valorDiaria, Cidade cidade) {
		
		
	}
    
	public void addRestaurante(String nome, float valorRefeicao, Cidade cidade) {
		
		
	}

	public Cidade getCidadePeloId(int idEscolhido) {
		
		System.out.println(this.cidades);

		return cidades.get(id);
		
	
	}

	public Hotel getHotelPeloId(int idEscolhido) {
		
		return this.hoteis.get(id);
	}
    
	public Restaurante GetRestaurantePeloId(int idEscolhido) {
		
		return this.restaurantes.get(id);
>>>>>>> a4cea03b540a404d77f61b4424204e6373003358
	}
	
}
