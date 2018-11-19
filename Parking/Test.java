public class Test {
    public static void main(String[] args) {
        //Simple Truck test
        System.out.println("Simple Truck test");
        TruckParking truckParking = new TruckParking(3,"Truck Parking", 0);

        Truck truck1 = new Truck("mercedes", 2018, "BB1111BB", 1);
        Truck truck2 = new Truck("mercedes", 2018, "BB2222B", 1);
        Truck truck3 = new Truck("mercedes", 2018, "BB3333BB", 1);
        Truck truck4 = new Truck("mercedes", 2018, "BB4444BB", 1);
        Truck truck5 = new Truck("mercedes", 2018, "BB5555BB", 1);
        Truck truck6 = new Truck("mercedes", 2018, "BB6666BB", 1);

        truckParking.Park(truck1);
        truckParking.Park(truck2);
        truckParking.Park(truck3);
        truckParking.Park(truck4);
        truckParking.Park(truck5);
        truckParking.Park(truck6);


        System.out.println("--------------------------------------------");

        //Simple Car test
        System.out.println("Simple Car test");
        CarParking carParking = new CarParking(6, "Car Parking");

        Car car1 = new Car("c220", 2016, "CC1111CC");
        Car car2 = new Car("c320", 2016, "CC2222CC");
        Car car3 = new Car("330xd", 2016, "CC3333CC");
        Car car4 = new Car("golf3", 2016, "CC4444CC");
        Car car5 = new Car("golf7", 2016, "CC5555CC");
        Car car6 = new Car("a8", 2016, "CC6666CC");

        carParking.Park(car1);
        carParking.Park(car2);
        carParking.Park(car3);
        carParking.Park(car4);
        carParking.Park(car5);
        carParking.Park(car6);
    }
}
