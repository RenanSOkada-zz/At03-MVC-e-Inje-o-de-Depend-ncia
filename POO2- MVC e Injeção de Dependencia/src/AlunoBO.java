import java.util.List;

public class AlunoBO implements IAlunoPersistDAO{

	
	public boolean inserir(Aluno aluno) {
		if(existe(aluno) != true) {
			AlunoDAO p = new AlunoDAO();
			return p.inserir(aluno);
		}
		return false;
	}
	
	public boolean alterar(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
			return p.alterar(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.excluir(aluno);
	}
	
	public Aluno procurarPorMatricula(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.procurarPorMatricula(aluno);
	}
	
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.procurarPorDataNascimento(aluno);
	}
	public Aluno procurarPorEmail(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.procurarPorEmail(aluno);
	}
	public Aluno procurarPorNome(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.procurarPorNome(aluno);
	}
	public Aluno procurarPorCPF(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.procurarPorCPF(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		AlunoDAO p = new AlunoDAO();
		return p.existe(aluno);
	}
	
	public List<Aluno> pesquisarTodos() {
		AlunoDAO p = new AlunoDAO();
		return p.pesquisarTodos();
	}
	
}
