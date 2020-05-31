package np2;

import java.util.Calendar;
import np2.Cidade;

public class PacoteTuristico {
	
	public static Cidade 	 		 cidade;
	public static Hotel		  	 	 hotel;
	public static Restaurante		 restaurante;
	public static Calendar 		 	 dataInicio;
	public static Calendar 		 	 dataFim;
	public static int 				 diarias;
	public static int				 qtdRefeicoesDiarias;
	
	public PacoteTuristico(Cidade cidade, Hotel hotel, Calendar dataInicio, 
			Calendar dataFim, int Diarias, Restaurante restaurante ) {

		
	}

	public static PacoteTuristico novo(Cidade cidadeEscolhida, Hotel hotelEscolhido, Calendar dataIniPacote,
			Calendar dataFimPacote, Restaurante restauranteEscolhido, int qtdRefeicoes) {
	
		cidade 			 	= cidadeEscolhida;
		hotel 			   	= hotelEscolhido;
		dataInicio 		 	= dataIniPacote;
		dataFim 			= dataFimPacote;
		
		restaurante   		= restauranteEscolhido;
		qtdRefeicoesDiarias = qtdRefeicoes;
		
		return null;
	}

}


