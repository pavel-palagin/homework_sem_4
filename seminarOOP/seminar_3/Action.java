package seminar_3;

import seminar_3.Wardrobe.Wardrobe;

public interface Action {
    void Open(Wardrobe wardrobe);
    void Open(Wardrobe wardrobe, Subject human);
    void Close(Wardrobe wardrobe);
    boolean isOpen(Wardrobe wardrobe);
}
