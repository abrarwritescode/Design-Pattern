// Concrete class for ToyotaGR86 car
public class ToyotaGR86 extends Car{
    public ToyotaGR86() {
        super("Toyota GR86");

        // Set engine and turbocharger
        Engine v6Engine = new V6Engine();
        setEngine(v6Engine);

        Turbocharger alpineTurbocharger = new AlpineTurbocharger();
        setTurbocharger(alpineTurbocharger);
    }

    @Override
    public void carInfo() {
        System.out.println("Car information:");
        System.out.println("Model: Toyota GR86");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Turbocharger: " + turbocharger.getTurbochargerType());
    }
}
