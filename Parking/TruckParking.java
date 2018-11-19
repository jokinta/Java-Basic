import java.util.ArrayList;
import java.util.List;

public class TruckParking extends Parking {

    public TruckParking(int slots, String id, int numberOfTrucks) {
        this.parkSlots = slots;
        this.ID = id;
        List<Truck> motorVehicleList = new ArrayList<>(numberOfTrucks);
    }
    public  void Park(MotorVehicle motorVehicle){
        try {
            if(this.isFull()) {
                throw  new FullParkingException();
            }

            int truckSize = ((Truck) motorVehicle).getSize() + 1;
            if(motorVehicleList.size() +  truckSize> this.parkSlots) {
                throw new NoFreeParkSlots();
            }

            LicenceValidator licenceValidator = new LicenceValidator();
            boolean valid = licenceValidator.validateLicence(motorVehicle);
            if(!valid) {
                throw new InvalidLicence();
            }

            this.slotsTaken += truckSize;
            motorVehicleList.add(motorVehicle);
            System.out.println(motorVehicle.toString() + " has been parked.");

        } catch (FullParkingException e) {
            System.out.println(e.getMessage());
        } catch (InvalidLicence e) {
            System.out.println(e.getMessage());
        } catch (NoFreeParkSlots e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
