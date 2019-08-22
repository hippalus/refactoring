package com.refactoring.tecniques.movierental.replaceconditional.withpolimorfizm.after;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title ) {
        super(title,Movie.CHILDRENS);
    }

    // determine amounts for each line
    @Override
    double determineAmount(int daysRented) {
        double thisAmount = 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }

    @Override
    int determineFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
