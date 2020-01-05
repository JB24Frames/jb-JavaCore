package com.corejava;

public class MyBike extends Bicycle {
	
	 static int myBikeType = 10;
	 static int mySpeed = 120;
	 static int myGear = 6;
	 public static void main (String args[]) {
		 Bicycle myBike = new Bicycle();
		 myBike.changeCadence(myBikeType);
		 myBike.changeGear(myGear);
		 myBike.speedUp(mySpeed);
		 myBike.applyBrakes(mySpeed);
		 myBike.printStates();
	 }

}
