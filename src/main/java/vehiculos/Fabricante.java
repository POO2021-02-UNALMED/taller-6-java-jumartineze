package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	protected int vendidos;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public Pais getPais() {return pais;}
	public void setPais(Pais pais) {this.pais = pais;}
	
	public static Fabricante fabricaMayorVentas() {
		return Collections.max(fabricantes, 
				(x,y) -> x.vendidos - y.vendidos);
	}
}