package allduck;

import duck.Duck;
import property.FlyNoWay;
import property.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
	      QuackBe = new Quack();
	      FlyBe = new FlyNoWay();
	   }
}