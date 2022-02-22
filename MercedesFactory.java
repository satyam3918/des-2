public class MercedesFactory extends Factory{
    @Override
    public Tire makeTire() {
        return new MercedesTire("Manufacturing Mercedes Tire");
    }

    @Override
    public Headlight makeHeadlight() {
        return new MercedesHeadlight("Manufacturing Mercedes Headlight");
    }
}
