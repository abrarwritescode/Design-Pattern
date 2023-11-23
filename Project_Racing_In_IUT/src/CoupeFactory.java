public class CoupeFactory implements CarFactory{
    @Override
    public Car createCar(String carModel) {
        switch (carModel) {
            case "ToyotaGR86":
                return new ToyotaGR86();
            case "SubaruBRZ":
                return new SubaruBRZ();

            default:
                return null;
        }
    }
}
