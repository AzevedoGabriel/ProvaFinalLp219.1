package provaf;

public abstract class Despesa {
	protected String nome;
	protected int prioridade;
	protected int valorPorHora;
	protected int horas;
	protected int id;
	protected int valorFinal;
	protected int valorOriginal;
	protected int desconto;

	public int getValorFinal(){
		return valorFinal;
	}
	public void setValorFinal(int valorFinal) {
		this.valorFinal = valorFinal;
	}
	public abstract String toString();
	public abstract void valorFinal();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(int valorHora) {
		this.valorPorHora = valorHora;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
}