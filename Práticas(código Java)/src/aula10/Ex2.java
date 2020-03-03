package aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		
		mapa.put("branco", " Que tem a cor da neve");
		mapa.put("vermelho", " Que tem a cor do sangue");
		mapa.put("leão", " Animal");
		mapa.put("byte", " 8 bits");
		mapa.put("Java", " Not phyton");
		mapa.put("cenas", " coisas");
		mapa.remove("cenas");
		mapa.replace("Java", "Not python", "Linguagem de programação");
		
		System.out.println(mapa.entrySet());
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		
	}

}
