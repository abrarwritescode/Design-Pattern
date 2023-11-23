public class SemaNOS extends CarDecorator {
    private Car car;


    public SemaNOS(Car car) {
        this.car = car;
    }
    public SemaNOS() {
        // default constructor logic, if needed
    }
    @Override
    public void startCar() {
        System.out.println("Starting car with SemaNOS: " + car.getCarName());
    }

    @Override
    public void accelerateCar() {
        System.out.println("Accelerating car with SemaNOS: " + car.getCarName());
    }

    @Override
    public void stopCar() {
        System.out.println("Stopping car with SemaNOS: " + car.getCarName());
    }

    @Override
    public void carInfo() {
        car.carInfo();
        System.out.println("NOS: SEMA Activated");
    }
}
