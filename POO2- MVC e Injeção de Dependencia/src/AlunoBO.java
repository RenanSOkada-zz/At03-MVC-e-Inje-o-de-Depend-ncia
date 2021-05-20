import java.util.List;

public class AlunoBO implements IAlunoPersistDAO{

	private IAlunoPersistDAO p;
	
	public boolean inserir(Aluno aluno) {
		if(existe(aluno) != true) {
			return p.inserir(aluno);
		}
		return false;
	}
	
	public boolean alterar(Aluno aluno) {
			return p.alterar(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		return p.excluir(aluno);
	}
	
	public Aluno procurarPorMatricula(Aluno aluno) {
		return p.procurarPorMatricula(aluno);
	}
	
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		return p.procurarPorDataNascimento(aluno);
	}
	public Aluno procurarPorEmail(Aluno aluno) {
		return p.procurarPorEmail(aluno);
	}
	public Aluno procurarPorNome(Aluno aluno) {
		return p.procurarPorNome(aluno);
	}
	public Aluno procurarPorCPF(Aluno aluno) {
		return p.procurarPorCPF(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		return p.existe(aluno);
	}
	
	public List<Aluno> pesquisarTodos() {
		return p.pesquisarTodos();
	}
	
}
