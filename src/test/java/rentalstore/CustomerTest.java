package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer = new Customer("Owen");

    @Test
    public void should_return_correct_statement_given_customer_has_no_rental() {
        String statement = customer.statement();
        assertEquals("Rental Record for Owen\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_regular_movie_for_1_day() {
        Movie movie = new RegularMovie("Star War",0);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_regular_movie_for_2_day() {
        Movie movie = new RegularMovie("Star War",0);
        Rental rental = new Rental(movie,2);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_regular_movie_for_3_day() {
        Movie movie = new RegularMovie("Star War",0);
        Rental rental = new Rental(movie,3);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);

    }
    @Test
    public void should_return_correct_statemnet_given_customer_has_one_new_release_movie_for_1_day() {
        Movie movie = new NewReleaseMovie("Star War",1);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_new_release_movie_for_2_day() {
        Movie movie = new NewReleaseMovie("Star War",1);
        Rental rental = new Rental(movie,2);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_childrens_movie_for_1_day() {
        Movie movie = new ChildrensMovie("Star War",2);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_childrens_movie_for_2_day() {
        Movie movie = new ChildrensMovie("Star War",2);
        Rental rental = new Rental(movie,2);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_statemnet_given_customer_has_one_childrens_movie_for_4_day() {
        Movie movie = new ChildrensMovie("Star War",2);
        Rental rental = new Rental(movie,4);
        customer.addRental(rental);

        String statement = customer.statement();

        assertEquals("Rental Record for Owen\n" +
                "\t" + movie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);

    }

    @Test
    public void should_return_correct_html_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie movie = new ChildrensMovie("Star war", 2);
        Rental rental = new Rental(movie, 4);
        customer.addRental(rental);

        String statement = customer.statementHtml();

        System.out.println(statement);

        assertEquals("<H1>Rentals for <EM>Owen</EM></H1><P>\n" +
                "Star war: 3.0<BR>\n" +
                "<P>You owe<EM>3.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }
}