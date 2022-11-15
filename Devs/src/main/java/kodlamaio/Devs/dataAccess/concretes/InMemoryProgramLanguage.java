package kodlamaio.Devs.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlamaio.Devs.dataAccess.abstracts.ProgramLanguageRepository;
import kodlamaio.Devs.entities.concretes.ProgramLanguage;

@Repository
public class InMemoryProgramLanguage implements ProgramLanguageRepository {

	
	List<ProgramLanguage> languages;

	
	 
	public InMemoryProgramLanguage() {
		
		languages= new ArrayList<ProgramLanguage>();
		languages.add(new ProgramLanguage(1,"Java","Jame Gosling","1995"));
		languages.add(new ProgramLanguage(2,"C#","Ömer abi","1990"));
		
	}

	@Override
	public void add(ProgramLanguage language) {

		System.out.println(
				"Program Language succesfuly added to InMemory : " + language.getId() + language.getLanguageName());
		languages.add(language);

	}

	@Override
	public void delete(ProgramLanguage language) {
		System.out.println(
				"Program Language succesfuly deleted to InMemory : " + language.getId() + language.getLanguageName());
	    languages.remove(language);

	}

	@Override
	public void update(ProgramLanguage language) {

		System.out.println("Program Language succesfuly updated to InMemory : " + language.getId() + language.getLanguageName());

	}

	@Override
	public List<ProgramLanguage> getAll() {

		return languages;
	}

	@Override
	public void fetcLanguageById(Integer integer) {

		for (ProgramLanguage programLanguage : languages) {
			if (programLanguage.getId() == integer) {
				System.out.println(programLanguage.getId() + " " + programLanguage.getLanguageName() + " "
						+ programLanguage.getLanguageCreatorName());
			}
		}

	}

}
