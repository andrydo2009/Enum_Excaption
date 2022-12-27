
package AllTransport;

import java.awt.geom.Arc2D;

public enum Carrying {

    N1(0,3.5F), N2(3.5F,12F), N3(12F,null);

    private final float minimalCapacity;
    private final Float maximalCapacity;

    Carrying(float minimalCapacity, Float maximalCapacity) {
        this.minimalCapacity = minimalCapacity;
        this.maximalCapacity = maximalCapacity;
    }

    public float getMinimalCapacity() {
        return minimalCapacity;
    }

    public Float getMaximalCapacity() {
        return maximalCapacity;
    }

    @Override
    public String toString() {
        return " грузоподъемность от " + getMinimalCapacity() + " тонн, до " + getMaximalCapacity()+" тонн";
    }
}