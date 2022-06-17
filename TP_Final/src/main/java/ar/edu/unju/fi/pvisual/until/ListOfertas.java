package ar.edu.unju.fi.pvisual.until;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.pvisual.model.OfertasLaborales;

@Component
public class ListOfertas {

	private ArrayList<OfertasLaborales> ofert;
	
	public  ListOfertas(){
		
	     ofert = new ArrayList<OfertasLaborales>();
	     ofert.add(new OfertasLaborales(2,"Analista de sistemas","area de Marketing","De hs 14 a 20","Reparacion de Apps",38823123,"jornada de 8 horas","Connosimientos de Angular",112332,"Home Office",true));
	     ofert.add(new OfertasLaborales(3,"desallador we","area de capasitacion","De hs 8 a 14","Enseñansa",388242323,"jornada de 8 horas","conosimiento de enseñansa",13232323,"Home Office",true));
	     ofert.add(new OfertasLaborales(4,"desallador we","area de capasitacion","De hs 8 a 14","Enseñansa",388242323,"jornada de 8 horas","conosimiento de enseñansa",13232323,"Home Office",true)); 
	}

	public ArrayList<OfertasLaborales> getOfert() {
		return ofert;
	}

	public void setOfert(ArrayList<OfertasLaborales> ofert) {
		this.ofert = ofert;
	}
	
	
}
