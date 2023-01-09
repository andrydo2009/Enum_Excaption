
package AllDrivers;



import java.util.List;
import java.util.Objects;

    public abstract class Driver {
    final String fullNameDriver;
    String driverLicenseCategory;
    final int experienceDriver;

    public Driver(String fullNameDriver , String driverLicenseCategory , int experienceDriver)  {
        if (fullNameDriver == null || fullNameDriver.isBlank ()) {
            this.fullNameDriver = "No name";
        }
        else {
            this.fullNameDriver = fullNameDriver;
        }

        try {
        if (driverLicenseCategory == null || driverLicenseCategory.isBlank ())
        {
            throw new CantDriverLicenseException ("Проверьте корректность ввода категории прав водителя");
        }
         else {
             this.driverLicenseCategory = driverLicenseCategory;
         }
        }
        catch (CantDriverLicenseException e)
        {
        System.out.println (e.getMessage ());
        }

            if (experienceDriver <= 0) {
            this.experienceDriver = 1;
        } else {
            this.experienceDriver = experienceDriver;
        }
    }

    public String getFullNameDriver() {
        return fullNameDriver;
    }

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public int getExperienceDriver() {
        return experienceDriver;
    }


    public abstract void getStart();

    public abstract void getStop();

    public abstract void refuelTransport();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Driver driver = (Driver) o;
        return Objects.equals ( experienceDriver , driver.experienceDriver )
                && Objects.equals ( fullNameDriver , driver.fullNameDriver )
                && Objects.equals ( driverLicenseCategory , driver.driverLicenseCategory );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( fullNameDriver , driverLicenseCategory , experienceDriver );
    }

    @Override
    public String toString() {
        return "Водитель " + getFullNameDriver () + ", с категорией прав " + getDriverLicenseCategory () +
                ", стаж вождения " + getExperienceDriver ();
    }


}

// the end

