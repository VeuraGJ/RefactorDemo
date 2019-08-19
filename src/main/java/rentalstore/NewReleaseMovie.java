package rentalstore;

public class NewReleaseMovie extends Movie {
    public static final double PRICE_OF_EACH_DAY = 3;
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double calculatePrice(int day) {
        return day * PRICE_OF_EACH_DAY;
    }
}
