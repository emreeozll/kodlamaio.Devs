package kodlamaio.Devs.dataAccess.abstracts;



import java.util.List;

import kodlamaio.Devs.entities.concretes.ProgramLanguage;

public interface ProgramLanguageRepository {
	
	
	void add(ProgramLanguage language);

	void delete(ProgramLanguage language);

	void update(ProgramLanguage language);
	
	void fetcLanguageById(Integer integer);

	List<ProgramLanguage> getAll();

}
