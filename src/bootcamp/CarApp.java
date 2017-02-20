package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DeMarcj on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Car> carList = getCars("Welcome to the DeMarc Johnson Motors console!");
        System.out.println(choiceCars(scan, carList));
        scan.close();
    }

    public static ArrayList getCars(String salutation){
        System.out.println(salutation);
        ArrayList<Car> carList = new ArrayList<Car>();
        	
        Car car1 = new Car("Nikolai", "Model S", 2017, 54999.90);
        Car car2 = new Car("Ford", "Escapade", 2017, 54999.90);
        Car car3 = new Car("Chewie", "Vette", 2017, 54999.90);
        Car car4 = new UsedCar("Hyonda", "Prior", 2015, 54999.90, 35987.6);
        Car car5 = new UsedCar("Grand", "Chirpus", 2013, 54999.90, 12345.0);
        Car car6 = new UsedCar("Ponitac", "Witherell", 2016, 54999.90, 3500.3);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
            return carList;
    }
    
    public static String choiceCars(Scanner scan, ArrayList<Car> carList){
    	String buy = "";
    	int input = 0;
    	do{
    		System.out.println("Type in a number to pick a car.");
    		for(int i = 0; i < carList.size(); i++){
    			System.out.println((i + 1) + ". " + carList.get(i));
    			if(i == carList.size() - 1){
    				System.out.println((i + 2) + ". Quit");
    				System.out.println("Which car would you like? Pick a number:");
    				input = scan.nextInt();
    				while(input < 1 || input > carList.size() + 1){
    					System.out.println("Please only a number from 1 to " + (carList.size() + 1));
    					input = scan.nextInt();
    				}
    				if(input == carList.size() + 1){
    					return "Thank You!";
    				}
    				System.out.println(carList.get(input - 1));
    				System.out.println("Would you like to buy this car? Yes or no.");
    				buy = scan.next();
    	    		carList.remove(input - 1);
    			}
    		}
    	}while(buy.equalsIgnoreCase("yes"));
    		return "Thank You!";
    }
}
