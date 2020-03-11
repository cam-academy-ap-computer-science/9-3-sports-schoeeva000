
public class SkeletonPlayer extends Athlete{
	
	private double fastestTime;
	private String nationality;

	public SkeletonPlayer(String name, int age, char gender, double fastestTime, String nationality) {
		super(name, age, gender);
		this.fastestTime = fastestTime;
		this.nationality = nationality;
	}
	
	public String toString() {
		return
			super.toString() + " " +
			super.name(1) + " is " +
			nationality + " and has a fastest time of " +
			fastestTime + " seconds.";
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			SkeletonPlayer newObj = (SkeletonPlayer) o;
			if(newObj.fastestTime == fastestTime && newObj.nationality.equals(nationality)) {
				return true;
			}
		}
		return false;
	}

}
