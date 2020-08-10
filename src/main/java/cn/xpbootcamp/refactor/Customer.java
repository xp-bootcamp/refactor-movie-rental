package cn.xpbootcamp.refactor;

import java.util.ArrayList;
import java.util.List;

import static cn.xpbootcamp.refactor.MovieType.*;

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
            renterPoints = countPoints(renterPoints, rental);
            double thisAmount = amountFor(rental);
            result.append(buildRow(rental, thisAmount));
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

    private StringBuilder buildRow(Rental rental, double thisAmount) {
        StringBuilder result = new StringBuilder();
        result.append("\t")
                .append(rental.getMovie().getName())
                .append("\t")
                .append(thisAmount).append("\n");
        return result;
    }

    private int countPoints(int frequentRenterPoints, Rental rental) {
        frequentRenterPoints++;
        if ((rental.getMovie().getType() == NEW_RELEASE) && rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private double amountFor(Rental rental) {
        double thisAmount = 0d;
        switch (rental.getMovie().getType()) {
            case HISTORY:
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case CAMPUS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

}
