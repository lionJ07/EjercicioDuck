package ducks;
import Fly.FlyBehavior;
import Quack.QuackBehavior;

public abstract class duck {
 FlyBehavior flyBehavior;
 QuackBehavior quackBehavior;
public duck() {

}
public abstract void display();
public void performFly(){
    flyBehavior.fly();
}
public void performQuack(){
    quackBehavior.quack();
}
public void swim(){
    System.out.println("All ducks float, even decoys!");
}
}