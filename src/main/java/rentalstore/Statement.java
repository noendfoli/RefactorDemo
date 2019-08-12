package rentalstore;

public abstract class Statement {
    public String statement(Customer customer) {
        String header = getStatementHeader(customer);
        for (Rental each : customer.getRentals()) {
            header = getEachLine(header, each);
        }
        String result = addFooter(customer,header);
        return result;
    }

    protected abstract String getStatementHeader(Customer customer);

    protected abstract String getEachLine(String result, Rental each);

    protected abstract String addFooter(Customer customer, String result);
}
