public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Putri", "Reinasantya");
        bank.addCustomer("Maharani", "Dewi");
        bank.addCustomer("Annisya", "Dinda");

        System.out.println("Jumlah customer: " + bank.getNumOfCustomers());

        customer customer1 = bank.getCustomer(0);

        System.out.println("\n===== CUSTOMER 1 =====");
        System.out.println("Nama: " + customer1.getFirstName() + " " + customer1.getLastName());
        account account1 = new account(1000000);
        customer1.setAccount(account1);
        System.out.println("Saldo awal: " + account1.getBalance());
        account1.deposit(500000);
        System.out.println("Setelah deposit: " + account1.getBalance());
        account1.withdraw(250000);
        System.out.println("Setelah withdraw: " + account1.getBalance());


        customer customer2 = bank.getCustomer(1);

        System.out.println("\n===== CUSTOMER 2 =====");
        System.out.println("Nama: " + customer2.getFirstName() + " " + customer2.getLastName());
        account account2 = new account(2000000);
        customer2.setAccount(account2);
        System.out.println("Saldo awal: " + account2.getBalance());
        account2.deposit(300000);
        System.out.println("Setelah deposit: " + account2.getBalance());
        account2.withdraw(500000);
        System.out.println("Setelah withdraw: " + account2.getBalance());


        customer customer3 = bank.getCustomer(2);

        System.out.println("\n===== CUSTOMER 3 =====");
        System.out.println("Nama: " + customer3.getFirstName() + " " + customer3.getLastName());
        account account3 = new account(1500000);
        customer3.setAccount(account3);
        System.out.println("Saldo awal: " + account3.getBalance());
        account3.deposit(750000);
        System.out.println("Setelah deposit: " + account3.getBalance());
        account3.withdraw(300000);
        System.out.println("Setelah withdraw: " + account3.getBalance());
    }
}