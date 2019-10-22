package provaf;

public class Categoria {
	private String nome;
	private String desc;
	
	public Categoria(String nome, String desc) {
		if (nome == null || nome.trim().equals("")) {
			throw new RuntimeException ("Nome não pode ser vazio ou nulo!");
		}
		if (desc == null || desc.trim().equals("")) {
			throw new RuntimeException ("Descrição não pode ser vazio ou nulo!");
		}
		this.nome = nome;
		this.desc = desc;
	}
	
	public String toString() {
		return nome + " - " + desc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
