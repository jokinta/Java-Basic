import java.util.ArrayList;
import java.util.List;

public abstract class Parking {
    protected int parkSlots;
    protected String ID;
    protected List<MotorVehicle> motorVehicleList = new ArrayList<>();
    protected int slotsTaken;

    public abstract void Park(MotorVehicle motorVehicle);

    public boolean isFull() {
        if(this.parkSlots == this.slotsTaken) {
            return true;
        }
        return false;
    }
}
