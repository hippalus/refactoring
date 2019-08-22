package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Customer {

    private List<Rental> rentals;
    private String name;
    private double totalAmount;
    private int frequentRenterPoints;

    public Customer(String _name) {
        this.name = _name;
        rentals = new ArrayList<Rental>();
    }

	private void clearTotal() {
		totalAmount = 0;
		frequentRenterPoints = 0;
	}
    public String statement() {
        clearTotal();
		return  getHeader() + rentalLines() + getFooter();

    }


    private String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    private String rentalLines() {
        StringBuilder rentalLines = new StringBuilder();
        for (Rental rental : getRentals()) {
			rentalLines.append(rentalLine(rental));
		}
        return rentalLines.toString();
    }

	private String rentalLine( Rental rental) {
		this.totalAmount +=  rental.determineAmount();
		this.frequentRenterPoints+= rental.determineFrequentRenterPoints();
		return formatRentalLine(rental);
	}

	private String formatRentalLine(Rental rental) {

		return String.format("\t%s\t%s\n", rental.getMovie().getTitle(), this.totalAmount);
	}

	private String getFooter() {
        return String.format("Amount owed is %s\nYou earned %d frequent renter points", totalAmount, frequentRenterPoints);
    }



    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(Vector rentals) {
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getTotal() {
        return this.totalAmount;
    }

    public int getFrequentRenterPoints() {
        return this.frequentRenterPoints;
    }
}
