package compareable.sorts.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrate the use of compareable interface which is used to 
 * sort collection obj.
 * It contains compareTo method {public int compareTo(Object o)}
 * 
 * @author abulshai
 *
 */
public class MainApp {
	public static void main(String...strings) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("Surgical Strike",2019,8.5));
		movieList.add(new Movie("Sanju",2018,5));
		movieList.add(new Movie("Total Dhamal",2020,5));
		movieList.add(new Movie("Dhoom",2005,6));
		Collections.sort(movieList);
		//System.out.println(movieList);
		for(Movie movie : movieList) {
			System.out.println("Name : "+movie.getMovieName()+"\tYear"+movie.getYear()+"\t"+movie.getRating());
		}
		
	}

}
