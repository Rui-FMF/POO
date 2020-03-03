package aula06;

public class Bolseiro extends Aluno {
	private int bolsa;
	
	//construtores

	public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc) {
		super(nome, cc, dataNasc, dataInsc);
	}

	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
	}
	public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc, int bolsa) {
		super(nome, cc, dataNasc, dataInsc);
		this.bolsa = bolsa;
	}

	public Bolseiro(String nome, int cc, Data dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}
	
	//getters e setters

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec() + ", Data de Inscrição: " + this.getDataInsc() + ", Bolsa: " + bolsa;
	}

}
