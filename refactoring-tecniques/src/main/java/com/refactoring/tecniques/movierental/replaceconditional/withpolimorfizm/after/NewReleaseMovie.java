package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title,Movie.NEW_RELEASE);
    }

    // determine amounts for each line
    @Override
    double determineAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int determineFrequentRenterPoints(int daysRented) {
        return  daysRented>1 ?2:1;
    }
}
