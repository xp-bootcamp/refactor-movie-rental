package cn.xpbootcamp.refactor;

import cn.xpbootcamp.refactor.movie.Movie;

public class Rental {

    private final Movie movie;
    private final int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    public double amountFor() {
        return movie.amountBill(daysRented);
    }

    public StringBuilder buildRow() {
        StringBuilder result = new StringBuilder();
        result.append("\t")
                .append(getMovie().getName())
                .append("\t")
                .append(amountFor()).append("\n");
        return result;
    }

    public int countPoints() {
        return movie.countPoint(daysRented);
    }
}
