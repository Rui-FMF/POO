package aula08;

public class PesadoMercadorias extends Pesado {
	int cargamax;

	public PesadoMercadorias(String mat, String marca, String mod, int cc, int numquadro, int peso, int cargamax) {
		super(mat, marca, mod, cc, numquadro, peso);
		this.cargamax=cargamax;
	}

	public int getCargamax() {
		return cargamax;
	}

}
