package day28_encapsulation.circleTask;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(4.5);

        System.out.println(circle);

        circle.setRadius(6.2);

        System.out.println(circle.getRadius());

        System.out.println(circle);

    }
}
