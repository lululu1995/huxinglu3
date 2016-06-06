package allduck;

import duck.Duck;
import property.FlyWithWings;
import property.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
	      QuackBe = new Squeak();
	      FlyBe = new FlyWithWings();
	   }
}