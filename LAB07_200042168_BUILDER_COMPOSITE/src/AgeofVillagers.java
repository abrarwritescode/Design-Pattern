import java.util.List;
import java.util.ArrayList;
public class AgeofVillagers {
    public static void main(String[] args){
        VillageBuilder builder =new VillageBuilder();
        builder.buildHouse("Mud House");
        builder.buildTree("Banana Tree");
        builder.buildWaterSource("Pond");
        VillageComposite village1 =builder.buildVillage();
        village1.display();


        VillageBuilder builder1=new VillageBuilder();
        builder1.buildHouse("Brick House");
        builder1.buildTree("Mango Tree");
        builder1.buildWaterSource("Swimming Pool");
        VillageComposite village2=builder1.buildVillage();
        village2.display();

    }
}
