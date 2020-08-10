package cn.xpbootcamp.refactor;

public class CampusMovie extends Movie {
    CampusMovie(String name, MovieType type) {
        super(name, type);
    }

    public double amountBill(int daysRented) {
        double actualAmount = 1.5;
        return daysRented > 3 ? actualAmount + (daysRented - 3) * 1.5 : actualAmount;

    }
}
