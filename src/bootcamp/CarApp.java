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

    //This is the car data for the Car and UsedCar class
    public static ArrayList getCars(String salutation){
        System.out.println(salutation);
        ArrayList<Car> carList = new ArrayList<Car>();
        	
        Car car1 = new Car("Nikolai", "Model S", 2017, 54999.90);
        Car car2 = new Car("Ford", "Escapade", 2017, 31999.90);
        Car car3 = new Car("Chewie", "Vette", 2017, 44989.95);
        Car car4 = new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6);
        Car car5 = new UsedCar("Grand", "Chirpus", 2013, 8500.00, 12345.0);
        Car car6 = new UsedCar("Ponitac", "Witherell", 2016, 14450.00, 3500.3);
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
    	do{//This allow the user to see and buy a car from the lot
    		System.out.println("Type in a number to pick a car.");
    		for(int i = 0; i < carList.size(); i++){
    			System.out.println((i + 1) + ". " + carList.get(i));
    			if(i == carList.size() - 1){
    				System.out.println((i + 2) + ". Quit");
    				System.out.println("Which car would you like? Pick a number:");

    				//This is a validation to check and make sure user input a number
    				input = checkInt(scan, carList);

    				while(input < 1 || input > carList.size() + 1){
    					System.out.println("Please only a number from 1 to " + (carList.size() + 1));
    					input = scan.nextInt();
    				}

    				//If the user pick the quit option this will exit out of the program
    				if(input == carList.size() + 1){
    					return "Thank You!";
    				}

    				System.out.println(carList.get(input - 1));

    				//This will ask if the user wants to buy a car
    				buy = buyerOption(scan, carList, input , "Would you like to buy this car? Yes or no.");
    				if(carList.size() == 0){
                        return "Sorry, we ran are out of car!";
                    }
    			}
    		}
    	}while(buy.equalsIgnoreCase("yes") || buy.equalsIgnoreCase("no"));
    	//This do-while will repeat the program if the user decided to not quit
    		return "Thank You!";
    }

    public static String buyerOption(Scanner scan, ArrayList<Car> carList, int input, String question){
        String buy = "";
        System.out.println(question);
        buy = scan.next();

        //If user decides to buy the car then this if statement will remove from the list
        if(buy.equalsIgnoreCase("yes")) {
            carList.remove(input - 1);
        }
        while(!(buy.equalsIgnoreCase("yes") || buy.equalsIgnoreCase("no"))){
            System.out.println("That is not a valid answer!");
            System.out.println("Would you like to buy this car? Yes or no.");
            buy = scan.next();
        }
        return buy;
    }

    public static int checkInt(Scanner scan, ArrayList<Car> carList){
        int input = 0;
        while(!scan.hasNextInt()){
            System.out.println("That's not an number!");
            for(int i = 0; i < carList.size(); i++) {
                System.out.println((i + 1) + ". " + carList.get(i));
                if(i == carList.size() - 1) {
                    System.out.println((i + 2) + ". Quit");
                }
            }
            System.out.println("Which car would you? Pick a number: ");
            scan.nextLine();
        }
        input = scan.nextInt();
        scan.nextLine();
        return input;
    }
}
