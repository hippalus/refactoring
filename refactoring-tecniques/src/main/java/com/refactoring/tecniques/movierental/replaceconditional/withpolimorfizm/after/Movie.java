package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

public abstract class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private int priceCode;
	private String title;
	

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}
	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

    // determine amounts for each line
	abstract double determineAmount(int daysRented);

	abstract int determineFrequentRenterPoints(int daysRented);
}
