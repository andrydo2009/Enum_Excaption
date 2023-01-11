package AllTransport;

import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;

import java.util.List;

public class Bus extends Transport  implements Contest{
    private final Seats seats;
    public Bus(String brand, String model, double engineVolume, Seats seats) {
        super(brand, model, engineVolume);
        this.seats=seats;
    }

    public Bus(String brand , String model , double engineVolume , List<Mechanic> mechanic , Seats seats) {
        super ( brand , model , engineVolume , mechanic );
        this.seats = seats;
    }

    @Override
    public void printType() {
        if (seats==null) {
            System.out.println("Данных по транспортному средству недостаточно");}
        else {
            String minimalSeats = seats.getMinimalSeats() == 0 ? "" : "от " + seats.getMinimalSeats();
            String maximalSeats = seats.getMaximalSeats() == null ? "" : "до " + seats.getMaximalSeats();
            System.out.println("вместимость " + seats.getMaximalSeats() + " мест");
        }
    }

    @Override
    public void goPitStop(boolean OutOrIn) {
        if (OutOrIn)
        {System.out.println("Автобус "+getBrand()+" "+getModel()+" заезжает на Пит Стоп!");}
        else {System.out.println("Автобус "+getBrand()+" "+getModel()+" покинул Пит Стоп!");}
    }

    @Override
    public void getBestTimeRound(double time) {
        System.out.println("Лучшее время круга у автобуса" + getBrand() + " " + getModel() + " " + time + " минут");
    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println("Максимальная скорость у автобуса " + getBrand() + " " + getModel() + " " + speed + " км/ч");
    }

    @Override
    public void getStart() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" стартует");
    }

    @Override
    public void getStop() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" останавливается");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
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
    public void getDiagnosisTransport() {
        System.out.println ("Автобусы не проходят диагностику" );
    }

    @Override
    public void addMechanicTeam(List<Mechanic> mechanic)
    {
        System.out.println ("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanic)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_BUS||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- обслуживает " + value);}
        }
    }

    //    public void addMechanicTeam(List<Mechanic> mechanic) {
//        for (Mechanic value : mechanic) {
//            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_BUS) {
//                System.out.println ( "Автобус обслуживает " + value );
//                break;
//            } else if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
//                System.out.println ( "Автобус обслуживает " + value );
//                break;
//            }
//        }
//    }




}

