package bootcamp;

/**
 * Created by DeMarcj on 2/17/2017.
 */
public class UsedCar extends Car {

    private double mileage;
    

    public UsedCar(String make, String model, int year, double price, double mileage){
        super(make, model, year, price);
        this.mileage = mileage;
    }

    public String toString() {
        return super.toString() + " (Used)\t " + mileage + " miles";
    }
}
