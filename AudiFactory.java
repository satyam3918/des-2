public class AudiFactory extends Factory {
    @Override
    public Tire makeTire() {
        return new AudiTire("Manufacturing Audi's Tire");
    }

    @Override
    public Headlight makeHeadlight() {
        return new AudiHeadlight("Manufacturing Audi's Headlight");
    }
}
