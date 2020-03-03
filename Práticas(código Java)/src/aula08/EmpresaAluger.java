package aula08;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAluger {
	private List<Veiculo> veiculos = new ArrayList<>();
	private String nome;
	private String postal;
	private String email;

	public EmpresaAluger(String nome, String postal, String email) {
		this.nome=nome; this.postal=postal; this.email=email;
	}

	public String getNome() {
		return nome;
	}

	public String getPostal() {
		return postal;
	}

	public String getEmail() {
		return email;
	}
	
	public void addVeiculo(Veiculo v) {
		this.veiculos.add(v);
	}
	
	public Veiculo getVeiculo(String matricula) {
		for (Veiculo v : veiculos) {
			if(v.getMatricula() == matricula) {
				return v;
			}
		}
		return null;
	}

}
