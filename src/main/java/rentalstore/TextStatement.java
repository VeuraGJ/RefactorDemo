package rentalstore;

public class TextStatement extends Statement {

    @Override
    public String headerStr(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String detailStr(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getAmount()) + "\n";
    }

    @Override
    public String footerStr(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalAmount()) + "\n"
                + "You earned " + String.valueOf(customer.getFrequentRenterPoints()) + " frequent renter points";

    }
}
