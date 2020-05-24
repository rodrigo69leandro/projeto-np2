package np2;

import java.util.Calendar;
import np2.Cidade;

public class PacoteTuristico {
	
	public Cidade 	 		 cidade;
	public Hotel		  	 hotel;
	public Restaurante		 restaurante;
	public Calendar 		 dataInicio;
	public Calendar 		 dataFim;
	public int 				 diarias;
	public int				 qtdRefeicoesDiarias;
	
	public PacoteTuristico(Cidade cidade, Hotel hotel, Calendar dataInicio, 
			Calendar dataFim, int Diarias, Restaurante restaurante ) {
		this.cidade 		= cidade;
		this.hotel 		= hotel;
		this.dataInicio 	= dataInicio;
		this.dataFim 		= dataFim;
		this.restaurante   = restaurante;
		
	}

	public static PacoteTuristico Novo(Cidade cidadeEscolhida, Hotel hotelEscolhido, Calendar dataIniPacote,
			int qtdDias, Restaurante restauranteEscolhido, int qtdRefeicoes) {
		
		return null;
	}

}

//public Partida(Time mandante, Time visitante, Calendar dataDaPartida, Campeonato campeonato){
//    this.Mandante  = mandante;
//    this.Visitante = visitante;
//    this.Data      = dataDaPartida;
//    Campeonato     = campeonato;
//}