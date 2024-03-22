public class Tree implements VillageComponent{
    private String type;

    @Override
    public void display() {
        System.out.println("Tree:" +type);


    }

    public Tree(String type){
        this.type=type;
    }
}
