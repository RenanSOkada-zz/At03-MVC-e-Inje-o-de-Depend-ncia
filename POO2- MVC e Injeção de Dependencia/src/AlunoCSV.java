import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AlunoCSV implements IAlunoPersist{
	
	public void gravar(Aluno alu) {
		FileWriter arq;
		PrintWriter gravarArq;
		try {
			arq = new FileWriter("aluno.csv");
			gravarArq = new PrintWriter(arq);
			gravarArq.printf("%s;%s;%s;%s;%s\n", alu.getCpf(), alu.getDataNascimento(), alu.getEmail(), alu.getMatricula(), alu.getNome());
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean inserir(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Aluno procurarPorMatricula(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno procurarPorEmail(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno procurarPorNome(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno procurarPorCPF(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Aluno> pesquisarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
