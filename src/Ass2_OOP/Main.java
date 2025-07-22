package Ass2_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Please enter the number of employees");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Please enter the role of employee (chef/waiter)");
            String role = sc.next();

            System.out.println("Please enter the name of the employee ");
            String name = sc.next();

            System.out.println("Please enter the age of the employee ");
            int age = sc.nextInt();

            System.out.println("Please enter the salary of the employee ");
            double salary = sc.nextDouble();

            System.out.println("-------------------------------------------------------------");
            if(role.equals("chef")){
                employees.add(new Chef(name,age,salary,role));


            } else if (role.equals("waiter")) {
                employees.add(new Waiter(name,age,salary,role));

            }


        }

        System.out.println("Employees list");
        System.out.println("-------------------------");
        for(Employee e:employees){
            e.introduce();
            e.work();
            System.out.println("------------------------------------");
        }
    }
}