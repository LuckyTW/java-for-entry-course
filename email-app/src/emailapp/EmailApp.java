package emailapp;

public class EmailApp {

    static String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";


    public static void main(String[] args) {
        Email email = new Email("Lucky", "Na");

        System.out.println(email.showInfo());

    }
}
