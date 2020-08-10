package cn.xpbootcamp.refactor.movie;

public abstract class Movie {

    private final String name;

    Movie(String name) {
        this.name = name;
    }

    public static Movie createCampusMovie(String name) {
        return new CampusMovie(name);
    }

    public static Movie createNewReleaseMovie(String name) {
        return new NewReleaseMovie(name);
    }

    public static Movie createHistoryMovie(String name) {
        return new HistoryMovie(name);
    }

    public String getName() {
        return name;
    }

    public abstract double amountBill(int daysRented);

    public abstract int countPoint(int daysRented);
}
