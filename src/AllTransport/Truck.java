

package AllTransport;

import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;

import java.util.List;

public class Truck extends Transport implements Contest {

    private final  Carrying carrying;
    public Truck(String brand, String model, double engineVolume,Carrying carrying) {
        super(brand, model, engineVolume);
        this.carrying=carrying;
    }

    public Truck(String brand , String model , double engineVolume , List<Mechanic> mechanic , Carrying carrying) {
        super ( brand , model , engineVolume , mechanic );
        this.carrying = carrying;
    }

    @Override
    public void printType() {
        if (carrying==null) {
            System.out.println("Данных по транспортному средству недостаточно");}
        else {
            String minimalCapacity = carrying.getMinimalCapacity() == 0 ? "" : "от " + carrying.getMinimalCapacity();
            String maximalCapacity = carrying.getMaximalCapacity() == null ? "" : "до " + carrying.getMaximalCapacity();
            System.out.println("грузоподъемность больше " + carrying.getMinimalCapacity() + " тонн");}
    }

    @Override
    public void goPitStop(boolean OutOrIn) {
        if (OutOrIn)
        {System.out.println("Грузовик "+getBrand()+" "+getModel()+" заезжает на Пит Стоп!");}
        else {System.out.println("Грузовик "+getBrand()+" "+getModel()+" покинул Пит Стоп!");}
    }


    @Override
    public void getBestTimeRound(double time) {
        System.out.println("Лучшее время круга у грузовика" + getBrand() + " " + getModel() + " " + time + " минут");
    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + " " + getModel() + " " + speed + " км/ч");
    }

    @Override
    public void getStart() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" останавливается");
    }

    @Override
    public String toString() {
        return "Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void getDiagnosisTransport()  {
        System.out.println ("Проводим диагностику грузовика " + getBrand () + " " + getModel ());
    }

    @Override
    public void addMechanicTeam(List<Mechanic> mechanic)
    {
        System.out.println ("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanic)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- обслуживает " + value);}
        }
    }

    //    public void addMechanicTeam(List<Mechanic> mechanic) {
//        for (Mechanic value : mechanic) {
//            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK) {
//                System.out.println ( "Грузовик обслуживает " + value );
//                break;
//            } else if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
//                System.out.println ( "Грузовик обслуживает " + value );
//                break;
//            }
//        }
//    }



}
