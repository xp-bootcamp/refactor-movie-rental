package cn.xpbootcamp.refactor;

public class Movie {

    private final String name;
    private final MovieType type;

    Movie(String name, MovieType type) {
        this.name = name;
        this.type = type;
    }

    MovieType getType() {
        return type;
    }

    String getName() {
        return name;
    }
}
