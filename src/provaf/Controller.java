package provaf;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import provaf.Despesa;
import java.util.Collections;
import provaf.ComparadorDespesa;


public class Controller {
	
	private HashMap<Integer,Despesa> despesas;
	private HashMap<String,Despesa> categorizadas;
	private HashMap<String,Categoria> categorias;
	private int id;
	private String exibir;
	
	public Controller() {
		despesas = new HashMap<>();
		categorizadas = new HashMap<>();
		categorias = new HashMap<>();
		this.id = 0;
	}
	
	public int cadastrarServico(String nome, int prioridade, int valorPorHora, int horas) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		Servico s = new Servico(nome, prioridade, valorPorHora, horas);
		despesas.put(id, s);
		int temp = s.getId();
		id += 1;
		return temp;
	}
	
	public int cadsatrarPontual(String nome, int prioridade, int valorOriginal, int desconto) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		Pontual p = new Pontual(nome, prioridade, valorOriginal, desconto);
		despesas.put(id, p);
		int var = p.getId();
		id += 1;
		return var;
	}
	
	public int getValorFinal(int id) {
		if (!(despesas.containsKey(id))) {
			throw new RuntimeException ("Despesa não existe!");
		}
		return despesas.get(id).getValorFinal();
	}
	
	public String exibirDespesa(int id) {
		if (!(despesas.containsKey(id))) {
			throw new RuntimeException ("Despesa não existe!");
		}
		return despesas.get(id).toString();
	}
	
	public void cadastrarCategoria(String nome, String desc) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		if (desc == null || desc.trim().equals("")) {
			throw new RuntimeException ("Descrição não pode ser vazio ou nulo!");
		}
		Categoria c = new Categoria(nome, desc);
		categorias.put(nome, c);		
	}
	
	public void associarDespesaACategoria(String nome,int id) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		Despesa d = despesas.get(id);
		categorizadas.put(nome, d);	
	}
	
	public String exibirDespesasEmCategoria(String nome) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		this.exibir = "";
		for(String chave : categorizadas.keySet()) {
			if (chave == nome) {
				exibir += categorias.get(nome).toString() + "\n " + categorizadas.values() + "\n";
			}
		}
		return exibir;
	}
	
	public int despesaMaisCara(String nome) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		int temp = 0;
		Comparator comparador = new ComparadorDespesa();
		for (String chave : categorizadas.keySet()) {
			if (chave == nome) {
				Despesa c = Collections.max(categorizadas.values(), comparador);
				temp = c.getId();
			}
		}
		return temp;
	}
	
}
