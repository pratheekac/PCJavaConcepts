package designpatterns;

public class VillageDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Duck in Sareeee ");
    }

    public VillageDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
