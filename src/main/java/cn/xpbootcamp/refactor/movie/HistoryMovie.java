package cn.xpbootcamp.refactor.movie;

public class HistoryMovie extends Movie {
    HistoryMovie(String name) {
        super(name);
    }

    public double amountBill(int daysRented) {
        int actualAmount = 2;
        return daysRented > 2 ? actualAmount + (daysRented - 2) * 1.5 : actualAmount;
    }

    @Override
    public int countPoint(int daysRented) {
        return 1;
    }
}
