
public class VolleyballPlayer extends Athlete {
	private double blocksPerGame;
	private double hittingPercentage;
	
	public VolleyballPlayer(String name, int age, char gender, double blocksPerGame, double hittingPercentage) {
		super(name, age, gender);
		this.blocksPerGame = blocksPerGame;
		this.hittingPercentage = hittingPercentage;
	}
	
	public String toString() {
		String temp;
		if (super.gender() == 'm') {
			temp = "guy";
		} else {
			temp = "gal";
		}
		return
			super.toString() + " This strong " +
			temp + " gets an average of " +
			blocksPerGame + " blocks per game and hits the ball " +
			hittingPercentage + "% of the time.";
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			VolleyballPlayer newObj = (VolleyballPlayer) o;
			if(newObj.blocksPerGame == blocksPerGame && newObj.hittingPercentage == hittingPercentage) {
				return true;
			}
		}
		return false;
	}

}
