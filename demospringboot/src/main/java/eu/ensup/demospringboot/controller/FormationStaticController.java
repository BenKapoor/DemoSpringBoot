package eu.ensup.demospringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.demospringboot.dao.IFormationRepository;
import eu.ensup.demospringboot.domaine.Formation;

@RestController
public class FormationStaticController {

	private IFormationRepository iFormationRepository;
	
	@Autowired
	public FormationStaticController(IFormationRepository iFormationRepository) {
		this.iFormationRepository = iFormationRepository;
	}
	
	@RequestMapping("/")
	String home() {
		return "Page d'accueil";
	}
	
	@RequestMapping("/toto")
	String homeToto() {
		return "Bienvenue Toto";
	}
}
