package ar.edu.unlam.basica2.tp3;



public class Cliente implements Comparable <Cliente> {

	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre,Integer edad) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.edad=edad;
			
	}
public String getNombre (){
	return nombre;
}
public void setNombre(String nombre){
	this.nombre=nombre;
}
public Integer getEdad(){
	return edad;
}
public void setEdad(Integer edad){
	this.edad=edad;
}
@Override
public int hashCode(){
	return 1;
}
@Override
public boolean equals(Object obj){
	if(obj instanceof Cliente){
		Cliente cliente2=(Cliente)obj;
		if(this.nombre.equalsIgnoreCase(cliente2.getNombre())){
			return true;
		}
		else{
			return false;
		}
		}
		else{
			return false;
		}
	}
 

@Override
public int compareTo(Cliente cliente2){
	return this.nombre.compareTo(cliente2.getNombre());
}
}