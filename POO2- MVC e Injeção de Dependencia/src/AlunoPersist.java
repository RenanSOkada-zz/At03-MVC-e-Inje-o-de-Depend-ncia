import java.util.List;

public class AlunoPersist {

	private IAlunoPersist persist;
	
	public AlunoPersist(IAlunoPersist persist) {
		this.persist = persist;
	}
	
	public void gravar(Aluno alu) {
		persist.gravar(alu);
	}
	
	public boolean inserir(Aluno aluno) {
		return persist.inserir(aluno);
	}

	public  boolean alterar(Aluno aluno) {
		return persist.inserir(aluno);
	}
	
	public boolean excluir(Aluno aluno) {
		return persist.excluir(aluno);
	}
	
	public Aluno procurarPorMatricula(Aluno aluno) {
		return persist.procurarPorMatricula(aluno);
	}
	
	public Aluno procurarPorDataNascimento(Aluno aluno) {
		return persist.procurarPorDataNascimento(aluno);
	}
	
	public Aluno procurarPorEmail(Aluno aluno) {
		return persist.procurarPorEmail(aluno);
	}
	
	public Aluno procurarPorNome(Aluno aluno) {
		return persist.procurarPorNome(aluno);
	}
	
	public Aluno procurarPorCPF(Aluno aluno) {
		return persist.procurarPorCPF(aluno);
	}
	
	public boolean existe(Aluno aluno) {
		return persist.existe(aluno);
	}
	
	public List<Aluno> pesquisarTodos(){
		return persist.pesquisarTodos();
	}

}
