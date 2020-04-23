public class SpeedDecorator extends CarDecorator {
    private Car car;

    public SpeedDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getProducer() {
        return car.getProducer();
    }

    @Override
    public String getModel() {
        return car.getModel();
    }

    @Override
    public int getSpeed() {
        return car.getSpeed()+25;
    }
}
