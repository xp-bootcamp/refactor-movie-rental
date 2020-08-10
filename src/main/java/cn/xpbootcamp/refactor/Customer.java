package cn.xpbootcamp.refactor;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    String stateReceipt() {
        double totalAmount = 0d;
        int renterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "：\n");
        for (Rental rental : rentals) {
            renterPoints += rental.countPoints();
            double thisAmount = rental.amountFor();
            result.append(rental.buildRow());
            totalAmount += thisAmount;
        }
        result.append(buildReceiptFooter(totalAmount, renterPoints));
        return result.toString();
    }

    private StringBuilder buildReceiptFooter(double totalAmount, int frequentRenterPoints) {
        StringBuilder result = new StringBuilder();
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result;
    }

}
