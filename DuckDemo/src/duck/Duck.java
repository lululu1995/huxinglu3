package duck;

import property.FlyBe;
import property.QuackBe;

public abstract  class Duck {
	public static QuackBe QuackBe;
	public static FlyBe FlyBe;

	public static void swim() {}public static void display() {}
	public void performQuack() {
		QuackBe.quack();
	}
	public void performFly() {
		FlyBe.fly();
	}
	public void setQuackBe(QuackBe quiack) {
	      this.QuackBe = quiack;
	   }
	public void setFlyBe(FlyBe fly) {
	      this.FlyBe = fly;
	   }

	
}