import java.util.List;

public class AlunoBO implements IAlunoPersist{

	public boolean inserir(Aluno aluno) {
		if(existe(aluno) != true) {
			AlunoDAO alunosDAO = new AlunoDAO();
			return alunosDAO.inserir(aluno);
		}
		return false;
	}
	
	public boolean alterar(Aluno aluno) {
			AlunoDAO alunosDAO = new AlunoDAO();
			return alunosDAO.alterar(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.excluir(aluno);
	}
	
	public Aluno procurarPorMatricula(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.procurarPorMatricula(aluno);
	}
	
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.procurarPorDataNascimento(aluno);
	}
	public Aluno procurarPorEmail(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.procurarPorEmail(aluno);
	}
	public Aluno procurarPorNome(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.procurarPorNome(aluno);
	}
	public Aluno procurarPorCPF(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.procurarPorCPF(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.existe(aluno);
	}
	
	public List<Aluno> pesquisarTodos() {
		AlunoDAO alunosDAO = new AlunoDAO();
		return alunosDAO.pesquisarTodos();
	}

	@Override
	public void gravar(Aluno alu) {
		// TODO Auto-generated method stub
		
	}
	
}
