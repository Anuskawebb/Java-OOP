public class Employee {
   
    private String name;
    private String grade;

  
    public Employee(String name) {
        this.name = name;
    }


    public double netSalary(double salary, double tax) {
        double netSalary = salary - (salary * (tax / 100));
        return netSalary;
    }

    
    public void setGrade(String grade) {
        this.grade = grade;
    }


    public String getGrade() {
        return grade;
    }


    public String getName() {
        return name;
    }

 
    public static void main(String[] args) {
        
        Employee employee = new Employee("Mousumi Sarkar");

        employee.setGrade("A");

        
        double salary = 5000;
        double tax = 20; 
        double netSalary = employee.netSalary(salary, tax);

        // Output the results
        System.out.printf("Employee Name: %s%n", employee.getName());
        System.out.printf("Employee Grade: %s%n", employee.getGrade());
        System.out.printf("Net Salary after %.2f%% tax: %.2f%n", tax, netSalary);
    }
}
