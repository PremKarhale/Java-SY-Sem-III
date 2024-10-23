package assignment5;

import java.util.Scanner;
//Interface Vehicle
interface Vehicle {
void changeGear(int gear);
void speedUp(int increment);
void applyBrakes(int decrement);
}
//Bicycle class implementing Vehicle
class Bicycle implements Vehicle {
private int gear;
private int speed;
public Bicycle() {
this.gear = 1; // Default gear
this.speed = 0; // Default speed
}
@Override
public void changeGear(int gear) {
if (gear > 0 && gear <= 6) { // Bicycles usually have 6 gears
this.gear = gear;
System.out.println("Bicycle gear changed to: " + this.gear);
} else {
System.out.println("Invalid gear for Bicycle. Please select between 1 and 6.");
}
}
@Override
public void speedUp(int increment) {
speed += increment;
System.out.println("Bicycle speed increased by " + increment + " km/h. Current speed: " + speed + " km/h.");
}
@Override
public void applyBrakes(int decrement) {
speed -= decrement;
if (speed < 0) speed = 0;
System.out.println("Bicycle speed decreased by " + decrement + " km/h. Current speed: " + speed + " km/h.");
}
}
//Bike class implementing Vehicle
class Bike implements Vehicle {
private int gear;
private int speed;
public Bike() {
this.gear = 1; // Default gear
this.speed = 0; // Default speed
}
@Override
public void changeGear(int gear) {
if (gear > 0 && gear <= 5) { // Bikes usually have 5 gears
this.gear = gear;
System.out.println("Bike gear changed to: " + this.gear);
} else {
System.out.println("Invalid gear for Bike. Please select between 1 and 5.");
}
}
@Override
public void speedUp(int increment) {
speed += increment;
System.out.println("Bike speed increased by " + increment + " km/h. Current speed: " + speed + " km/h.");
}
@Override
public void applyBrakes(int decrement) {
speed -= decrement;
if (speed < 0) speed = 0;
System.out.println("Bike speed decreased by " + decrement + " km/h. Current speed: " + speed + " km/h.");
}
}
//Car class implementing Vehicle
class Car implements Vehicle {
private int gear;
private int speed;
public Car() {
this.gear = 1; // Default gear
this.speed = 0; // Default speed
}
@Override
public void changeGear(int gear) {
if (gear > 0 && gear <= 6) { // Cars usually have 6 gears
this.gear = gear;
System.out.println("Car gear changed to: " + this.gear);
} else {
System.out.println("Invalid gear for Car. Please select between 1 and 6.");
}
}
@Override
public void speedUp(int increment) {
speed += increment;
System.out.println("Car speed increased by " + increment + " km/h. Current speed: " + speed + " km/h.");
}
@Override
public void applyBrakes(int decrement) {
speed -= decrement;
if (speed < 0) speed = 0;
System.out.println("Car speed decreased by " + decrement + " km/h. Current speed: " + speed + " km/h.");
}
}
//Main class to run the program
 class VehicleTest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Vehicle vehicle = null;
System.out.println("Select a vehicle: 1. Bicycle 2. Bike 3. Car");
int vehicleChoice = scanner.nextInt();
// Vehicle selection validation
switch (vehicleChoice) {
case 1:
vehicle = new Bicycle();
break;
case 2:
vehicle = new Bike();
break;
case 3:
vehicle = new Car();
break;
default:
System.out.println("Invalid choice! Please select a valid vehicle.");
return;
}
boolean exit = false;
while (!exit) {
System.out.println("\nSelect operation: 1. Change Gear 2. Speed Up 3. Apply Brakes 4. Exit");
int operationChoice = scanner.nextInt();
switch (operationChoice) {
case 1: // Change Gear
System.out.println("Enter the gear number:");
int gear = scanner.nextInt();
vehicle.changeGear(gear);
break;
case 2: // Speed Up
System.out.println("Enter the speed increment:");
int increment = scanner.nextInt();
vehicle.speedUp(increment);
break;
case 3: // Apply Brakes
System.out.println("Enter the speed decrement:");
int decrement = scanner.nextInt();
vehicle.applyBrakes(decrement);
break;
case 4: // Exit
exit = true;
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid operation! Please select a valid option.");
break;
}
}
scanner.close();
}
}
