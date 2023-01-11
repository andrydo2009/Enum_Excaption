package AllTransport;


import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;

import java.util.List;

public class Car extends Transport implements Contest {

    private final BodyType bodyType;

    public Car(String brand , String model , double engineVolume , BodyType bodyType) {
        super ( brand , model , engineVolume );
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println ( "Данных по транспортному средству недостаточно" );
        } else {
            System.out.println ( bodyType );
        }
    }


    @Override
    public boolean equals(Object o) {
        return super.equals ( o );
    }

    @Override
    public int hashCode() {
        return super.hashCode ();
    }


    @Override
    public void goPitStop(boolean OutOrIn) {
        if (OutOrIn) {
            System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " заезжает на Пит Стоп!" );
        } else {
            System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " покинул Пит Стоп!" );
        }
    }

    @Override
    public void getBestTimeRound(double time) {
        System.out.println ( "Лучшее время круга у автомобиля " + getBrand () + " " + getModel () + " " + time + " минут" );

    }

    @Override
    public void getMaximalSpeedTransport(int speed) {
        System.out.println ( "Максимальная скорость у автомобиля " + getBrand () + " " + getModel () + " " + speed + " км/ч" );
    }

    @Override
    public void getStart() {
        System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " стартует" );
    }

    @Override
    public void getStop() {
        System.out.println ( "Автомобиль " + getBrand () + " " + getModel () + " останавливается" );
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume ();
    }

    @Override
    public void getDiagnosisTransport() {
        System.out.println ( "Проводим диагностику автомобиля " + getBrand () + " " + getModel () );
    }

    @Override
    public  void addMechanicTeam(List<Mechanic> mechanic) {

        for (Mechanic value : mechanic)
        {
            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR) {
                System.out.println ( "Машину обслуживает " + value );
                break;
            } else if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println ( "Машину обслуживает " + value );
                break;
            }
        }
    }
}






