public class Client {

    public void demoMethod(){
        Tire tire = FactoryMaker.getFactory("audi").makeTire();
        System.out.println(tire.getTire_name());

        Headlight headlight = FactoryMaker.getFactory("audi").makeHeadlight();
        System.out.println(headlight.getHeadlight_name());
    }
}
