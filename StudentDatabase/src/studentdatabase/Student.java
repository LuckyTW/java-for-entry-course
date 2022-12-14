package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor: prompt user to enter student's name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();

//        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

    }

    // generate an ID
    private void setStudentId() {
        //Grade level + ID
        id++;
        this.studentId =  gradeYear + "" + id;
    }

    // enroll in courses 코스에 등록하기
    public void enroll() {
        //Get inside a loop, user hits 0

        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);


        System.out.println("ENROLLED IN: " + courses);
//        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }


    // pay tuition
    public void payTuition( ) {
        System.out.println("TUITION BALANCE: " + tuitionBalance);

        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }

}
