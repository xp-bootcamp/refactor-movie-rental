package cn.xpbootcamp.refactor.movie;

public class CampusMovie extends Movie {
    CampusMovie(String name) {
        super(name);
    }

    public double amountBill(int daysRented) {
        double actualAmount = 1.5;
        return daysRented > 3 ? actualAmount + (daysRented - 3) * 1.5 : actualAmount;

    }

    @Override
    public int countPoint(int daysRented) {
        return 1;
    }
}
