package cn.xpbootcamp.refactor;

public class Movie {

    static final int HISTORY = 0;
    static final int NEW_RELEASE = 1;
    static final int CAMPUS = 2;

    private String movieTitle;
    private int movieType;

    Movie(String movieTitle, int movieType) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
    }

    int getMovieType() {
        return movieType;
    }

    String getMovieTitle() {
        return movieTitle;
    }
}
