import java.util.ArrayList;
import java.util.List;

public class CarParking extends Parking {

    private int staff = 5;

    public CarParking(int slots, String id) {
        this.parkSlots = slots;
        this.ID = id;
        List<MotorVehicle> motorVehicleList = new ArrayList<>();
    }
    public  void Park(MotorVehicle motorVehicle){
        try {
            if(this.isFull()) {
                throw  new FullParkingException();
            }
            if(staff == 0) {
                System.out.println("Wait. All workers are busy.");
                return;
            }

            LicenceValidator licenceValidator = new LicenceValidator();
            boolean valid = licenceValidator.validateLicence(motorVehicle);
            if(!valid) {
                throw new InvalidLicence();
            }

            motorVehicleList.add(motorVehicle);
            this.slotsTaken++;
            this.staff--;
            System.out.println(motorVehicle.toString() + " has been parked.");
        } catch (FullParkingException e) {
            System.out.println(e.getMessage());
        } catch (InvalidLicence e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
