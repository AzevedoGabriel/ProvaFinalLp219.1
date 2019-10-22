package provaf;

public class Pontual extends Despesa{
	
	public Pontual(String nome, int prioridade, int valorOriginal, int desconto) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		this.prioridade = prioridade;
		this.valorOriginal = valorOriginal;
		this.desconto = desconto;
		this.id = id;
		this.valorFinal = 0;
	}

	@Override
	public String toString() {
		return id + " - " + nome + " - " + prioridade + " - R$ " + valorOriginal + " - R$ " + desconto + " - R$ " + valorFinal;
	}

	@Override
	public void valorFinal() {
		valorFinal += (valorOriginal - desconto); 
		
	}
}
