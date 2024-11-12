// Superclass Employee
class Employee {
    // Employee details
    int empCode;
    String empName;
    String address;
    String phoneNo;
    
    // Fixed allowances
    double da = 0.10; // 10% of basic pay
    double hra = 0.20; // 20% of basic pay

    // Constructor to initialize employee details
    public Employee(int empCode, String empName, String address, String phoneNo) {
        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.phoneNo = phoneNo;
    }
}

// Subclass Manager
class Manager extends Employee {
    double basicPay;

    // Constructor to initialize manager details
    public Manager(int empCode, String empName, String address, String phoneNo, double basicPay) {
        super(empCode, empName, address, phoneNo);  // Call to superclass constructor
        this.basicPay = basicPay;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return basicPay + (basicPay * da) + (basicPay * hra);
    }
}

// Subclass Typist
class Typist extends Employee {
    double basicPay;

    // Constructor to initialize typist details
    public Typist(int empCode, String empName, String address, String phoneNo, double basicPay) {
        super(empCode, empName, address, phoneNo);  // Call to superclass constructor
        this.basicPay = basicPay;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return basicPay + (basicPay * da) + (basicPay * hra);
    }
}

// Subclass Officer
class Officer extends Employee {
    double basicPay;

    // Constructor to initialize officer details
    public Officer(int empCode, String empName, String address, String phoneNo, double basicPay) {
        super(empCode, empName, address, phoneNo);  // Call to superclass constructor
        this.basicPay = basicPay;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return basicPay + (basicPay * da) + (basicPay * hra);
    }
}

public class OfficeDatabase {
    public static void main(String[] args) {
        // Create instances of Manager, Typist, and Officer
        Manager manager = new Manager(101, "John Doe", "123 Street, City", "1234567890", 50000);
        Typist typist = new Typist(102, "Jane Smith", "456 Avenue, City", "0987654321", 25000);
        Officer officer = new Officer(103, "James Brown", "789 Road, City", "1122334455", 30000);

        // Print salary details
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Typist Salary: " + typist.calculateSalary());
        System.out.println("Officer Salary: " + officer.calculateSalary());
    }
}
