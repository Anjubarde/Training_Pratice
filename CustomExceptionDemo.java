package com.exception.demo;

//custom exception or user-defined exception 
//class DemoException extends Exception{} ->checked exception
//class DemoException extends RunTimeException{}->unchecked exception

class VehicleSpeedException extends RuntimeException{
	public VehicleSpeedException(String msg) {
		super(msg);
	}
}
class InvalidMovableWheels extends Exception{
	public InvalidMovableWheels(String msg) {
		super(msg);
	}
}
class Car{
	void testSpeed(int speed) {
		if(speed>50) {
			throw new VehicleSpeedException("vehicle speed should be less than 50");
		}
		else {
		System.out.println("you can allow to drive");
		}
	}
	void startCar(boolean status) throws InvalidMovableWheels{
		status=false;
		if(!status) {
			throw new InvalidMovableWheels("wheels are not moving");
		}
		else {
			System.out.println("car is moving");
			}
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		try {
		//c.testSpeed(60);
			c.startCar(false);
		}
		catch(InvalidMovableWheels e){
			System.out.println(e.getMessage());
		}
		System.out.println("Thank you");
		System.out.println("End");
	}

}
