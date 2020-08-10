package cn.xpbootcamp.refactor;

public abstract class Movie {

    private final String name;
    private final MovieType type;

    Movie(String name, MovieType type) {
        this.name = name;
        this.type = type;
    }

    public static Movie createCampusMovie(String name) {
        return new CampusMovie(name, MovieType.CAMPUS);
    }

    public static Movie createNewReleaseMovie(String name) {
        return new NewReleaseMovie(name, MovieType.NEW_RELEASE);
    }

    public static Movie createHistoryMovie(String name) {
        return new HistoryMovie(name, MovieType.HISTORY);
    }

    MovieType getType() {
        return type;
    }

    String getName() {
        return name;
    }

    public abstract double amountBill(int daysRented);
}
