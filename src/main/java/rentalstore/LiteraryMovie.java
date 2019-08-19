package rentalstore;

public class LiteraryMovie extends Movie {
    public static final double PRICE_OF_EACH_DAY = 6;
    public LiteraryMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculatePrice(int day) {
        return day * PRICE_OF_EACH_DAY;
    }
}
