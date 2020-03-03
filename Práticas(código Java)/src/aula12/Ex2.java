package aula12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("movies.txt"));
		ArrayList<Movie> movielist = new ArrayList<>();
		HashSet<String> genset = new HashSet<>();
		
		for (int i=1;i<lines.size();i++) {
			String[] params = lines.get(i).split("\t");
			movielist.add(new Movie(params[0], Double.parseDouble(params[1]), params[2], params[3], Integer.parseInt(params[4])));
			genset.add(params[3]);
		}
		movielist.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
		printlist(movielist);
		
		movielist.sort((a, b)->Double.compare(b.getScore(), a.getScore()));
		System.out.println("-------------------------------------------------------------------------");
		printlist(movielist);
		
		movielist.sort((a, b)->Integer.compare(a.getRunTime(), b.getRunTime()));
		System.out.println("-------------------------------------------------------------------------");
		printlist(movielist);
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(genset);
		
		PrintWriter out = new PrintWriter(new File("myselection.txt"));
		out.printf("%-40s%-10s%-10s%-10s%-15s\n", "Name", "Score", "Rating", "Genre", "Run Time");
		for(Movie m: movielist) {
			if(m.getScore()>60.0 && m.getGenre().equals("comedy")) {
				out.println(m);
			}
		}
		out.close();
	}
	
	public static void printlist(ArrayList<Movie> list){
		for(Movie m: list) {
			System.out.println(m);
		}
	}

}
