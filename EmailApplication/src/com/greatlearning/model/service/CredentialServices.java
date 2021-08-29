package com.greatlearning.model.service;
import com.greatlearning.model.employee.Employee;
import java.util.Scanner;
import java.util.Random;

public class CredentialServices {
    
    public static String generatePassword(int len)
    {
        String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()<>/";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++)
            sb.append(ch.charAt(rnd.nextInt(ch.length())));
        return sb.toString();
    }

    public String generateEmailAddress(String firstname, String lastname, String department) {
        String em =  firstname.toLowerCase() + lastname.toLowerCase() +  department + "@" + "." + "company.com";
        return em;
    }

    public void showCredentials(Employee employee)
    {
        System.out.println("Dear "+ employee.getFirstname()+" your generated credentials are as follows");
    }
}
