public class MotorVehicle{
    private String model;
    private int year;
    private String licence;

    public MotorVehicle(String model, int year, String licence) {
        this.model = model;
        this.year = year;
        this.licence = licence;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(licence);
        sb.append("@");
        sb.append(model);
        sb.append("$");
        sb.append(year);
        return sb.toString();
    }



}
