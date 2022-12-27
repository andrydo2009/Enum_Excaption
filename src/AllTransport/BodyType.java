package AllTransport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн"),;

    private final String body;
    BodyType(String body) {
        this.body=body;
    }
    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "тип кузова " + getBody();
    }
}
