package eu.ensup.demospringboot.dao;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.demospringboot.domaine.Formation;

public interface IFormationRepository extends JpaRepository<Formation, Long> {
	ArrayList<Formation>findByTheme(String theme);
}
