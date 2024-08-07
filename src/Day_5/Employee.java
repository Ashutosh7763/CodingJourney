package Day_5;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    String name,salary;
    LocalDate hire_date;
    Employee(String name,String salary,LocalDate hire_date){
        this.name=name;
        this.salary=salary;
        this.hire_date=hire_date;
    }
    void printDetails(){
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Hire date:" + hire_date);
    }

    int  yearOfServices(){
        return Period.between(hire_date,LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("Ashutosh","25000",LocalDate.parse("2022-07-01"));

        emp1.printDetails();
        System.out.println("Year of services:" + emp1.yearOfServices());
    }
}

