package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();
    private Statement statement;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    public double getTotalAmount(){
        return rentals.stream().mapToDouble(Rental::getAmount).sum();
    }

    public double getFrequentRenterPoints() {
        double frequentRenterPoints = 0;
        for(Rental each : rentals) {
            if (each.getMovie().getPriceCode() == Movie.LITERARY) {
                frequentRenterPoints = 1.5;
            }
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }
    public String statement() {
        return statement.generateStatement(this);
    }
}
