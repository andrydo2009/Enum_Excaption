
import AllDrivers.*;
import AllTransport.*;

public class Main {
    public static void main(String[] args) throws CantDiagnosisException, CantDriverLicenseException {


        Car car1=new Car("Lada","Granta",1.7, null);
        System.out.println(car1);
        Car car2=new Car("Audi","A8 50 L TDI quattro",3.0,BodyType.UNIVERSAL);
        System.out.println(car2);
        Car car3= new Car("BMW","Z8",3.0,BodyType.COUPE);
        System.out.println(car3);
        Car car4 = new Car("KIA","Sportage",2.4,BodyType.CROSSOVER );
        System.out.println(car4);

        Bus bus1=new Bus("Volvo","B12",12.5,Seats.EXTRA_SMALL);
        System.out.println(bus1);
        Bus bus2=new Bus("Golden Dragon","XML6127",10.5,Seats.BIG);
        System.out.println(bus2);
        Bus bus3=new Bus("MAN","Lion's Coach", 11.0,Seats.EXTRA_BIG);
        System.out.println(bus3);
        Bus bus4=new Bus("Scania","Irizar", 10.6,null);
        System.out.println(bus4);

        Truck truck1=new Truck("Mercedes-Benz","Actros",12.8, null);
        System.out.println(truck1);
        Truck truck2=new Truck("Freightliner","FLD",14.0,Carrying.N2);
        System.out.println(truck2);
        Truck truck3=new Truck("Daf","XF",13.2, Carrying.N1);
        System.out.println(truck3);
        Truck truck4=new Truck("Volvo","FH",12.8, Carrying.N3);
        System.out.println(truck4);


        CarDriver<Car> Ivan= new CarDriver<>("Ivan Ivanovich Ivanov", "B", 5);
        System.out.println(Ivan);
        BusDriver<Bus> Oleg= new BusDriver<>("Oleg Petrovich Petrov", null, 10);
        System.out.println(Oleg);
        TruckDriver<Truck> Semen= new TruckDriver<>("Semen Semenovich Semenov", "C", 20);
        System.out.println(Semen);

        Ivan.goDrive(car1);
        Oleg.goDrive(bus1);
        Semen.goDrive(truck1);
        car1.printType();
        car2.printType();
        truck1.printType();
        bus4.printType();
        bus1.printType();
        truck4.printType();

        checkDiagnosis ( car1,car2,car3,car4,bus1,bus2,bus3,bus4,truck1,truck2,truck3,truck4 );







    }
    public static void checkDiagnosis(Transport... transports)  {
        for (Transport transport : transports)
            try {
                transport.getDiagnosisTransport();
            } catch (CantDiagnosisException e) {
                System.out.println(e.getMessage());
            }
    }




}

