import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		Aluno alu1 = new Aluno("999999","777777", "12/05/2000", "qweqwe@gmais.com", "Rafael");
		Aluno alu2 = new Aluno("999999","777777", "04/05/2003", "a@gmais.com", "Joao");
		Aluno alu3 = new Aluno("888888","6666", "03/09/1982", "b@gmais.com", "Kaio");
		Aluno alu4 = new Aluno("555555","4444", "31/07/1943", "c@gmais.com", "Mateus");
		Aluno alu5 = new Aluno("33333","2222", "21/08/1231", "d@gmais.com", "Lucas");
	
		//-------------CSV, JSON e XML-------------------
		
		AlunoCSV a_csv = new AlunoCSV();
		AlunoPersist persist = new AlunoPersist(a_csv);
		persist.gravar(alu1);
		
		AlunoJSON a_json = new AlunoJSON();
		persist = new AlunoPersist(a_json);
		persist.gravar(alu1);
		
		AlunoXML a_xml = new AlunoXML();
		persist = new AlunoPersist(a_xml);
		persist.gravar(alu1);
		
		AlunoBO alunobo = new AlunoBO();
		AlunoPersistDAO p = new AlunoPersistDAO(alunobo);
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		
		
		//-------------Banco de dados-------------------
		
		//--------Inserir--------
		
		if (p.inserir(alu2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		if (p.inserir(alu3))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		if (p.inserir(alu4))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		//--------Existe--------
		
		if (p.existe(alu3))
			System.out.println("Aluno Encontrada");
		else
			System.out.println("Nao Encontrada");
		
		//--------Alterar--------
		p.alterar(alu5);
		alu5 = p.procurarPorCPF(alu5);
		System.out.println(alu5);
		
		

		
		
		//--------Procurar Matricula--------
		alu1 = p.procurarPorCPF(alu1);
		System.out.println(alu1);
		
		//--------Procurar por data de nascimento--------
		alu2 = p.procurarPorDataNascimento(alu2);
		System.out.println(alu2);
				
		//--------Procurar por por email--------
		alu3 = p.procurarPorEmail(alu3);
		System.out.println(alu3);
		
		//--------Procurar por nome--------
		alu4 = p.procurarPorNome(alu4);
		System.out.println(alu4);
		
		//--------Procurar por cpf--------
		alu5 = p.procurarPorCPF(alu5);
		System.out.println(alu5);
		
		//--------Pesquisar por todos--------
		
		
		lista = p.pesquisarTodos();
		for (Aluno aluno : lista) {
			System.out.println(aluno.toString());
		}
		
		//--------Excluir--------
		if (p.excluir(alu3))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
	}

}
