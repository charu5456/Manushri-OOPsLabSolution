package com.greatlearning.model.employee;
import com.greatlearning.model.service.CredentialServices;
import com.greatlearning.model.Main;

public class Employee {
    private String firstname, lastname, department;

    public Employee(String firstname, String lastname)
    {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }
}
