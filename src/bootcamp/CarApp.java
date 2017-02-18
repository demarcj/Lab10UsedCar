package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DeMarcj on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getCars(scan, "Welcome to the Grand Circus Motors admin console!");
        System.out.println("Thank you!");
        scan.close();
    }

    public static void getCars(Scanner scan, String salutation){
        System.out.println(salutation);
        System.out.println("How many cars are enter: ");
        int input = scan.nextInt();
        ArrayList<Car> carList = new ArrayList<Car>();

        for(int i = 0; i < input; i++){
            System.out.println("Enter the car make: ");
            String car = scan.next();
            scan.nextLine();

            System.out.println("Enter the car model: ");
            String model = scan.nextLine();

            System.out.println("Enter the car year: ");
            int year = scan.nextInt();

            System.out.println("Enter the car price: ");
            double price = scan.nextDouble();

            Car cars = new Car(car, model, year, price);

            carList.add(cars);
        }
        for(Car cars: carList){
            System.out.println(cars);
            System.out.println("");
        }
    }
}
