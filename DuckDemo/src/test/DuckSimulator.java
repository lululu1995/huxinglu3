package test;

import allduck.MallardDuck;
import duck.Duck;
import property.Squeak;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
	      mallard.performQuack();
	      mallard.performFly();
	      mallard.setQuackBe(new Squeak());
	      mallard.performQuack();
	   }
	}
