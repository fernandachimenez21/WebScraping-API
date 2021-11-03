package br.com.phc.nflapi.util;

import br.com.phc.nflapi.dto.PartidaGoogleDto;

public class ScrapingUtil {

	private static final String BASE_URL_GOOGLE = "https://www.google.com.br/search?q=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartidaGoogleDto partida = new PartidaGoogleDto();
		
		partida.getGolsEquipeCasa();

	}

}
