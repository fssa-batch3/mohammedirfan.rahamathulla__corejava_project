package Day01.solved;

 class Movie {
	/**
	 * Solved Example for day 1
	 * @author BharathwajSoundarara
	 *
	 */
		public String title;}

public class TestBookComparison {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.title = "Harry Potter";
		
		Movie movie2 = new Movie();
		
		movie2.title = "Lord of the Rings";
		
		// Each object will be Stored in a separate memory location
		// so it will print false
		System.out.println(movie1 == movie2);
		
		
		
	}
}








