package np2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake extends Entidade{
    public List<Hotel          > hoteis;
    public List<Cidade         > cidades;
    public Cidade         		 cidade;
    public Hotel				 hotel;
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
	
    public void addCidade(Cidade cidade) {
    	
    	hoteis 		= new ArrayList<Hotel>();	

        if(!cidades.contains(cidade)){
            cidades.add(cidade);
        }
    }
 
    
	public void addHotel(Hotel hotel) {
		
		this.hoteis.add(hotel);
	}
    
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
	}
	
}
