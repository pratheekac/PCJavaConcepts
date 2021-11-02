package designpatterns;

public class CityDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Duck in skirrrt...");
    }

    public CityDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
