package AllTransport;

import AllMechanics.Mechanic;
import AllMechanics.VehicleRepairSpecification;

import java.util.List;
import java.util.Objects;

public abstract class Transport  {
    final String brand;
    final String model;
    final double engineVolume;

     List<Mechanic> mechanic;




    public abstract void printType();
    public Transport(String brand, String model,double engineVolume) {
        if (brand==null || brand.isBlank()){this.brand="No brand";}
        else {this.brand = brand;}

        if (model==null || model.isBlank()){this.model="No model";}
        else {this.model = model;}

        if (engineVolume <= 0.0) { this.engineVolume=1.5;}
        else {this.engineVolume = engineVolume;}

    }

    public Transport(String brand , String model , double engineVolume , List<Mechanic> mechanic) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanic = mechanic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(engineVolume,transport.engineVolume)&& Objects.equals(brand,transport.brand) && Objects.equals(model,transport.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public abstract void getStart();

    public abstract void getStop();

    @Override
    public abstract String toString();

    public abstract void getDiagnosisTransport() throws CantDiagnosisException;


    public void addMechanicTeam(List<Mechanic> mechanic)
    {
        System.out.println ("Транспорт " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume ());
        for (Mechanic value : mechanic)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR&&value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)

        {System.out.println ( "- обслуживает " + value);}

            if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK&&value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)

            {System.out.println ( "- обслуживает " + value);}

            else if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_BUS&&value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)

            {System.out.println ( "- обслуживает " + value);}
        }

    };

    public abstract void addMechanicTeamRacing(List<Mechanic> mechanics);
}

