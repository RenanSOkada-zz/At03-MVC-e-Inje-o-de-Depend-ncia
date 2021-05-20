import java.util.List;

public interface IAlunoPersistDAO {
	
	public boolean inserir(Aluno aluno);

	public  boolean alterar(Aluno aluno);
	
	public boolean excluir(Aluno aluno);
	
	public Aluno procurarPorMatricula(Aluno aluno) ;
	
	public Aluno procurarPorDataNascimento(Aluno aluno);
	
	public Aluno procurarPorEmail(Aluno aluno) ;
	
	public Aluno procurarPorNome(Aluno aluno) ;
	
	public Aluno procurarPorCPF(Aluno aluno) ;
	
	public boolean existe(Aluno aluno);
	
	public List<Aluno> pesquisarTodos() ;

}
