package cn.xpbootcamp.refactor;

public class NewReleaseMovie extends Movie {
    NewReleaseMovie(String name, MovieType type) {
        super(name, type);
    }

    @Override
    public double amountBill(int daysRented) {
        return daysRented * 3;
    }
}
