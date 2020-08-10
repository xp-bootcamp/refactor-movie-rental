package cn.xpbootcamp.refactor;

public class HistoryMovie extends Movie {
    HistoryMovie(String name, MovieType type) {
        super(name, type);
    }

    public double amountBill(int daysRented) {
        int actualAmount = 2;
        return daysRented > 2 ? actualAmount + (daysRented - 2) * 1.5 : actualAmount;
    }
}
