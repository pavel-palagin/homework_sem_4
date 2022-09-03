package seminarOOP.seminar_3;

import java.util.List;

public class WardrobeService implements Action{
    @Override
    public void Open() {
        System.out.println("Door is open");
    }

    @Override
    public void Close() {
        System.out.println("Door is close");
    }

    @Override
    public boolean isOpen(Wardrobe wardrobe) {
        return wardrobe.isOpen();
    }

    public void putItem(Wardrobe wardrobe, Human human, String item){
       wardrobe.addItem(item);
    }
    public List<String> takeAllItem(Wardrobe wardrobe, Human human){
        return wardrobe.pullAllItemOut();
    }
}
