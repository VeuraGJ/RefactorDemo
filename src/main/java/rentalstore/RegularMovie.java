package rentalstore;

public class RegularMovie extends Movie {
    public static final double PRICE_OF_EACH_DAY = 2;
    public static final int MAX_RENTED_DAY = 2;
    public static final double PRICE_OF_RATHER_MAX_RENTED_DAY = 1.5;
    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculatePrice(int day) {
        double price = PRICE_OF_EACH_DAY;
        if (day > MAX_RENTED_DAY) {
            price += (day - MAX_RENTED_DAY) * PRICE_OF_RATHER_MAX_RENTED_DAY;
        }
        return price;
    }
}
