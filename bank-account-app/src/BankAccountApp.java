public class BankAccountApp {
    public static void main(String[] args) {

        Checking checking1 = new Checking("Lucky Na", "321456789", 1500);
        Savings savings1 = new Savings("Taewoong", "454468394", 2500);

        checking1.showInfo();
        System.out.println("*****************************");
        savings1.showInfo();

        savings1.deposit(5000);
        savings1.withdraw(500);
        savings1.transfer("Brokerage", 3000);

        // Read a CSV file then create new accounts based on that data

    }
}
