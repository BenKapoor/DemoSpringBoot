package eu.ensup.demospringboot.service;

import java.util.List;

import eu.ensup.demospringboot.dao.IFormationRepository;
import eu.ensup.demospringboot.domaine.Formation;

public interface IFormationService {

	List<Formation>lireFormationByTheme(String theme);
}