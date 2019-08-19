package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_1_and_priceCode_is_NEW_RELEASE(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new NewReleaseMovie("tinatio",Movie.NEW_RELEASE),1));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t3.0\n"+"Amount owed is 3.0\n"
                +"You earned 1 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_2_and_priceCode_is_NEW_RELEASE(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new NewReleaseMovie("tinatio",Movie.NEW_RELEASE),2));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t6.0\n"+"Amount owed is 6.0\n"
                        +"You earned 2 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_2_and_priceCode_is_REGULAR(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new RegularMovie("tinatio",Movie.REGULAR),2));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t2.0\n"+"Amount owed is 2.0\n"
                        +"You earned 1 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_3_and_priceCode_is_REGULAR(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new RegularMovie("tinatio",Movie.REGULAR),3));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t3.5\n"+"Amount owed is 3.5\n"
                        +"You earned 1 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_3_and_priceCode_is_CHILDRENS(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new ChildrenMovie("tinatio",Movie.CHILDRENS),3));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t1.5\n"+"Amount owed is 1.5\n"
                        +"You earned 1 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_give_a_movie_when_dayRented_is_4_and_priceCode_is_CHILDRENS(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());
        customer.addRental(new Rental(new ChildrenMovie("tinatio",Movie.CHILDRENS),4));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n\ttinatio"+"\t3.0\n"+"Amount owed is 3.0\n"
                        +"You earned 1 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_record_for_Jerry_when_without_movie(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new TextStatement());

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("Rental Record for "+customer.getName()+"\n"+"Amount owed is 0.0\n"
                        +"You earned 0 frequent renter points"
                ,statement);
    }
    @Test
    public void should_return_html_record_for_Jerry_when_give_a_movie_when_dayRented_is_1_and_priceCode_is_NEW_RELEASE(){
        //given
        Customer customer = new Customer("Jerry");
        customer.setStatement(new HtmlStatement());
        customer.addRental(new Rental(new NewReleaseMovie("tinatio",Movie.NEW_RELEASE),1));

        //when
        String statement = customer.statement();

        //then
        Assert.assertEquals("<H1>Rental Record for <EM>"+customer.getName()+"</EM></H1><P>tinatio"+"\t3.0<BR>"
                        +"<H1>Amount owed is <EM>3.0</EM></H1><P>"
                        +"<H1>You earned <EM>1</EM> frequent renter points</H1>"
                ,statement);
    }
}