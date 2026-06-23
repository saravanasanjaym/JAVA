abstract class Vehicle 
{
    abstract void start();
    void fuelType() 
	{
        System.out.println("Vehicle uses fuel or electricity.");
    }
}
class Car extends Vehicle 
{
    void start() {
        System.out.println("Car starts with a key.");
    }
}
class Bike extends Vehicle 
{
    void start() 
	{
        System.out.println("Bike starts with a self-start button.");
    }
}
public class Abstraction 
{
    public static void main(String[] args) 
	{
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v1.fuelType();
        System.out.println();
        v2.start();
        v2.fuelType();
    }
}