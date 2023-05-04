package day34_abstraction.deviceTask;

public final class Iphone extends Phone implements AppleApps{

    public Iphone( String model, String color, String size, double price) {
        super("Apple", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+APPStoreName);
    }
}
