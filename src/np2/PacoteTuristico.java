package np2;

import java.util.Calendar;
import java.util.List;
import np2.Cidade;

public class PacoteTuristico {
	
	public List<Cidade> 	 cidades;
	public List<Hotel>  	 hoteis;
	public List<Restaurante> restaurantes;
	public Calendar 		 dataInicio;
	public Calendar 		 dataFim;
	public int 				 diarias;
	
	public PacoteTuristico(List<Cidade> cidade, List<Hotel> hotel, Calendar dataInicio, 
			Calendar dataFim, int Diarias, List<Restaurante> restaurante ) {
		this.cidades 		= cidade;
		this.hoteis 		= hotel;
		this.dataInicio 	= dataInicio;
		this.dataFim 		= dataFim;
		this.restaurantes   = restaurante;
		
	}

}

//public Partida(Time mandante, Time visitante, Calendar dataDaPartida, Campeonato campeonato){
//    this.Mandante  = mandante;
//    this.Visitante = visitante;
//    this.Data      = dataDaPartida;
//    Campeonato     = campeonato;
//}