public class InvalidLicence extends Exception {
    private String msg;

    public InvalidLicence() {
        this.msg = "The motor vehicle does not have the specifications needed for this parking";
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
