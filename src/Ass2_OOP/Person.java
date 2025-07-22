package Ass2_OOP;

public class Person {
    private String name ;
    private int age ;

    public  Person(String name, int age) {
        if(name.length()>=3){
            this.name = name;
        }
        if(age>0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
    }


}
