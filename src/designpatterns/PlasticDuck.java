package designpatterns;

public class PlasticDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Yellow color duck...waste duck");
    }
    public PlasticDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }
}
