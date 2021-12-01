package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	private static Pais masVendedor(ArrayList<Pais> paises) {
		ArrayList<Integer> rep = new ArrayList<Integer>(); 
		ArrayList<Pais> repP = new ArrayList<Pais>();
		
		for (int i=0; i<paises.size(); i++) {
			int count = 0;
			if (repP.contains(paises.get(i))==false) {
				repP.add(paises.get(i));
				for (int e=0; e<paises.size(); e++) {
					if (paises.get(i) == paises.get(e)) {
						count++;
					}
				}
			}
			rep.add(count);
		}

		int max = Collections.max(rep);
		return repP.get(rep.indexOf(max));
	}
	
	public static Pais paisMasVendedor() {
		return masVendedor(Vehiculo.paises);
	}
}
