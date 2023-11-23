// Concrete class for Subaru car
public class SubaruBRZ extends Car{
    public SubaruBRZ() {
        super("Subaru BRZ");

        // Set engine and turbocharger
        Engine v6Engine = new V6Engine();
        setEngine(v6Engine);

        Turbocharger cumminsTurbocharger = new CumminsTurbocharger();
        setTurbocharger(cumminsTurbocharger);
    }

    @Override
    public void carInfo() {
        System.out.println("Car information:");
        System.out.println("Model: Subaru BRZ");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Turbocharger: " + turbocharger.getTurbochargerType());
    }
}
