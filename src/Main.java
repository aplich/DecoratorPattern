public class Main {
    public static void main(String[] args) {
        Car car1 = new Opel();
        System.out.println(car1.getProducer());
        System.out.println(car1.getModel());
        System.out.println(car1.getSpeed());
        System.out.println();
        Car car2 = new SpeedDecorator(car1);
        System.out.println(car2.getProducer());
        System.out.println(car2.getModel());
        System.out.println(car2.getSpeed());
    }
}
