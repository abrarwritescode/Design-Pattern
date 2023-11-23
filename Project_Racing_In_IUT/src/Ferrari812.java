// Concrete class for Ferrari812 car
public class Ferrari812 extends Car{

    public Ferrari812() {
        super("Ferrari 812");

        // Set engine and turbocharger
        Engine v12Engine = new V12Engine();
        setEngine(v12Engine);

        Turbocharger honeywellTurbocharger = new HoneywellTurbocharger();
        setTurbocharger(honeywellTurbocharger);
    }

    @Override
    public void carInfo() {
        System.out.println("Car information:");
        System.out.println("Model: Ferrari 812");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Turbocharger: " + turbocharger.getTurbochargerType());
    }
}
