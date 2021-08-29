package com.greatlearning.model;
import com.greatlearning.model.employee.Employee;
import com.greatlearning.model.service.CredentialServices;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Manushri", "Sharma");
        CredentialServices cs = new CredentialServices();

        System.out.println("Please enter Department from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner in = new Scanner(System.in);

        int choose = in.nextInt();
        in.close();

        switch (choose) {
            case 1:
                cs.showCredentials(employee);
                System.out.println("Email --> " + cs.generateEmailAddress(employee.getFirstname(), employee.getLastname(), "Technical"));
                System.out.println("Password --> " + cs.generatePassword(10));
                break;

            case 2:
                cs.showCredentials(employee);
                System.out.println("Email --> " + cs.generateEmailAddress(employee.getFirstname(), employee.getLastname(), "Admin"));
                System.out.println("Password --> " + cs.generatePassword(10));
                break;

            case 3:
                cs.showCredentials(employee);
                System.out.println("Email --> " + cs.generateEmailAddress(employee.getFirstname(), employee.getLastname(), "HumanResource"));
                System.out.println("Password --> " + cs.generatePassword(10));
                break;

            case 4:
                cs.showCredentials(employee);
                System.out.println("Email --> " + cs.generateEmailAddress(employee.getFirstname(), employee.getLastname(), "Legal"));
                System.out.println("Password --> " + cs.generatePassword(10));
                break;

            default:
                System.out.println("Check The Input Provided");
        }

    }
}