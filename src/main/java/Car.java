public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String model, int numberOfDoors)
    {
        super(model, 4);
        this.numberOfDoors = numberOfDoors;
    }

    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use steering wheel to steer.";

    }

    @Override
    public String boardingInstructions() {
        return "Get in.";
    }

    public String openDoors()
    {
        return ("Beep. "+ numberOfDoors +" doors opened.");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}