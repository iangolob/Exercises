package hr.fer.oop;

public class Dictionary extends Book implements ItemWithLocation {
	private String firstLanguage;
	private String secondLanguage;
	private String location;
	public Dictionary(int id, String name, String author,String firstLanguage,String secondLanguage) {
		super(id, name, author);
		this.firstLanguage=firstLanguage;
		this.secondLanguage=secondLanguage;
	}
	public String getFirstLanguage() {
		return firstLanguage;
	}
	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}
	public String getSecondLanguage() {
		return secondLanguage;
	}
	public void setSecondLanguage(String secondLanguage) {
		this.secondLanguage = secondLanguage;
	}
	public String getLocation() {
		return location;
	}
}
