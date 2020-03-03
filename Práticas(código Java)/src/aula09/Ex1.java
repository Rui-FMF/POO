package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import aula06.Data;
import aula06.Pessoa;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i+=10)
		c1.add(i);
		System.out.println("Size: " + c1.size());
		for (int i = 0; i < c1.size(); i++)
		System.out.println("Elemento: " + c1.get(i));
		
		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);
		c2.add(1, "Vento");
		System.out.println(c2);
		c2.set(2, "Neve");
		System.out.println(c2);
		System.out.println(c2.indexOf("Neve"));
		
		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Ana", 1, new Data(1,2,2000)));
		c3.add(new Pessoa("João", 2, new Data(7,4,2000)));
		c3.add(new Pessoa("Manuel", 3, new Data(11,9,2000)));
		c3.add(new Pessoa("Vitor", 4, new Data(6,3,2000)));
		c3.add(new Pessoa("Mário", 5, new Data(3,8,2000)));
		Iterator<Pessoa> it = c3.iterator();
		it.forEachRemaining(s -> {
			System.out.println(s);
		});
		
		Collection<Data> c4 = new TreeSet<>();
		c4.add(new Data(1,2,1995));
		c4.add(new Data(7,11,2000));
		c4.add(new Data(3,5,1763));
		c4.add(new Data(1,5,2000));
		c4.add(new Data(1,4,1995));
		Iterator<Data> it1 = c4.iterator();
		it1.forEachRemaining(d -> {
			System.out.println(d);
		});
		
		}

}
