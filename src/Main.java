public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("mBank");

        bank.addBranch("mBank Rzeszow");

        bank.addCustomer("mBank Rzeszow", "Bill", 19.99);
        bank.addCustomer("mBank Rzeszow", "John", 29.99);
        bank.addCustomer("mBank Rzeszow", "Steve", 39.99);

        bank.addBranch("mBank Katowice");
        bank.addCustomer("mBank Katowice", "Bob", 69.99);

        bank.addCustomerTransaction("mBank Rzeszow", "Bill", 178.34);
        bank.addCustomerTransaction("mBank Rzeszow", "Bill", 184.22);
        bank.addCustomerTransaction("mBank Rzeszow", "Steve", 13.34);
        bank.addCustomerTransaction("mBank Katowice", "Bob", 174.21);

        bank.showCustomers("mBank Rzeszow", true);

        bank.addCustomer("Rotlf", "Johnny", 566.32);

        bank.addBranch("mBank Rzeszow");

        bank.addCustomerTransaction("mBank Rzeszow", "Hehs", 10.0);

        bank.addCustomer("mBank Rzeszow", "Steve", 39.99);
    }
}
