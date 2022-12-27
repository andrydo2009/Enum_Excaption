
package AllDrivers;

import java.util.Objects;

public abstract class Driver
{
    final String fullNameDriver;
    final String driverLicenseCategory;
    final int experienceDriver;

    public Driver(String fullNameDriver, String driverLicenseCategory, int experienceDriver) {
        if (fullNameDriver==null || fullNameDriver.isBlank()){this.fullNameDriver="No name";}
        else {this.fullNameDriver = fullNameDriver;}
        if (driverLicenseCategory==null || driverLicenseCategory.isBlank()){this.driverLicenseCategory="No Category";}
        else {this.driverLicenseCategory = driverLicenseCategory;}
        if (experienceDriver <= 0) { this.experienceDriver=1;}
        else {this.experienceDriver = experienceDriver;}
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
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return  Objects.equals(experienceDriver,driver.experienceDriver)
                && Objects.equals(fullNameDriver, driver.fullNameDriver)
                && Objects.equals(driverLicenseCategory, driver.driverLicenseCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameDriver, driverLicenseCategory, experienceDriver);
    }

    @Override
    public String toString() {
        return "Водитель " + getFullNameDriver() + ", с категорией прав " + getDriverLicenseCategory() +
                ", стаж вождения " + getExperienceDriver();
    }
}


