package designpatterns;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void swim() {
        System.out.println("Duck is swimming");
    }

    //to perform fly
    public void performFly() {
        flyBehavior.fly();
    }

    //to perform quack
    public void performQuack() {
        quackBehavior.quack();
    }
}
