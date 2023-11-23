// Decorator class for cars (abstract class)

//NOS DECORATOR
abstract class CarDecorator extends Car {
    private Car car;

    public CarDecorator() {

    }

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getCarName() {
        return car.getCarName();
    }

    @Override
    public void startCar() {
        car.startCar();
    }

    @Override
    public void accelerateCar() {
        car.accelerateCar();
    }

    @Override
    public void stopCar() {
        car.stopCar();
    }
}
