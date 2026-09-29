public class Bank {

    private customer[] customers;
    private int numberOfCustomers = 0;

    public Bank() {
        customers = new customer[10];
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new customer(f, l);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public customer getCustomer(int index) {
        return customers[index];
    }
}