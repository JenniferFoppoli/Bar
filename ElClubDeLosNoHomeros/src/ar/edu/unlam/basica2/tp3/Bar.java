package ar.edu.unlam.basica2.tp3;

import java.util.*;

public class Bar {
	private TreeSet<Cliente> clientes;

	public Bar() {
		// TODO Auto-generated constructor stub
		clientes= new TreeSet<Cliente>();
	}
public TreeSet<Cliente>getClientes(){
	return clientes;
}
public void setClientes (TreeSet<Cliente>clientes){
	this.clientes=clientes;
}
public void agregarCliente(Cliente cliente){
	if(cliente!=null){
		clientes.add(cliente);
	}
}
}
