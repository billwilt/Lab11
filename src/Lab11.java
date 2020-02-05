import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab11 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		//boolean wantToContinue = false;
		String choice = "";
		//String yesno = "";
		String yesNoContinue = "";
		
		ArrayList <Movie> movieFlicks = new ArrayList<>();
		
		Movie m1 = new Movie("Star Wars", "scifi");
		movieFlicks.add(m1);
		Movie m2 = new Movie("2001: A Space Odyssey", "scifi");
		movieFlicks.add(m2);
		Movie m3 = new Movie("E.T. The Extra-terrestrial", "scifi");
		movieFlicks.add(m3);
		Movie m4 = new Movie("A Clockwork Orange", "scifi");
		movieFlicks.add(m4);
		Movie m5 = new Movie("Close Encounters of the Third Kind", "scifi");
		movieFlicks.add(m5);
		Movie m6 = new Movie("Citizen Kane", "drama");
		movieFlicks.add(m6);
		Movie m7 = new Movie("Casablanca", "drama");
		movieFlicks.add(m7);
		Movie m8 = new Movie("The Godfather", "drama");
		movieFlicks.add(m8);
		Movie m9 = new Movie("Gone With The Wind", "drama");
		movieFlicks.add(m9);
		Movie m10 = new Movie("Lawrence Of Arabia", "drama");
		movieFlicks.add(m10);
		Movie m11 = new Movie("The Wizard Of Oz", "musical");
		movieFlicks.add(m11);
		Movie m12 = new Movie("The Graduate", "drama");
		movieFlicks.add(m12);
		Movie m13 = new Movie("On The Waterfront", "drama");
		movieFlicks.add(m13);
		Movie m14 = new Movie("Schindler's List", "drama");
		movieFlicks.add(m14);
		Movie m15 = new Movie("Singin' In The Rain", "musical");
		movieFlicks.add(m15);
		Movie m16 = new Movie("Psycho", "horror");
		movieFlicks.add(m16);
		Movie m17 = new Movie("Annie Hall", "comedy");
		movieFlicks.add(m17);
		Movie m18 = new Movie("King Kong", "horror");
		movieFlicks.add(m18);
		Movie m19 = new Movie("Jaws", "horror");
		movieFlicks.add(m19);
		Movie m20 = new Movie("M*A*S*H", "comedy");
		movieFlicks.add(m20);
		Movie m21 = new Movie("Duck Soup", "comedy");
		movieFlicks.add(m21);
		Movie m22 = new Movie("My Fair Lady", "musical");
		movieFlicks.add(m22);		
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 22 movies in this list.");
		
	do {	
		System.out.println("Please type the category are you interested in Comedy, Drama, Horror, Musical, or SciFi");

		choice = scnr.nextLine();
		
		if (choice.toLowerCase().equals("comedy")) {
			//ArrayList<String> comedy = new ArrayList<>();
			
			displayCategoryMovies(movieFlicks, "comedy");
			
			System.out.println("Would you like to see another list? yes/no");
			yesNoContinue = scnr.next();
			yesNoContinue(yesNoContinue);
			
		} else if (choice.toLowerCase().equals("drama")) {
			//ArrayList<String> drama = new ArrayList<>();
			
			displayCategoryMovies(movieFlicks, "drama");
			
			System.out.println("Would you like to see another list? yes/no");
			yesNoContinue = scnr.next();
			yesNoContinue(yesNoContinue);
			
		}  else if (choice.toLowerCase().equals("horror")) {
			//ArrayList<String> horror = new ArrayList<>();
			
			displayCategoryMovies(movieFlicks, "horror");
			
			System.out.println("Would you like to see another list? yes/no");
			yesNoContinue = scnr.next();
			yesNoContinue(yesNoContinue);
			
		}  else if (choice.toLowerCase().equals("musical")) {
			//ArrayList<String> musical = new ArrayList<>();
			
			displayCategoryMovies(movieFlicks, "musical");
			
			System.out.println("Would you like to see another list? yes/no");
			yesNoContinue = scnr.next();
			yesNoContinue(yesNoContinue);
			
		}  else if (choice.toLowerCase().equals("scifi")) {
			//ArrayList<String> scifi = new ArrayList<>();
			
			displayCategoryMovies(movieFlicks, "scifi");
			
			System.out.println("Would you like to see another list? yes/no");
			yesNoContinue = scnr.next();
			yesNoContinue(yesNoContinue);
			
		} else {
			System.out.println("Sorry we don't have that option, please try again.");
		}
	} while (yesNoContinue(yesNoContinue) == true);
	
	System.out.println("Goodbye.");
		
	scnr.close();
	}

	private static void displayCategoryMovies(ArrayList<Movie> movieFlicks, String category) {
		for (Movie m : movieFlicks) {
			if(m.getCategory().equalsIgnoreCase(category)) {
			//System.out.println(m.getCategory());
			System.out.println(m.getTitle());}
		}
	}

	public static boolean yesNoContinue(String yesNoContinue) {
		boolean continueMore;
		if (yesNoContinue.toLowerCase().equals("yes")) {
			continueMore = true;
			return continueMore;
		} else {
			continueMore = false;
			return continueMore;
		}
	}
	
}
