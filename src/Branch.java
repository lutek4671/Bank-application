import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(Customer customer : customers){
            if(customer.getName().equals(customerName))
                return customer;
        }
        return null;
    }

    public boolean addTransaction(String customerName, double transactionValue){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transactionValue);
            return true;
        }
        return false;
    }


}
