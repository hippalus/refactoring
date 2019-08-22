package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

public class Rental {

	private int daysRented;
	Movie movie;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	public int getDaysRented() {
		return daysRented;
	}
	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	 double determineAmount()
    {
       return movie.determineAmount(this.getDaysRented());
    }

     int determineFrequentRenterPoints(){
	    return movie.determineFrequentRenterPoints(this.getDaysRented());
     }

}
