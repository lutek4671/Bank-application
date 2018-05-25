import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initValue) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(initValue);
    }

    public void addTransaction(Double value){
        transactions.add(value);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
