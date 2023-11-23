public abstract class Car {
    private String carName;
    protected Engine engine;
    protected Turbocharger turbocharger;

    public Car() {

    }
    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTurbocharger(Turbocharger turbocharger) {
        this.turbocharger = turbocharger;
    }

    public void startCar() {
        System.out.println("Starting car: " + carName);
    }

    public void accelerateCar() {
        System.out.println("Accelerating car: " + carName);
    }

    public void stopCar() {
        System.out.println("Stopping car: " + carName);
    }

    public abstract void carInfo();
}
