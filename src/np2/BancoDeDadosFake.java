package np2;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosFake extends Entidade{
    public List<Hotel          > Hoteis;
    public List<Cidade         > cidades;
    public List<Restaurante    > Restaurantes;
    public List<PacoteTuristico> PacotesTuristicos;
    public float valorDiaria;
    public float valorRefeicao;
    public EnumUF UF;
    
    
    public BancoDeDadosFake(){
        Hoteis            = new ArrayList<Hotel          >();
        cidades           = new ArrayList<Cidade         >();
        Restaurantes      = new ArrayList<Restaurante    >();
        PacotesTuristicos = new ArrayList<PacoteTuristico>();
    }
	
    public BancoDeDadosFake AddCidade(String nome, EnumUF UF) {
    	
    	 for(Cidade c : cidades){
             if(!cidades.contains(c)){
                 cidades.add(c);
             }
         }

    	return null;
    	
    }
    
    
    public BancoDeDadosFake AddHotel(String nome, float valorDiaria, Cidade...cidade ) {
    	
    	this.nome = nome;
    	this.valorDiaria = valorDiaria;
    	this.cidades = cidade;
    	
    	return null;
    	
    }
    
    public BancoDeDadosFake AddRestaurante(String nome, float valorRefeicao, List<Cidade> cidade ) {
    	
    	this.nome = nome;
    	this.valorRefeicao = valorRefeicao;
    	this.cidades = cidade;
    	
    	return null;
    	
    }
    
    
    
    
    
}
