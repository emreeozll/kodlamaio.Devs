package kodlamaio.Devs.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Devs.business.abstracts.ProgramLanguageService;
import kodlamaio.Devs.entities.concretes.ProgramLanguage;

@RestController
@RequestMapping("/api/programlanguages")
public class ProgramLanguagesController {

	private ProgramLanguageService languageService;
    
	@Autowired
	public ProgramLanguagesController(ProgramLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgramLanguage> getAll(){
		 return languageService.getAll();
	}
	
}
