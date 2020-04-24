package eu.ensup.demospringboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.ensup.demospringboot.dao.IFormationRepository;
import eu.ensup.demospringboot.domaine.Formation;
import eu.ensup.demospringboot.service.FormationService;
import eu.ensup.demospringboot.service.IFormationService;

@Controller
public class FormationController {

	
	@Autowired
	private IFormationService iFormationService;
	

	@Bean
	public FormationService iFormationService() {
		return new FormationService();
	}
	
	public FormationController(IFormationService iFroamtionService) {
		super();
		this.iFormationService = iFroamtionService;
	}
	
	public FormationController() {
		super();
	}

	// Pour acceder à la méthode listerFormation => (exemple) http://localhost/formationList/Bilan
	@RequestMapping(value = "/{theme}", method = RequestMethod.GET)
	public String listerFormations(@PathVariable("theme") String theme, Model model) {
		System.out.println("Le controller est dans la méthode listerFormation");
		List<Formation>listeFormationByTheme = iFormationService.lireFormationByTheme(theme);
		if(listeFormationByTheme != null) {
			// Permet de stocker des données et de les apsser d'une page à une autre
			model.addAttribute("listeFormationByTheme", listeFormationByTheme);
		} 
		System.out.println(listeFormationByTheme);
		// renvoie vers un écran cible, ici la vue listeFormationParTheme
		return "listeFormationParTheme";
	}
	
	// Pour acceder à la méthode addToFormations => (exemple) http://localhost/formationList/Spring
//	@RequestMapping(value = "/{theme}", method = RequestMethod.POST)
//	public String addToFormations(@PathVariable("theme") String theme, Formation formation) {
//		System.out.println("Le controller est dans la méthode addToFormations");
//		formation.setTheme(theme);
//		iFormationRepository.save(formation);
//		return "redirect:/Formation/{theme}";
//	}
	
	@GetMapping("getForm")
    public String getForm() {
        return "employeeFrom";
    }

    @PostMapping("/saveDetails")                     // it only support port method
    public String saveDetails(@RequestParam("theme") String theme,
                              @RequestParam("description") String description,
                              ModelMap modelMap, Formation formation) {

        // write your code to save details
        modelMap.put("theme", theme);
        modelMap.put("description", description);
        
        return "toto";           // welcome is view name. It will call welcome.jsp
    }
}
