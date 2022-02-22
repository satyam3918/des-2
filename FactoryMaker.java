public class FactoryMaker {

    public static Factory getFactory(String name){
        if(name.equals("audi")){
            return new AudiFactory();
        }
        else if(name.equals("mercedes")){
            return new MercedesFactory();
        }
        else{
            return null;
        }
    }
}
