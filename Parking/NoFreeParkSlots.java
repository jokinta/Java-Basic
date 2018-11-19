public class NoFreeParkSlots extends Exception {
    private String msg;

    public NoFreeParkSlots() {
        this.msg = "The Parking is Full.";
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
