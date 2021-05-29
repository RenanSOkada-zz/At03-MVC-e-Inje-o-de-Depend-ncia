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
			if(gson.toJson(alu) == gson.toJson(alu.getDataNascimento())) {
				writer.write(gson.toJson(DataUtil.DataForStringPadrao(alu.getDataNascimento()))); 
			}
			writer.write(gson.toJson(alu));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
