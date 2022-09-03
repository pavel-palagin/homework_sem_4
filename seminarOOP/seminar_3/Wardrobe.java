package seminarOOP.seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private static Integer countid = 0;
    private Integer id;
    private Color color;
    private List<String> itemsList;
    private boolean isOpen;

    public Integer getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public Wardrobe(Color color) {
        this.id = ++countid;
        this.color = color;
        this.itemsList = new ArrayList<>();
        this.isOpen = false;
    }

    public void addItem(String item){
        itemsList.add(item);
    }

    public List<String> getItemsList() {
        return itemsList;
    }

    public List<String> pullAllItemOut(){
        List<String> result = new ArrayList<>(getItemsList()) ;

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
