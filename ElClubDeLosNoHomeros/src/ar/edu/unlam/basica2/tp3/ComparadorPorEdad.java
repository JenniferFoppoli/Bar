package ar.edu.unlam.basica2.tp3;
import java.util.*;

public class ComparadorPorEdad implements Comparator<Cliente> {

	@Override
	public int compare (Cliente cliente, Cliente otroCliente) {
		return cliente.getEdad()- otroCliente.getEdad();
	}

}
