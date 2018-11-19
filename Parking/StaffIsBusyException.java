public class StaffIsBusyException extends Exception {
    private String msg;

    public StaffIsBusyException() {
        this.msg = "All workers are busy";
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
