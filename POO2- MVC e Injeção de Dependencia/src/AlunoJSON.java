import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AlunoJSON implements IAlunoPersist{
	
public void gravar(Aluno alu) {
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("aluno.json ");
			writer.write(gson.toJson(alu));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

@Override
public boolean inserir(Aluno aluno) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean alterar(Aluno aluno) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean excluir(Aluno aluno) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Aluno procurarPorMatricula(Aluno aluno) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Aluno procurarPorDataNascimento(Aluno aluno) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Aluno procurarPorEmail(Aluno aluno) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Aluno procurarPorNome(Aluno aluno) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Aluno procurarPorCPF(Aluno aluno) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existe(Aluno aluno) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public List<Aluno> pesquisarTodos() {
	// TODO Auto-generated method stub
	return null;
}
}
