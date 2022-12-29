package AllTransport;

public enum Seats {

    EXTRA_SMALL(0,10),
    SMALL(0,25),
    MEDIUM(40,50),
    BIG(60,80),
    EXTRA_BIG ( 100 , 120 );

    private final int minimalSeats;
    private final Integer maximalSeats;

    Seats(Integer minimalSeats, Integer maximalSeats) {
        this.minimalSeats = minimalSeats;
        this.maximalSeats = maximalSeats;
    }



    public Integer getMinimalSeats() {
        return minimalSeats;
    }

    public Integer getMaximalSeats() {
        return maximalSeats;
    }

    @Override
    public String toString() {
        return " вместимость от " + getMinimalSeats() + " мест, до " + getMaximalSeats()+" мест";
    }
}

