package rentalstore;

public class HtmlStatement extends Statement {
    @Override
    public String headerStr(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>";
    }

    @Override
    public String detailStr(Rental rental) {
        return  rental.getMovie().getTitle()+ "\t" + String.valueOf(rental.getAmount()) + "<BR>";
    }

    @Override
    public String footerStr(Customer customer) {
        String result = "<H1>Amount owed is <EM>" + String.valueOf(customer.getTotalAmount()) + "</EM></H1><P>";
        result += "<H1>You earned <EM>" + String.valueOf(customer.getFrequentRenterPoints()) + "</EM> frequent renter points</H1>";
        return result;
    }
}
