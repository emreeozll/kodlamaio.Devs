package kodlamaio.Devs.business.abstracts;

import java.util.List;
import kodlamaio.Devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageService {

	
	void add(ProgramLanguage language) throws Exception;

	void delete(ProgramLanguage language);

	void update(ProgramLanguage language);

	void fetchLanguageById(Integer integer);

	List<ProgramLanguage> getAll();

}
