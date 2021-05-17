import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Aluno alu1 = new Aluno("999999","777777", "12/05", "qweqwe@gmais.com", "Rafael");
		
		AlunoCSV a_csv = new AlunoCSV();
		AlunoPersist persist = new AlunoPersist(a_csv);
		persist.gravar(alu1);
		
		AlunoJSON a_json = new AlunoJSON();
		persist = new AlunoPersist(a_json);
		persist.gravar(alu1);
		
		AlunoXML a_xml = new AlunoXML();
		persist = new AlunoPersist(a_xml);
		persist.gravar(alu1);
		
		
		//-------------Banco de dados-------------------
		
		
		AlunoBO alunobo = new AlunoBO();
		Aluno alu2 = new Aluno("999999","777777", "04/05", "a@gmais.com", "Joao");
		Aluno alu3 = new Aluno("888888","6666", "03/09", "b@gmais.com", "Kaio");
		Aluno alu4 = new Aluno("555555","4444", "31/07", "c@gmais.com", "Mateus");
		Aluno alu5 = new Aluno("33333","2222", "21/08", "d@gmais.com", "Lucas");
		persist = new AlunoPersist(alunobo);
		
		
		//--------Inserir--------
		
		if (alunobo.inserir(alu2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		if (alunobo.inserir(alu3))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		if (alunobo.inserir(alu4))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		//--------Existe--------
		
		if (alunobo.existe(alu3))
			System.out.println("Aluno Encontrada");
		else
			System.out.println("Nao Encontrada");
		
		//--------Alterar--------
		alunobo.alterar(alu5);
		alu5 = alunobo.procurarPorCPF(alu5);
		System.out.println(alu5);
		
		//--------Excluir--------
		if (alunobo.excluir(alu3))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

		
		
		//--------Procurar Matricula--------
		alu1 = alunobo.procurarPorCPF(alu1);
		System.out.println(alu1);
		
		//--------Procurar por data de nascimento--------
		alu2 = alunobo.procurarPorDataNascimento(alu2);
		System.out.println(alu2);
				
		//--------Procurar por por email--------
		alu3 = alunobo.procurarPorEmail(alu3);
		System.out.println(alu3);
		
		//--------Procurar por nome--------
		alu4 = alunobo.procurarPorNome(alu4);
		System.out.println(alu4);
		
		//--------Procurar por cpf--------
		alu5 = alunobo.procurarPorCPF(alu5);
		System.out.println(alu5);
		
		//--------Pesquisar por todos--------
		List<Aluno> lista = new ArrayList<Aluno>();
		lista = alunobo.pesquisarTodos();
		for (Aluno aluno : lista) {
			System.out.println(aluno.toString());
		}
		
	}

}
