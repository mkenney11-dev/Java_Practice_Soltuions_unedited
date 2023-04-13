package day29_inheritance.phoneTask;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isEmpty()){
            System.err.println("Brand of the phone can not be null or empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.isEmpty()){
            System.err.println("Model of the phone can not be null or empty");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            System.err.println("Color of the phone can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println(" model can not be null or empty");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +  // this gets the class name automatically
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
