package ar.edu.unju.fi.pvisual.until;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.pvisual.model.Curriculum;
@Component
public class ListaCurriculum {

	private ArrayList<Curriculum> listaCurriculum;
	
	public ListaCurriculum() {
		listaCurriculum = new ArrayList<Curriculum>();
		listaCurriculum.add(new Curriculum());
		
	}

	public ArrayList<Curriculum> getListaCurriculum() {
		return listaCurriculum;
	}

	public void setListaCurriculum(ArrayList<Curriculum> listaCurriculum) {
		this.listaCurriculum = listaCurriculum;
	}
	
}
