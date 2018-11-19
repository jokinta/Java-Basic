public class FullParkingException extends Exception  {
    private String msg;

    public FullParkingException() {
        this.msg = "The Parking is Full.\n";
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
