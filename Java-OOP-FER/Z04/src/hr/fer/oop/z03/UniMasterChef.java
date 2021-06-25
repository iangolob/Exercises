package hr.fer.oop.z03;

public class UniMasterChef {
	private CompetitionEntry[] entries;
	public UniMasterChef(int numOfEntries) {
		entries = new CompetitionEntry[numOfEntries];
	}
	public boolean addEntry(CompetitionEntry entry) {
		for(int i=0;i<entries.length;i++) {
			if(entries[i]==null) {
				entries[i]=entry;
				return true;
			}
		}
		return false;
	}
	public Dessert getBestDessert() {
		double bestRating=entries[0].getRating();
		Dessert bestDessert=entries[0].getDessert();
		for(CompetitionEntry entry:entries) {
			if(entry.getRating()>bestRating) {
				bestRating=entry.getRating();
				bestDessert=entry.getDessert();
			}
		}
		return bestDessert;
	}
	public static Person[] getInvolvedPeople(CompetitionEntry entry) {
		return entry.getStudents();
	}
}
