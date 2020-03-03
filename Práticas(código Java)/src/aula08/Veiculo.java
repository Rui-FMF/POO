package aula08;

public class Veiculo implements KmPercorridosInterface {
	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	private int kmstotal = 0;
	private int kmstemp = 0;
	
	public Veiculo(String mat, String marca, String mod, int cc) {
		this.matricula=mat; this.marca=marca; this.modelo=mod; this.cilindrada=cc;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public void trajeto(int quilometros) {
		kmstemp = quilometros;
		kmstotal+=quilometros;
	}

	@Override
	public int ultimoTrajeto() {
		return kmstemp;
	}

	@Override
	public int distanciaTotal() {
		return kmstotal;
	}

}
