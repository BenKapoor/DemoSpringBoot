package eu.ensup.demospringboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.demospringboot.domaine.Formation;

public interface IFormationRepository extends JpaRepository<Formation, Long> {
	List<Formation>findByTheme(String theme);
}
