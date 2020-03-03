package aula08;

public class Motociclo extends Veiculo {
	private String tipo;

	public Motociclo(String mat, String marca, String mod, int cc, String tipo) {
		super(mat, marca, mod, cc);
		if (!tipo.equals("desportivo") && !tipo.equals("estrada")) throw new IllegalArgumentException("tipo inválido");
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
