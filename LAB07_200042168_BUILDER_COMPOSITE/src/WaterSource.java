public class WaterSource implements VillageComponent{

    private final String type;

    @Override
    public void display() {
        System.out.println("Water -Source :" +type);


    }

    public WaterSource(String type){
        this.type=type;
    }
}
