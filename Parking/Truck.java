public class Truck extends MotorVehicle {
    private int numberOfTrailers; // ремарке?

    public Truck(String model, int year, String licence, int numberOfTrailers) {
        super(model, year, licence);
        this.numberOfTrailers = numberOfTrailers;
    }
    public int getSize() {
        return this.numberOfTrailers;
    }
}
