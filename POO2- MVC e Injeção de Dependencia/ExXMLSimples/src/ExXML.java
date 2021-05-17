
import java.util.Iterator;
import java.util.List;

import com.classes.Cliente;
import com.classes.ListClientes;
import com.persistencia.ManipXML;

public class ExXML {
	
	public static void main(String[] args) {

		ListClientes lista = new ListClientes();
		
		Cliente cli = new Cliente();
		cli.setCodigo(123);
		cli.setNome("Rodrigo");
		cli.setEmail("rodrigo@curvello.com");
		cli.setFone("1234-4321");
		
		lista.inserir(cli);
		
		cli = new Cliente();
		cli.setCodigo(321);
		cli.setNome("curvello");
		cli.setEmail("12@curvello.com");
		cli.setFone("9999-4321");
		
		lista.inserir(cli);
	
		ManipXML.gravarXMLCliente(lista.getLista());	
	
		List<Cliente> list = ManipXML.lerXMLCOM();
		
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Cliente element = (Cliente) iter.next();
			System.out.println(element.toString() + "\n---");	
		}
		
	}
}