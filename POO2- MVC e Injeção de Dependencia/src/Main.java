import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String data1 = "12/05/2000";
		String data2 = "04/05/2003";
		String data3 = "03/09/1982";
		String data4 = "31/07/1943";
		
		Date dt_nasc1 = DataUtil.StrTodate(data1);
		Date dt_nasc2 = DataUtil.StrTodate(data2);
		Date dt_nasc3 = DataUtil.StrTodate(data3);
		Date dt_nasc4 = DataUtil.StrTodate(data4);
	
		Aluno alu1 = new Aluno("21344","777777", dt_nasc1, "qweqwe@gmais.com", "Rafael");
		Aluno alu2 = new Aluno("2341241","2222222", dt_nasc2, "a@gmais.com", "Joao");
		Aluno alu3 = new Aluno("2134123412","666666", dt_nasc3, "b@gmais.com", "Kaio");
		Aluno alu4 = new Aluno("1234124","4444444", dt_nasc4, "c@gmais.com", "Mateus");
		//Aluno alu5 = new Aluno("33333","2222", "21/08/1231", "d@gmais.com", "Lucas");
	
		
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
		p.alterar(alu3);
		
		//--------procurar por CPF--------
		alu3 = p.procurarPorCPF(alu3);
		System.out.println(alu3);
		
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
		alu4 = p.procurarPorCPF(alu4);
		System.out.println(alu4);
		
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
