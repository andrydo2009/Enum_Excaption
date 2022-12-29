
package AllTransport;

import java.util.Objects;

public abstract class Transport {
    final String brand;
    final String model;
    final double engineVolume;

    public Transport(String brand, String model,double engineVolume) {
        if (brand==null || brand.isBlank()){this.brand="No brand";}
        else {this.brand = brand;}

        if (model==null || model.isBlank()){this.model="No model";}
        else {this.model = model;}

        if (engineVolume <= 0.0) { this.engineVolume=1.5;}
        else {this.engineVolume = engineVolume;}
    }


    public abstract void printType();

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















}