package AllMechanics;

import AllDrivers.Driver;
import AllTransport.Transport;

import java.util.List;
import java.util.Objects;

public class Mechanic
{


    final private String firstNameMechanic;
    final private String secondNameMechanic;
    private String repairServiceCompany;
    final private VehicleRepairSpecification vehicleRepairSpecification;

    public Mechanic(String firstNameMechanic , String secondNameMechanic , String repairServiceCompany , VehicleRepairSpecification vehicleRepairSpecification) {
        this.firstNameMechanic = firstNameMechanic;
        this.secondNameMechanic = secondNameMechanic;
        setRepairServiceCompany ( repairServiceCompany );
        this.vehicleRepairSpecification=vehicleRepairSpecification;
    }



    public String getFirstNameMechanic() {
        return firstNameMechanic;
    }

    public String getSecondNameMechanic() {
        return secondNameMechanic;
    }

    public String getRepairServiceCompany() {
        return repairServiceCompany;
    }

    public VehicleRepairSpecification getVehicleRepairSpecification() {
        return vehicleRepairSpecification;
    }

    public void setRepairServiceCompany(String repairServiceCompany) {
        if(repairServiceCompany==null||repairServiceCompany.isBlank ()||repairServiceCompany.isEmpty ())
        { this.repairServiceCompany = " механик автодрома ";}
        else {this.repairServiceCompany = repairServiceCompany;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals ( firstNameMechanic , mechanic.firstNameMechanic ) && Objects.equals ( secondNameMechanic , mechanic.secondNameMechanic ) && Objects.equals ( repairServiceCompany , mechanic.repairServiceCompany ) && vehicleRepairSpecification == mechanic.vehicleRepairSpecification;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( firstNameMechanic , secondNameMechanic , repairServiceCompany , vehicleRepairSpecification );
    }

    @Override
    public String toString() {
        return getSecondNameMechanic ()+" "+getFirstNameMechanic ()+" "
                + " из компании " + getRepairServiceCompany () + " с классификацией " + getVehicleRepairSpecification ();
    }



}

// the end
