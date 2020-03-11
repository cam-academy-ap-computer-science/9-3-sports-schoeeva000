
public class Snowboarder extends Athlete{
	
	private double highestScore;
	private int medalsWon;
	private String typeOfTrack;

	// constructor accepts name, age, and gender for the superclass,
	// but highest score, medals won, and type of track they snowboard on as well
	public Snowboarder(String name, int age, char gender, double highestScore, int medalsWon, String typeOfTrack) {
		super(name, age, gender);
		this.highestScore = highestScore;
		this.medalsWon = medalsWon;
		this.typeOfTrack = typeOfTrack;
	}
	
	public String toString() {
		String temp;
		if (super.gender() == 'm') {
			temp = "He";
		} else {
			temp = "She";
		}
		return 
			super.toString() + " " 
			+ super.name(0) + " has a high score on " + 
			typeOfTrack + " of " + 
			highestScore + ". " +  
			temp + " has won " + 
			medalsWon + " medals.";
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			Snowboarder newObj = (Snowboarder) o;
			if(newObj.highestScore == highestScore && newObj.medalsWon == medalsWon && newObj.typeOfTrack.equals(typeOfTrack)) {
				return true;
			}
		}
		return false;
	}

}
