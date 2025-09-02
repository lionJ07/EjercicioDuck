package Ducks;
import Fly.*;
import Quack.*;

public class RedHead extends duck {
    public RedHead() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un Pato de Cabeza Roja!");
    }
}
