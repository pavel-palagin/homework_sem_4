package seminar_3.Wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private static Integer countid = 0;
    private Integer id;
    private Type purpose;
    private Integer keyWardrobe;
    private List<String> itemsList;
    private boolean isOpen;

    public Integer getId() {
        return id;
    }


    public Wardrobe(Type purpose) {
        this.id = ++countid;
        this.purpose = purpose;
        this.itemsList = new ArrayList<>();
        this.isOpen = false;
    }

    public Wardrobe(Type purpose, Integer keySafe) {
        this.id = ++countid;
        this.purpose = purpose;
        this.keyWardrobe = keyWardrobe;
        this.itemsList = new ArrayList<>();
        this.isOpen = false;

    }

    public Integer getKeySafe() {
        return keyWardrobe;
    }


    public void addItem(String item){
        itemsList.add(item);
    }

    public List<String> getItemList(String item) {
        itemsList.remove(item);
        return itemsList;
    }

    public List<String> pullAllItemsOut(){
        String item = null;
        List<String> result = new ArrayList<>(getItemList(item)) ;

        itemsList.clear();
        return result;
    }


    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
