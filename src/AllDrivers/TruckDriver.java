package AllDrivers;

import AllTransport.Contest;
import AllTransport.Transport;

public class TruckDriver<C extends Transport & Contest> extends Driver {

    public TruckDriver(String fullNameDriver, String driverLicenseCategory, int experienceDriver)  {
        super(fullNameDriver, driverLicenseCategory, experienceDriver);
    }

    public void goDrive(C transport){

        System.out.println("Водитель "+getFullNameDriver() + " " + transport.getBrand()
                + " управляет автомобилем " + transport.getModel() + " и будет участвовать в заезде ");
    }

    @Override
    public void getStart() {
        System.out.println("Водитель "+ getFullNameDriver() + " стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Водитель "+ getFullNameDriver() + " останавливается");
    }

    @Override
    public void refuelTransport() {
        System.out.println("Водитель "+ getFullNameDriver() + " заправляется");
    }


}

