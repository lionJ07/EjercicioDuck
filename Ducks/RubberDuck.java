package Ducks;
import Fly.*;
import Quack.*;

public class RubberDuck extends duck {
    public RubberDuck() {
        flyBehavior = new NoFly();  
        quackBehavior = new Squake(); 
    }

    public void display() {
        System.out.println("Soy un Pato de Goma!");
    }
}
