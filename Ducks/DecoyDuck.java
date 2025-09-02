package Ducks;
import Fly.*;
import Quack.*;

public class DecoyDuck extends duck {
    public DecoyDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new NoQuack();
    }

    public void display() {
        System.out.println("Soy un Pato de Madera!");
    }
}

