import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import org.jdom.output.XMLOutputter;

public class AlunoXML implements IAlunoPersist{

	public void gravar(Aluno alu) {
		
			// Cria o elemento que ser� o root
			Element config = new Element("Alunos");

			//define config como root
			Document documento = new Document(config);

			Element titulo = new Element("titulo");
			titulo.setText("Cadastro de Alunos");
			
			config.addContent(titulo);
			
				Element aluno = new Element("aluno");
				
				aluno.setAttribute("matricula", String.valueOf(alu.getMatricula()));
				
				Element nome = new Element("nome");
				nome.setText(alu.getNome());
				
				Element matricula = new Element("matricula");
				matricula.setText(alu.getMatricula());

				Element email = new Element("email");
				email.setText(alu.getEmail());

				Element cpf = new Element("email");
				cpf.setText(alu.getCpf());
				
				Element DataNascimento = new Element("DatadeNascimento");
				DataNascimento.setText(alu.getDataNascimento());
							
				aluno.addContent(nome);
				aluno.addContent(email);
				aluno.addContent(matricula);
				aluno.addContent(DataNascimento);
				aluno.addContent(cpf);
				config.addContent(aluno);			

			//classe respons�vel para imprimir / gerar o xml
			XMLOutputter xout = new XMLOutputter();	
			try {
				//criando o arquivo de saida
				System.out.println(".xml");
				BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aluno.xml"),"UTF-8"));
				//imprimindo o xml no arquivo
				xout.output(documento, arquivo);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
