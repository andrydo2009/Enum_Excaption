

import AllDrivers.BusDriver;
import AllDrivers.CarDriver;
import AllDrivers.Driver;
import AllDrivers.TruckDriver;
import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;
import AllTransport.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Car car1=new Car("Lada","Granta",1.7, BodyType.SEDAN);
        Car car2=new Car("Audi","A8 50 L TDI quattro",3.0,BodyType.UNIVERSAL);
        Car car3= new Car("BMW","Z8",3.0,BodyType.COUPE);
        Car car4 = new Car("KIA","Sportage",2.4,BodyType.CROSSOVER );

        Bus bus1=new Bus("Volvo","B12",12.5,Seats.EXTRA_SMALL);
        Bus bus2=new Bus("Golden Dragon","XML6127",10.5,Seats.BIG);
        Bus bus3=new Bus("MAN","Lion's Coach", 11.0,Seats.EXTRA_BIG);
        Bus bus4=new Bus("Scania","Irizar", 10.6,Seats.EXTRA_SMALL);

        Truck truck1=new Truck("Mercedes-Benz","Actros",12.8, Carrying.N2);
        Truck truck2=new Truck("Freightliner","FLD",14.0,Carrying.N2);
        Truck truck3=new Truck("Daf","XF",13.2, Carrying.N1);
        Truck truck4=new Truck("Volvo","FH",12.8, Carrying.N3);


        CarDriver<Car> Ivan= new CarDriver<>("Ivan Ivanovich Ivanov", "B", 5);
        BusDriver<Bus> Oleg= new BusDriver<>("Oleg Petrovich Petrov", "D", 10);
        TruckDriver<Truck> Semen= new TruckDriver<>("Semen Semenovich Semenov", "C", 20);

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

        Mechanic mechanic1=new Mechanic ("Fedor","Fedorov","MegaCar", VehicleRepairSpecification.SPECIFICATION_CAR );
        Mechanic mechanic2=new Mechanic ("Ivan","Ivanov","MegaTruck", VehicleRepairSpecification.SPECIFICATION_TRUCK);
        Mechanic mechanic3=new Mechanic ("Sergei","Sergeev","MegaBus", VehicleRepairSpecification.SPECIFICATION_BUS );
        Mechanic mechanic4=new Mechanic ("Andrew","Andreev","MegaAvto", VehicleRepairSpecification.SPECIFICATION_UNIVERSAL );


        List<Mechanic> mechanicList=new ArrayList<> ();
        mechanicList.add ( mechanic1 );
        mechanicList.add ( mechanic2 );
        mechanicList.add ( mechanic3 );
        mechanicList.add ( mechanic4 );
        mechanicList.forEach (System.out::println   );

        List<Transport> transportList = new ArrayList<> ();
        transportList.add ( car1 );
        transportList.add ( car2 );
        transportList.add ( car3 );
        transportList.add ( car4 );
        transportList.add ( bus1 );
        transportList.add ( bus2 );
        transportList.add ( bus3 );
        transportList.add ( bus4 );
        transportList.add ( truck1 );
        transportList.add ( truck2);
        transportList.add ( truck3);
        transportList.add ( truck4 );
        transportList.forEach ( System.out::println );

        List<Driver> driverList=new ArrayList<> ();
        driverList.add ( Ivan );
        driverList.add ( Oleg );
        driverList.add ( Semen );
        driverList.forEach ( System.out::println  );


        repairTransport ( transportList,1,driverList,1,mechanicList, 2);
        serviceTransport (transportList,0,mechanicList, 3);






    }

    public static void checkDiagnosis(Transport... transports)  {
        for (Transport transport : transports)
            try {
                transport.getDiagnosisTransport();
            } catch (CantDiagnosisException e) {
                System.out.println(e.getMessage());
            }
    }


    public static void serviceTransport (List<Transport> transports,int indexTransport,
                                         List<Mechanic> mechanic, int indexMechanic)
    {
        System.out.println (mechanic.get ( indexMechanic ) + " проводит техобслуживание " + transports.get ( indexTransport ));
    }


    public static void repairTransport(List<Transport> transports,int indexTransport,
                                       List<Driver> driver, int indexDriver,
                                       List<Mechanic> mechanic, int indexMechanic)

    {

        System.out.println (mechanic.get ( indexMechanic ) + " обслуживает " + transports.get ( indexTransport ) + " пилот " + driver.get ( indexDriver ) );


    }







}

