package Ducks;
import Fly.*;
import Quack.*;

public class MallardDuck extends duck {
    public MallardDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un Pato Mallard!");
    }
}
