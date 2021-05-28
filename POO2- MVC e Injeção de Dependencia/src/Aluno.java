
import java.util.Date;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String cpf;
	private Date dataNascimento;
	private String email;
	
	public Aluno() {
	}
	
	public Aluno(String nome) {
	super(nome);
	}
	
	public Aluno( String matricula,  String nome) {
		super(nome);
		setMatricula(matricula);						
	}
	
	public Aluno( String matricula,	String cpf ,  String nome) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
	}
	
	public Aluno( String matricula,	String cpf, Date dataNascimento,  String nome) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
	}
	
	
	public Aluno( String matricula,	String cpf, Date dataNascimento, String email,  String nome) {
		super(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setEmail(email);	
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
		
		
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
