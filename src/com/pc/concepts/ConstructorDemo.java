package com.pc.concepts;

/**
 * Constructor is a member method
 * It has same name as class name
 * It will never return anything
 * It will be used to allocate memory
 *
 */
public class ConstructorDemo {

    String name;
    int rollNo;

    public ConstructorDemo() {
        name = "Pratheeka";
        rollNo = 123;
        System.out.println("inside default constructor");
    }


}

class ContructorMain
{

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
        System.out.println(demo.rollNo+demo.name);
    }

        }
