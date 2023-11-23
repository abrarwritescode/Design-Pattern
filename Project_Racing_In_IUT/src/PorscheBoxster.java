// Concrete class for PorscheBoxster car
public class PorscheBoxster extends Car{
    public PorscheBoxster() {
        super("Porsche Boxster");


        Engine v8Engine = new V8Engine();
        setEngine(v8Engine);

        Turbocharger honeywellTurbocharger = new HoneywellTurbocharger();
        setTurbocharger(honeywellTurbocharger);
    }

    @Override
    public void carInfo() {
        System.out.println("Car information:");
        System.out.println("Model: Porsche Boxster");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("Turbocharger: " + turbocharger.getTurbochargerType());
    }
}
