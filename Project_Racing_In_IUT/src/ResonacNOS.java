// Class for applying nitrous oxide (NOS)
class ResonacNOS extends CarDecorator {
    private Car car;


    public ResonacNOS(Car car) {
        this.car = car;
    }
    public ResonacNOS() {

    }
    @Override
    public void startCar() {
        System.out.println("Starting car with ResonacNOS: " + car.getCarName());
    }

    @Override
    public void accelerateCar() {
        System.out.println("Accelerating car with ResonacNOS: " + car.getCarName());
    }

    @Override
    public void stopCar() {
        System.out.println("Stopping car with ResonacNOS: " + car.getCarName());
    }

    @Override
    public void carInfo() {
        car.carInfo();
        System.out.println("NOS: RESONAC Activated");
    }
}