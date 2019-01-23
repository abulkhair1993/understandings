/**
 * 
 */
package compareable.sorts.demo;

/**
 * @author abulshai
 * @param <T>
 *
 */
public class Movie<T> implements Comparable<Movie> {
	private String movieName;
	private int year;
	private double rating;
	
	public Movie(String movieName,int year,double rating) {
		this.movieName = movieName;
		this.year = year;
		this.rating = rating;
	}
	
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	
	/**
	 * Default natural sorting order
	 * sort movie object on basis of year
	 * 
	 */
	public int compareTo(Movie objMovie) {
		return this.year - objMovie.year;
		
	}
	
	public String toString() {
		return "Movie name" +movieName +"\t Year"+year+"\t Rating"+rating; 
	}
}
