
public class Pessoa {
	
	private String Nome;

	public Pessoa() {
	}
	
	public Pessoa(String Nome) {
		setNome(Nome);
	}
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(Nome);
		builder.append("]");
		return builder.toString();
	}
}
