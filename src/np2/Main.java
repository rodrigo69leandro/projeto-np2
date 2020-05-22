package np2;
import java.util.List;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import np2.Util;
import np2.BancoDeDadosFake;


class Main {
    public static void main(String[] args) {
    	
    	BancoDeDadosFake bd = new BancoDeDadosFake();
    	

    	Restaurante r = new Restaurante("Coco Bambu", bsb);
    	Hotel hotel = new Hotel("PlayTime", bsb, 300.00f);
    	Cidade bsb = new Cidade("Brasilia", "DF", hotel, r);
    	
    	bd.AddHotel(hotel, 300.00f, bsb);
 	
    	
//        Util.cls();
//        BancoDeDadosFake bd = GetBancoDeDadosFake(); // Método definido na linha 145 deste mesmo arquivo
//        
//        // O sistema impede que a mesma cidade seja cadastrada mais de uma vez
//        Cidade brasilia 	= new Cidade("Brasília", UF.DF, "https://61brasilia.com");
//        Cidade rioDeJaneiro = new Cidade("Brasília", Uf.DF, "https://61brasilia.com");
//        Cidade saoPaulo 	= new Cidade("Brasília", Uf.DF, "https://61brasilia.com");
//        bd.AddCidade(bsbRepetida1);
//        bd.AddCidade(bsbRepetida2);
//        bd.AddCidade(bsbRepetida3);
//                
//        // O sistema impede que o mesmo hotel seja cadastrado mais de uma vez
//        Hotel hotelRepeido1 = new Hotel("B Hotel Brasília", 355.95f, bsbRepetida1);
//        Hotel hotelRepeido2 = new Hotel("B Hotel Brasília", 355.95f, bsbRepetida1);
//        Hotel hotelRepeido3 = new Hotel("B Hotel Brasília", 355.95f, bsbRepetida1);
//        bd.AddHotel(hotelRepeido1);
//        bd.AddHotel(hotelRepeido2);
//        bd.AddHotel(hotelRepeido3);
//        
//        // O sistema impede que o mesmo restaurante seja cadastrado mais de uma vez      
//        Restaurante restRepetido1 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido2 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido3 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        bd.AddRestaurante(restRepetido1);
//        bd.AddRestaurante(restRepetido2);
//        bd.AddRestaurante(restRepetido3);
//
//        int idEscolhido;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Cadastrar novo pacote turístico: ");
//        System.out.println("  * Cidade      : ");
//        System.out.println("  * Hotel       : ");
//        System.out.println("  * Data início : ");
//        System.out.println("  * Data fim    : ");
//        System.out.println("  * Restaurante : ");
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Cidades disponíveis: ");
//        for(Cidade c : bd.Cidades){
//            System.out.println("    + "+ c.Nome +"/"+ c.Uf +" ("+ c.Id +")");
//        }
//        System.out.printf("\n  Informe o código da cidade: ");
//        idEscolhido = in.nextInt();
//        Cidade cidadeEscolhida = bd.GetCidadePeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote turístico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : ");
//        System.out.println("  * Data início  : ");
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Hotéis disponíveis na cidade escolhida:");
//        for(Hotel h : cidadeEscolhida.GetHoteis()){
//            System.out.println("    » "+ h.Nome +" ("+ h.Id +")");
//        }
//        System.out.printf("\n  Informe o código do hotel: ");
//        idEscolhido = in.nextInt();
//        Hotel hotelEscolhido = bd.GetHotelPeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote turístico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : "+ hotelEscolhido.Nome);
//        System.out.println("  * Data início  : ");
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Data de início:");
//        System.out.printf("    » Dia: ");
//        int dia = in.nextInt();
//        System.out.printf("    » Mês (somente números): ");
//        int mes = in.nextInt();
//        System.out.printf("    » Ano: ");
//        int ano = in.nextInt();
//        Calendar dataIniPacote = Util.GetData(dia, mes, ano);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote turístico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : "+ hotelEscolhido.Nome);
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.printf("  Dias de permanência: ");
//        int qtdDias = in.nextInt();
//        dataIniPacote.add(Calendar.DATE, qtdDias);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote turístico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : " + hotelEscolhido.Nome);
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Restaurantes disponíveis na cidade escolhida:");
//        for(Restaurante r : cidadeEscolhida.GetRestaurantes()){
//            System.out.println("    » "+ r.Nome +" ("+ r.Id +")");
//        }
//        System.out.printf("\n  Informe o código do restaurante: ");
//        idEscolhido = in.nextInt();
//        Restaurante restauranteEscolhido = bd.GetRestaurantePeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote turístico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : " + hotelEscolhido.Nome);
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
//        System.out.println("  * Restaurante  : "+ restauranteEscolhido.Nome);
//        System.out.println("  * Ref. diárias : ");
//        System.out.println("-------------------------------------");
//        System.out.printf("  Quantas refeições diárias inclusas? ");
//        int qtdRefeicoes = in.nextInt();
//
//        PacoteTuristico pacote = PacoteTuristico.Novo(cidadeEscolhida, hotelEscolhido, dataIniPacote, qtdDias, restauranteEscolhido, qtdRefeicoes);
//
//        Util.cls();
//        Calendar ini = pacote.DataInicio;
//        Calendar fim = pacote.DataFim;
//        System.out.println("Pacote turístico cadastrado com sucesso! ");
//        System.out.println("  » Cidade       : "+ pacote.Cidade.Nome +"/"+pacote.Cidade.Uf);
//        System.out.println("  » Hotel        : " + pacote.Hotel.Nome);
//        System.out.printf ("  » Data início  : %02d/%02d/%d\n", ini.get(Calendar.DAY_OF_MONTH), ini.get(Calendar.MONTH)+1, ini.get(Calendar.YEAR));
//        System.out.printf ("  » Data fim     : %02d/%02d/%d\n", fim.get(Calendar.DAY_OF_MONTH), fim.get(Calendar.MONTH)+1, fim.get(Calendar.YEAR));
//        System.out.println("  » Restaurante  : "+ pacote.Restaurante.Nome);
//        System.out.println("  » Ref. diárias : "+ pacote.QtdRefeicoesDiarias);
//    }
//    
//    public static BancoDeDadosFake GetBancoDeDadosFake(){
//        BancoDeDadosFake bd = new BancoDeDadosFake();
//        
//        Cidade bsb   = bd.AddCidade("Brasília"      , UF.DF);
//        Cidade rio   = bd.AddCidade("Rio de Janeiro", Uf.RJ);
//        Cidade jampa = bd.AddCidade("João Pessoa"   , Uf.PB);
//        
//        bd.AddHotel("B Hotel Brasília"            , 355.95f, bsb);
//        bd.AddHotel("Athos Bulcão Hplus Executive", 211.00f, bsb);
//        bd.AddHotel("Cullinan Hplus Premium"      , 266.33f, bsb);
//        
//        bd.AddHotel("Atlantico Prime"             , 265.95f, rio);
//        bd.AddHotel("Pouso Real"                  , 271.10f, rio);
//        bd.AddHotel("Américas Barra Hotal"        , 166.45f, rio);
//        
//        bd.AddHotel("Manos Royal Hotel"           , 195.95f, jampa);
//        bd.AddHotel("Mar doo Cabo Branco"         , 201.10f, jampa);
//        bd.AddHotel("Atlântico Pria Hotel"        , 132.45f, jampa);
//        
//        bd.AddRestaurante("Fred Restaurante"      ,  35.95f, bsb);
//        bd.AddRestaurante("Nazo Sushi Bar"        ,  21.00f, bsb);
//        bd.AddRestaurante("Caminito Parrila"      ,  26.33f, bsb);
//        
//        bd.AddRestaurante("Coco Bambu"            ,  25.95f, rio);
//        bd.AddRestaurante("Oliver"                ,  21.10f, rio);
//        bd.AddRestaurante("Taypá Sabores Del Perú",  16.45f, rio);
//        
//        bd.AddRestaurante("Manos Royal Hotel"     ,  15.95f, jampa);
//        bd.AddRestaurante("Pobre Juan"            ,  21.10f, jampa);
//        bd.AddRestaurante("NAU Frutos do mar"     ,  12.45f, jampa);
//        
//        return bd;
    }
}