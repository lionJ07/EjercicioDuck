import Ducks.*;
import Fly.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulador de Patos ===\n");

        duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-----");

        duck red = new RedHead();
        red.display();
        red.performQuack();
        red.performFly();
        System.out.println("-----");

        duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        System.out.println("-----");

        duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        System.out.println("-----");

        System.out.println("\n--- Cambiando comportamiento del DecoyDuck ---");
        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
    }
}

//para ejecutarlo: java -cp bin Main

