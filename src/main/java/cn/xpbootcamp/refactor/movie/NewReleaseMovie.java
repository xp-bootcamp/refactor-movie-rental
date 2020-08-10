package cn.xpbootcamp.refactor.movie;

public class NewReleaseMovie extends Movie {
    NewReleaseMovie(String name) {
        super(name);
    }

    @Override
    public double amountBill(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int countPoint(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
