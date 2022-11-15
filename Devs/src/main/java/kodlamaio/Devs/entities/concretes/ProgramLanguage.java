package kodlamaio.Devs.entities.concretes;

public class ProgramLanguage {

	
	int id;
	String languageName;
	String languageCreatorName;
	String languageReleaseDate;
	
	
	
	public ProgramLanguage(int id, String languageName, String languageCreatorName, String languageReleaseDate) {
		this.id = id;
		this.languageName = languageName;
		this.languageCreatorName = languageCreatorName;
		this.languageReleaseDate = languageReleaseDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageCreatorName() {
		return languageCreatorName;
	}
	public void setLanguageCreatorName(String languageCreatorName) {
		this.languageCreatorName = languageCreatorName;
	}
	public String getLanguageReleaseDate() {
		return languageReleaseDate;
	}
	public void setLanguageReleaseDate(String languageReleaseDate) {
		this.languageReleaseDate = languageReleaseDate;
	}
	
	
}
