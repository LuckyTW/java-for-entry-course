import java.util.LinkedList;
import java.util.List;


public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();


        /*
         *        Checking checking1 = new Checking("Lucky Na", "321456789", 1500);
         *         Savings savings1 = new Savings("Taewoong", "454468394", 2500);
         *
         *         savings1.compound();
         *
         *         savings1.showInfo();
         *         System.out.println("*****************************");
         *         checking1.showInfo();
         */


//        savings1.deposit(5000);
//        savings1.withdraw(500);
//        savings1.transfer("Brokerage", 3000);


        // Read a CSV file then create new accounts based on that data
        String file = "/Users/luckytw/Desktop/java-for-entrycourse/NewBankAccounts.csv";

        List<String[]> newAccountHolder = utility.CSV.read(file);

        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);

            if(accountType.equals("Savings")) {
//                System.out.println("Open a Savings Account");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if(accountType.equals("Checking")) {
//                System.out.println("Open a Checking Account");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error Reading Account Type");
            }
        }

//        accounts.get(5).showInfo();

        for (Account account : accounts) {
            System.out.println("\n***********************\n");
            account.showInfo();
        }
    }
}
