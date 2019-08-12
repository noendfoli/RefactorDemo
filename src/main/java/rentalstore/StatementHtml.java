package rentalstore;

public class StatementHtml extends Statement{
    @Override
    protected String getStatementHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String getEachLine(String result, Rental each) {
        result += each.getMovie().getTitle() + ": " + each.getThisAmount() + "<BR>\n";
        return result;
    }

    @Override
    protected String addFooter(Customer customer, String result) {
        result += "<P>You owe<EM>" + customer.getTotalAmount() + "</EM><P>\n";
        result += "On this rental you earned <EM>" + customer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
        return result;
    }
}
