public class House implements VillageComponent{

    private final String type;

    @Override
    public void display() {
        System.out.println("House:" +type);


    }

    public House(String type){

        this.type=type;
    }
}
