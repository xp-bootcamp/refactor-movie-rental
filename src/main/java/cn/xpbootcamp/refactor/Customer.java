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
        return "Rental Record for " + getName() + "：\n" +
                generateReceiptBody() +
                generateReceiptFooter(calculateTotalAmount(), calculateTotalPoints());
    }

    private StringBuilder generateReceiptBody() {
        StringBuilder result = new StringBuilder();
        return rentals.stream().map(Rental::buildRow).reduce(result, StringBuilder::append);
    }

    private int calculateTotalPoints() {
        return rentals.stream().mapToInt(Rental::countPoints).sum();
    }

    private double calculateTotalAmount() {
        return rentals.stream().mapToDouble(Rental::amountFor).sum();
    }

    private StringBuilder generateReceiptFooter(double totalAmount, int frequentRenterPoints) {
        StringBuilder result = new StringBuilder();
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return result;
    }

}
