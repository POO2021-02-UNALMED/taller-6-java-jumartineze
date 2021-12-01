package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>(); 
	protected int vendidos;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public static Pais paisMasVendedor() {
		return Collections.max(paises, 
				(x, y) ->  x.vendidos - y.vendidos);
	}
}