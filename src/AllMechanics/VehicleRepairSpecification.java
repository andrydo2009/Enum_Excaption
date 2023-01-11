package AllMechanics;

public enum VehicleRepairSpecification {

    SPECIFICATION_CAR( "РЕМОНТ ЛЕГКОВОГО ТРАНСПОРТА" ),
    SPECIFICATION_TRUCK( "РЕМОНТ ГРУЗОВОГО ТРАНСПОРТА" ),
    SPECIFICATION_BUS( "РЕМОНТ АВТОБУСОВ" ),
    SPECIFICATION_UNIVERSAL( "РЕМОНТ ВСЕХ ТИПОВ ТРАНСПОРТА" )
    ;

    private final String specification;

    VehicleRepairSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }

    @Override
    public String toString() {
        return " " + getSpecification ()+ " ";
    }
}
