package seminar_3.Wardrobe;

import seminar_3.Action;
import seminar_3.Subject;

import java.util.ArrayList;
import java.util.List;

public class WardrobeService implements Action {
    @Override
    public void Open(Wardrobe wardrobe) {
        System.out.println("Дверь открыта");
    }

    @Override
    public void Open(Wardrobe wardrobe, Subject human) {
        Integer key1 = wardrobe.getKeySafe();
        Integer key2 = human.getKeyHuman();
        if (key1 == key2){
            System.out.println("Дверь открыта");
        }else {
            System.out.println("Дверь закрыта");
        }
    }


    @Override
    public void Close(Wardrobe wardrobe) {
        System.out.println("Дверь закрыта");
    }

    @Override
    public boolean isOpen(Wardrobe wardrobe) {
        return wardrobe.isOpen();
    }

    public void putItem(Wardrobe wardrobe, Subject human, String item){
       wardrobe.addItem(item);
    }

    public void getItem(Wardrobe wardrobe, Subject human, String item){
        wardrobe.getItemList(item);
    }

    public List<String> takeAllItem(Wardrobe wardrobe, Subject human){
        return wardrobe.pullAllItemsOut();
    }


}
