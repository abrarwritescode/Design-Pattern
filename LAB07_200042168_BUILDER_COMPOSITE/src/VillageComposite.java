import java.util.ArrayList;
import java.util.List;
public class VillageComposite implements VillageComponent{
    private final List<VillageComponent> villageComponents =new ArrayList<>();
    public void addComponent(VillageComponent component){
        villageComponents.add(component);
    }
    @Override
    public void display() {
        for(VillageComponent comp :villageComponents){
            comp.display();
        }

    }
}
