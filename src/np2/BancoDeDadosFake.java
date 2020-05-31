package np2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake extends Entidade{
    public List<Hotel          > hoteis;
    public List<Cidade         > cidades;
    public Cidade         		 cidade;
    public static Hotel				 hotel;
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

    public Hotel getHotelPeloId(ArrayList<Hotel> hoteis, int idEscolhido) {

    	this.hoteis = hoteis;
    	
    	for(Hotel h : hoteis) {
    		if(h.getId() == idEscolhido) {
    			return h;
    		}
    	}
    	return null;
    }
    
	public Restaurante getRestaurantePeloId(ArrayList<Restaurante> restaurantes, int idEscolhido) {
		
	    this.restaurantes = restaurantes;
	    
		for(Restaurante r : restaurantes) {
	        if(r.getId() == idEscolhido) {
				return r;
	        }
	    }
		return null;
	}
	
}
