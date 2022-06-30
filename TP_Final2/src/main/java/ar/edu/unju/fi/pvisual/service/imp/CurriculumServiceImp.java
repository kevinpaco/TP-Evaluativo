package ar.edu.unju.fi.pvisual.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.model.Curriculum;
import ar.edu.unju.fi.pvisual.repository.ICurriculumRepository;
import ar.edu.unju.fi.pvisual.service.ICurriculumService;

@Service
public class CurriculumServiceImp implements ICurriculumService{

	@Autowired
	ICurriculumRepository usuarioRepository;
	
	@Override
	public void guardarCurriculum(Curriculum curriculum) {
		// TODO Auto-generated method stub
	      usuarioRepository.save(curriculum);
	}

}
