package cn.xpbootcamp.refactor;

public class Rental {

    Movie movie;
    private int daysRented;
    private double rentalAmount;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getRentalAmount() {
        return rentalAmount;
    }

    void calculateRentalAmount() {
        switch (movie.getMovieType()) {
            case Movie.HISTORY:
                rentalAmount += 2;
                if (daysRented > 2)
                    rentalAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                rentalAmount += daysRented * 3;
                break;
            case Movie.CAMPUS:
                rentalAmount += 1.5;
                if (daysRented > 3)
                    rentalAmount += (daysRented - 3) * 1.5;
                break;
        }
    }

    int addFrequentRenterPoint(int frequentRenterPoints) {
        frequentRenterPoints++;
        if ((movie.getMovieType() == Movie.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    void addRentalFigure(StringBuilder statementResult) {
        statementResult.append("\t")
              .append(movie.getMovieTitle())
              .append("\t")
              .append(rentalAmount).append("\n");
    }

    void buildRentalAmount(StringBuilder statementResult) {
        calculateRentalAmount();
        addRentalFigure(statementResult);
    }
}
