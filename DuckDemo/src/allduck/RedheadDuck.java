package allduck;

import duck.Duck;
import property.FlyWithRocket;
import property.MuteQuack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
	      QuackBe = new MuteQuack();
	      FlyBe = new FlyWithRocket();
	   }
}