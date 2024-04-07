package Assignment2;

public class Vehicle {

	 protected String name; // Encapsulation - name is a protected attribute

	 public Vehicle(String name) {
	     this.name = name;
	 }

	 public String getName() {
	     return name;
	 }

	 public void setName(String name) {
	     this.name = name;
	 }

	 public void move() {
	     System.out.println("Vehicle is moving...");
	 }


}

//Child class demonstrating Compile time Polymorphism
class Car extends Vehicle {
public Car(String name) {
   super(name);
}

public void move() {
   System.out.println("Car is moving...");
}
}

//Child class demonstrating Run time Polymorphism
class Bicycle extends Vehicle {
public Bicycle(String name) {
   super(name);
}

public void move() {
   System.out.println("Bicycle is moving...");
}
}

//Static keyword - Demonstrated through a static method
class Math {
public static int add(int x, int y) {
   return x + y;
}
}

//Super keyword - Used in child class constructor
class Motorcycle extends Vehicle {
private String color;

public Motorcycle(String name, String color) {
   super(name);
   this.color = color;
}

public void displayInfo() {
   System.out.println("This is a " + color + " motorcycle named " + getName() + ".");
}
}

public class Main {
public static void main(String[] args) {
   // Inheritance
   Car car = new Car("Toyota");
   Bicycle bicycle = new Bicycle("BMX");

   // Compile time Polymorphism
   car.move();  // Output: Car is moving...
   bicycle.move();  // Output: Bicycle is moving...

   // Run time Polymorphism
   Vehicle[] vehicles = {car, bicycle};
   for (Vehicle vehicle : vehicles) {
       vehicle.move();  // Output: Car is moving... Bicycle is moving...
   }

   // Static keyword
   System.out.println(Math.add(5, 3));  // Output: 8

   // Super keyword
   Motorcycle motorcycle = new Motorcycle("Harley Davidson", "black");
   motorcycle.displayInfo();  // Output: This is a black motorcycle named Harley Davidson.

   // Encapsulation and Access Modifiers
   // Accessing protected attribute via getter and setter
   System.out.println(car.getName());  // Output: Toyota
   car.setName("Honda");
   System.out.println(car.getName());  // Output: Honda
}
}
