package eu.ensup.demospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eu.ensup.demospringboot.dao.IFormationRepository;
import eu.ensup.demospringboot.domaine.Formation;

public class FormationService implements IFormationService {
	
	@Autowired
	private IFormationRepository formationRepository;
	
	public FormationService(IFormationRepository formationRepository) {
		super();
		this.formationRepository = formationRepository;
	}
	
	public FormationService() {
		super();
	}



	public List<Formation>lireFormationByTheme(String theme){
		return formationRepository.findByTheme(theme);
	}
}
