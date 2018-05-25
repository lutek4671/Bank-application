import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
        System.out.println("Created a bank: " + name);
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch: " + branchName + " added to: " + name);

            return true;
        }
        System.out.println("Branch " + branchName + " already exists.");
        return false;
    }

    public Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName))
                return branch;
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if(customer != null){
                System.out.println("Customer " + customer.getName() + " already exists.");
                return false;
            }
            System.out.println("Customer: " + customerName + " added to branch: " + branchName + ".");
            branch.addCustomer(customerName, initialAmount);
            return true;
        }
        System.out.println("Branch " + branchName + " doesn't exists.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer != null) {
                customer.addTransaction(transactionAmount);
                System.out.println("Transaction is added successfully.");
                return true;
            }
            System.out.println("Can't find " + customerName + " customer.");
            return false;
        }
        System.out.println("Can't find " + branchName + " branch.");
        return false;
    }

    public boolean showCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("\nCustomers details for branch: " + branch.getName());

            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer name: " + customer.getName());
                if (showTransactions)
                    System.out.println("Transactions: " + customer.getTransactions().toString() + "\n");
            }
            return true;
        }
        return false;
    }
}
