package ar.edu.unlam.basica2.tp3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class TestBar {

	@Test
	public void testAgregarClientes() {
		Bar bar=new Bar();
		bar.agregarCliente(new Cliente("Juan",25));
		bar.agregarCliente(new Cliente("Maria",26));
		bar.agregarCliente(new Cliente("Lucio",35));
		assertEquals(3,bar.getClientes().size(),0.01);
	}
@Test
public void testAgregarClientesConNombreIguales(){
	Bar bar=new Bar();
	bar.agregarCliente(new Cliente("Jose", 30));
	bar.agregarCliente(new Cliente("Juan", 33));
	bar.agregarCliente(new Cliente("Jose", 38));
	assertEquals(2,bar.getClientes().size(),0.01);
	}
@Test
public void testClientesOrdenadosPorNombre(){
	Bar bar=new Bar();
	bar.agregarCliente(new Cliente("Jose", 36));
	bar.agregarCliente(new Cliente("Maria", 23));
	bar.agregarCliente(new Cliente("Ana", 27));
	assertEquals("Ana",bar.getClientes().first().getNombre());
	assertEquals("Maria",bar.getClientes().last().getNombre());
	
}
@Test
public void testCompararClientesIguales(){
	Cliente cliente1= new Cliente("Maria",33);
	Cliente cliente2= new Cliente("Maria",33);
	assertEquals(0,cliente1.compareTo(cliente2));
}
@Test
public void testCompararClientesDistintos(){
	Cliente cliente1= new Cliente("Maria",33);
	Cliente cliente2= new Cliente("Juan",35);
	assertNotEquals(0,cliente1.compareTo(cliente2));
}
@Test
public void testOrdenarClientesPorEdad(){
	ComparadorPorEdad miComparador=new ComparadorPorEdad();
	Bar bar=new Bar();
	bar.agregarCliente(new Cliente("Maria",33));
	bar.agregarCliente(new Cliente("Jose",30));
	bar.agregarCliente(new Cliente("Pedro",38));
	TreeSet <Cliente> clientePorEdad= new TreeSet<Cliente>(miComparador);
	clientePorEdad.addAll(clientePorEdad);
	assertEquals("Jose", bar.getClientes().first().getNombre());
	assertEquals("Pedro", bar.getClientes().last().getNombre());
}
}
