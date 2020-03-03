package aula11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) throws IOException{
		ArrayList<ArrayList<String>> listaVoos = new ArrayList<>();			//Lista das informações de cada voo para colocar num objeto
		List<String> lines = Files.readAllLines(Paths.get("voos.txt"));		//Lista de linhas do ficheiro voos.txt
		
		//preencher listaVoos
		for (int i=1;i<lines.size();i++) {
			ArrayList<String> lista2 = new ArrayList<>();	//lista de informações de uma linha
			String[] params = lines.get(i).split("\t");
			for(String p: params) {
				lista2.add(p);
			}
			if(params.length<4) {
				lista2.add("00:00");
			}
			listaVoos.add(lista2);
		}
		
		HashMap<String, String> dicCompanhias = new HashMap<>();	//Mapa, keys são siglas da companhia e values são nome completo
		lines = Files.readAllLines(Paths.get("companhias.txt"));	//Lista de linhas do ficheiro companhias.txt
		
		//preencher Dic
		for(int i=0;i<lines.size();i++) {
			String[] params = lines.get(i).split("\t");
			dicCompanhias.put(params[0], params[1]);				
		}
		
		//Criação e preenchimento duma lista de Objetos Voo com a informação dos ficheiros
		ArrayList<Voo> voos = new ArrayList<>();
		for(ArrayList<String> voo: listaVoos) {
			String comp = dicCompanhias.get(voo.get(1).substring(0, 2));
			voos.add(new Voo(new Tempo(voo.get(0)), voo.get(1), comp, voo.get(2), new Tempo(voo.get(3))));
		}
		
		//Escrita da tabela num ficheiro InfoPublico.txt
		PrintWriter out = new PrintWriter(new File("InfoPublico.txt"));
		out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Previsto");
		for(Voo v: voos) {
			out.println(v);
		}
		out.close();
		
	}

}
