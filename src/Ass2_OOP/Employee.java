package Ass2_OOP;

public class Employee extends Person {
    private  double salary;
    private String role;

    public Employee(String name, int age, double salary, String role) {
        super(name,age);
        if(salary>0) {
            this.salary = salary;
        }
        this.role = role;
    }



    public String getRole() {
        return role;
    }

    public void work() {
        System.out.println("Employee :" +getName() +"is working as" +getRole());
    }


}
