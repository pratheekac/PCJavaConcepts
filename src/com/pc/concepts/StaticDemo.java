package com.pc.concepts;

class Employee {
    String name;
    int salary;
    static String ceo; //same for all the object
    //can be called by class name directly

    static {
        ceo= "Pratheeka";  //static block will be loaded once, in class loader
    }

    public Employee(){
        name = "P";
        salary = 1000000; //can instanciate the instance variable, but not the static(can do it)
        //this constructor will be allocated memory in heap by creation of every object
    }

    public void show(){

        System.out.println(name+ salary +ceo);
    }
}
public class StaticDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "P";
        emp1.salary = 100000;

        Employee emp2 = new Employee();
        emp2.name = "C";
        emp2.salary = 100000;

    }
}
