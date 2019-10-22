package provaf;

public class Servico extends Despesa{
	
	public Servico(String nome, int prioridade, int valorPorHora, int horas) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		this.nome = nome;
		this.prioridade = prioridade;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
		this.id = id;
		this.valorFinal = 0;
	}
	
	@Override
	public String toString() {
		return id + " - " + nome + " - " + prioridade + " - " + horas + "h - R$ " + valorPorHora + "/h - R$ " + valorFinal;
	}

	@Override
	public void valorFinal() {
		valorFinal += (valorPorHora * horas);
	}

}
