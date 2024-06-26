public class VillageBuilder {
    private final VillageComposite village = new VillageComposite();

    public void buildHouse(String type) {
        village.addComponent(new House(type));
    }

    public void buildTree(String type) {
        village.addComponent(new Tree(type));
    }

    public void buildWaterSource(String type) {
        village.addComponent(new WaterSource(type));
    }

    public VillageComposite buildVillage() {

        return village;
    }
}
