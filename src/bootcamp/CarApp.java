package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DeMarcj on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> carList = getCars(scan, "Welcome to the DeMarc Johnson Motors console!");
        choiceCars(carList);
        System.out.println("Thank you!");
        scan.close();
    }

    public static ArrayList getCars(Scanner scan, String salutation){
        System.out.println(salutation);
        ArrayList<Car> carList = new ArrayList<Car>();
        	Car car1 = new Car("Nikolai", "Model S", 2017, 54999.90);
        	Car car2 = new Car("Ford", "Escapade", 2017, 54999.90);
        	Car car3 = new Car("Chewie", "Vette", 2017, 54999.90);
        	Car car4 = new UsedCar("Hyonda", "Prior", 2015, 54999.90, 35987.6);
        	Car car5 = new UsedCar("Grand", "Chirpus", 2013, 54999.90, 12345.0);
        	Car car6 = new UsedCar("Ponitac", "Witherell", 2016, 54999.90, 3500.3);
            carList.add(car1);
            return carList;
    
    }
    
    public static void choiceCars(ArrayList<Car> carList){
    	System.out.println("Type in a number to pick a car.");
    	for(Car cars: carList){
            System.out.println(cars);
            System.out.println("");
        }
    	System.out.println("Which car would you like?");
    }
}
