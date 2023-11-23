
// Concrete factory for creating Roadster cars
public class RoadsterFactory implements CarFactory{
    @Override
    public Car createCar(String carModel) {
        switch (carModel) {
            case "PorscheBoxster":
                return new PorscheBoxster();
            case "Ferrari812":
                return new Ferrari812();
            default:
                return null;
        }
    }
}
