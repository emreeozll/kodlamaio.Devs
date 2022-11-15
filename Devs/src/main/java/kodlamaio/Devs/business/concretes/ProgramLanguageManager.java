package kodlamaio.Devs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.Devs.business.abstracts.ProgramLanguageService;
import kodlamaio.Devs.dataAccess.abstracts.ProgramLanguageRepository;
import kodlamaio.Devs.entities.concretes.ProgramLanguage;

@Service
public class ProgramLanguageManager implements ProgramLanguageService {

	private ProgramLanguageRepository languageRepository;

	@Autowired
	public ProgramLanguageManager(ProgramLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;

	}

	@Override
	public void add(ProgramLanguage language) throws Exception {

		for (ProgramLanguage languageforeach : languageRepository.getAll()) {

			if (languageforeach.getLanguageName().equals(language)) {

				throw new Exception("Program Language name cannot be repeated");
			}
			if (language.getLanguageName().isEmpty()) {
				throw new Exception("programming language cannot be empty");
			}
		}

		languageRepository.add(language);

	}

	@Override
	public void delete(ProgramLanguage language) {
		languageRepository.delete(language);

	}

	@Override
	public void update(ProgramLanguage language) {
		languageRepository.update(language);

	}

	@Override
	public void fetchLanguageById(Integer integer) {

		List<ProgramLanguage> languages = languageRepository.getAll();

		for (ProgramLanguage language : languages) {
			if (language.getId() == integer) {
				languageRepository.fetcLanguageById(integer);
			}
		} 

	}

	@Override
	public List<ProgramLanguage> getAll() {

		return languageRepository.getAll();
	}

}
