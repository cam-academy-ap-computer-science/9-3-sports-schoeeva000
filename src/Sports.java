// The client 'main' tester routine - load your sports database, and produce desired output.
public class Sports {
	
	public static void main(String[] args) {
		Snowboarder shawn = new Snowboarder("Shawn White", 32, 'm', 97.75, 8, "Half Pipe");
		System.out.println(shawn.toString());
		Snowboarder bobby = new Snowboarder("Shawn White", 32, 'm', 97.75, 8, "Half Pipe");
		
		SkeletonPlayer jody = new SkeletonPlayer("Jody Kicker", 88, 'f', 2.32, "English");
		SkeletonPlayer sinora = new SkeletonPlayer("Jody Kicker", 88, 'f', 2.32, "English");

		
		System.out.println(shawn.equals(sinora));
		System.out.println(jody.equals(sinora));
	}
}
