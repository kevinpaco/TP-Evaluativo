package ar.edu.unju.fi.pvisual.until;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.pvisual.model.Empleadores;

@Component
public class ListaEmpleador {
       private ArrayList<Empleadores> listaEmpleador;
       
       public ListaEmpleador() {
    	   listaEmpleador=new ArrayList<Empleadores>();
    	   listaEmpleador.add(new Empleadores());
       }

	public ArrayList<Empleadores> getListaEmpleador() {
		return listaEmpleador;
	}

	public void setListaEmpleador(ArrayList<Empleadores> listaEmpleador) {
		this.listaEmpleador = listaEmpleador;
	}
       
}
