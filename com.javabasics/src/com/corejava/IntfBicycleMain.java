package com.corejava;

public class IntfBicycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntfBicycleDemo bike1 = new IntfBicycleDemo();
		IntfBicycleDemo bike2 = new IntfBicycleDemo();
		bike1.printStates();
		bike2.printStates();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(20);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
//        bike2.printStates();
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike1.applyBrakes(24);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();



	}

}
