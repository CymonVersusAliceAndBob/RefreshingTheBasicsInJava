package car;

/**
 *
 * @author Markus
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    public void printVariables(){
	System.out.println("minSpeed: " + minSpeed + " Mph");
	System.out.println("maxSpeed: " + maxSpeed + " Mph");
	System.out.println("weight: " + weight + " pounds");
	System.out.println("Is the car on? " + isTheCarOn);
	System.out.println("It's condition is: " + condition);
	System.out.println("It's name is: " + nameOfCar);
    }
    
    public void wreckCar(){
	condition = 'C';
    }
    
    public void upgradeMinSpeed(){
	minSpeed = maxSpeed;
	maxSpeed = maxSpeed + 1;
    }
    
    public static void main(String[] args) {
        Car familyCar = new Car();
	familyCar.printVariables();
	familyCar.upgradeMinSpeed();
	familyCar.printVariables();
    }
    
}
