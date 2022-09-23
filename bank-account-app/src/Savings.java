public class Savings extends Account{

    // List properties specific to Savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to intialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        setSafeDepositBox();
    }

    @Override
    public void setRate() {
        rate= getBaseRate() - 0.25;
    }

    private void setSafeDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " +safetyDepositBoxKey
        );
    }
}
