package np2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake extends Entidade{
    public List<Hotel          > hoteis;
    public List<Cidade         > cidades;
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
	
    public Cidade addCidade(Cidade cidade) {
    	
    	cidades.add(id, cidade);
    	
    	return cidade;
    }
 
    
	public Hotel addHotel(Hotel hotel) {
    	
		hoteis.add(id, hotel);
    	return hotel;
	}
    
	public Restaurante addRestaurante(Restaurante restaurante) {
		restaurantes.add(restaurante);
    	return restaurante;
	}

	public Cidade getCidadePeloId(int idEscolhido) {
		
		System.out.println(this.cidades);

		return cidades.get(id);

		
	}

	public Hotel getHotelPeloId(int idEscolhido) {
		
		System.out.println(this.hoteis);

		return hoteis.get(id);

	}
    
	public Restaurante GetRestaurantePeloId(int idEscolhido) {
		
		return this.restaurantes.get(id);
	}
	
}
