package com.classes;
import java.util.List;
import java.util.ArrayList;

public class ListClientes {
	
	List<Cliente> lista = new ArrayList<Cliente>();
	
	public void inserir(Cliente cli){
		lista.add(cli);
	}
	
	public List<Cliente> getLista(){
		return lista;
	}
	
	
}
