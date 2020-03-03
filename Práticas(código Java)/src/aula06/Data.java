package aula06;

import java.time.OffsetDateTime;

public class Data implements Comparable<Data>{
	private int dia;
	private int mes;
	private int ano;
	
	//construtor
	
	public Data(int d, int m, int a) {
		this.dia = d; this.mes = m; this.ano = a;
	}
	
	//getters

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	//Retornar o dia de hoje

	public static Data today() {
		OffsetDateTime dt = OffsetDateTime.now();
		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int a = dt.getYear();
		
		return new Data(d, m, a);
	}

	@Override
	public int compareTo(Data d) {
		if(this.ano - d.ano !=0) {
			return this.ano-d.ano;
		} else if(this.mes - d.mes !=0) {
			return this.mes-d.mes;
		} else if(this.dia - d.dia !=0) {
			return this.dia-d.dia;
		}
		return 0;	
	}

}
