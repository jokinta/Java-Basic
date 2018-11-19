import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenceValidator {
    private Pattern pattern;
    private Matcher matcher;
    private static final String LICENCE_PATTERN = "^[A-Z]{2}[0-9]{4}[A-Z]{2}@[a-z0-9]{0,10}\\$[0-9]{4}$";
    public LicenceValidator() {
        pattern = Pattern.compile(LICENCE_PATTERN);
    }
    public  boolean checkLicence(String licenceToCheck) {
        matcher = pattern.matcher(licenceToCheck);
        return matcher.matches();
    }

    public boolean validateLicence(MotorVehicle motorVehicle) {
        boolean validLicence = this.checkLicence(motorVehicle.toString());
        if(validLicence)
            return true;
        else
            return false;
    }
}
