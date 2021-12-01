package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public Pais getPais() {return pais;}
	public void setPais(Pais pais) {this.pais = pais;}
	
	private static Fabricante mayorVentas(ArrayList<Fabricante> fabricantes) {
		ArrayList<Integer> rep = new ArrayList<Integer>(); 
		ArrayList<Fabricante> repP = new ArrayList<Fabricante>();
		
		for (int i=0; i<fabricantes.size(); i++) {
			int count = 0;
			if (repP.contains(fabricantes.get(i))==false) {
				repP.add(fabricantes.get(i));
				for (int e=0; e<fabricantes.size(); e++) {
					if (fabricantes.get(i) == fabricantes.get(e)) {
						count++;
					}
				}
			}
			rep.add(count);
		}

		int max = Collections.max(rep);
		return repP.get(rep.indexOf(max));
	}
	
	public static Fabricante fabricaMayorVentas() {
		return mayorVentas(Vehiculo.fabricantes);
	}
}
