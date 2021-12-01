package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises.add(p3);
		paises.add(p2);
		paises.add(p1);
		paises.add(p3);
		paises.add(p3);
	    
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
		System.out.println(repP.get(rep.indexOf(max)).getNombre());
	  }
}
