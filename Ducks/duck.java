package Ducks;
import Fly.FlyBehavior;
import Quack.QuackBehavior;

public abstract class duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Todos los patos flotan, incluso los de madera!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
