package cn.xpbootcamp.refactor;

public class Movie {

    static final int HISTORY = 0;
    static final int NEW_RELEASE = 1;
    static final int CAMPUS = 2;

    private String title;
    private int movieType;

    Movie(String title, int movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    int getMovieType() {
        return movieType;
    }

    String getTitle() {
        return title;
    }
}
