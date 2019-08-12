package rentalstore;

public class TextStatement extends Statement {
    @Override
    protected String getStatementHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    protected String getEachLine(String result, Rental each) {
        result += "\t" + each.getMovie().getTitle() + "\t" + each.getThisAmount() + "\n";
        return result;
    }

    @Override
    protected String addFooter(Customer customer, String result) {
        result += "Amount owed is " + customer.getTotalAmount() + "\n";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }
}
