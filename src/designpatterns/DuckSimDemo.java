package designpatterns;

public class DuckSimDemo {

    public static void main(String[] args) {

        CityDuck cityDuck = new CityDuck();
        cityDuck.display();
        cityDuck.swim();
        cityDuck.performFly();
        cityDuck.performQuack();

        System.out.println("................................");

        Duck villageDuck = new VillageDuck();
        villageDuck.display();
        villageDuck.performFly();
        villageDuck.performQuack();


    }
}
