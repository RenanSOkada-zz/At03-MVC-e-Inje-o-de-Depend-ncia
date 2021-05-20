import java.util.List;

public class AlunoPersistDAO {
	
	private IAlunoPersistDAO persistDAO;
	
	public AlunoPersistDAO(IAlunoPersistDAO persistDAO) {
		this.persistDAO = persistDAO;
	}
	
	public boolean inserir(Aluno aluno) {
		return persistDAO.inserir(aluno);
	}

	public  boolean alterar(Aluno aluno) {
		return persistDAO.inserir(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		return persistDAO.excluir(aluno);
	}
	
	public Aluno procurarPorMatricula(Aluno aluno) {
		return persistDAO.procurarPorMatricula(aluno);
	}
	
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		return persistDAO.procurarPorDataNascimento(aluno);
	}
	
	public Aluno procurarPorEmail(Aluno aluno) {
		return persistDAO.procurarPorEmail(aluno);
	}
	
	public Aluno procurarPorNome(Aluno aluno) {
		return persistDAO.procurarPorNome(aluno);
	}
	
	public Aluno procurarPorCPF(Aluno aluno) {
		return persistDAO.procurarPorCPF(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		return persistDAO.existe(aluno);
	}
	
	public List<Aluno> pesquisarTodos(){
		return persistDAO.pesquisarTodos();
	}
}
