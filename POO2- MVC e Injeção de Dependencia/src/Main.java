import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String data1 = "12/05/2000";
		String data2 = "04/05/2003";
		String data3 = "03/09/1982";
		String data4 = "31/07/1943";
		String data5 = "21/08/1231";
		
		Date dt_nasc1 = DataUtil.StrTodate(data1);
		Date dt_nasc2 = DataUtil.StrTodate(data2);
		Date dt_nasc3 = DataUtil.StrTodate(data3);
		Date dt_nasc4 = DataUtil.StrTodate(data4);
		Date dt_nasc = DataUtil.StrTodate(data5);
	
		Aluno alu1 = new Aluno("1","777777", dt_nasc1, "qweqwe@gmais.com", "Rafael");
		Aluno alu2 = new Aluno("2","2222222", dt_nasc2, "a@gmais.com", "Joao");
		Aluno alu3 = new Aluno("3","666666", dt_nasc3, "b@gmais.com", "Kaio");
		Aluno alu4 = new Aluno("4","4444444", dt_nasc4, "c@gmais.com", "Mateus");
		Aluno alu5 = new Aluno("3","2222", dt_nasc, "d@gmais.com", "Lucas");
		Aluno alu6 = new Aluno("3","", dt_nasc, "", "");
	
		
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
		
		
		
		//--------Procurar Matricula--------
		alu6 = p.procurarPorMatricula(alu6);
		System.out.println(alu6);
	
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
	
		//--------Alterar--------
		p.alterar(alu5);
		alu5 = p.procurarPorMatricula(alu5);
		System.out.println(alu5);
		
		//--------Pesquisar por todos--------
		
		
		lista = p.pesquisarTodos();
		for (Aluno aluno : lista) {
			System.out.println(aluno.toString());
		}
			
	}

}
