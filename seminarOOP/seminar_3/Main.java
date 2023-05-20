package seminar_3;

import seminar_3.Wardrobe.Type;
import seminar_3.Wardrobe.Wardrobe;
import seminar_3.Wardrobe.WardrobeService;

public class Main {
    public static void main(String[] args) {
        WardrobeService wardrobeService = new WardrobeService();

        Subject father = new Subject("Max", 123);
        Subject mother = new Subject("Lena", 123);
        Subject son = new Subject("Sasha", 0);
        Subject daughter = new Subject("Mary", 0);


        Wardrobe bookshelf = new Wardrobe(Type.BOOKSHELF);
        Wardrobe cupboard = new Wardrobe(Type.CUPBOARD);
        Wardrobe wardrobe = new Wardrobe(Type.WARDROBE);
        Wardrobe safe = new Wardrobe(Type.SAFE, 123);


        wardrobeService.putItem(bookshelf, father, "book");
        wardrobeService.putItem(bookshelf, daughter, "magazine");
        wardrobeService.putItem(bookshelf, son, "textbook");
        wardrobeService.getItem(bookshelf, mother, "book");

        wardrobeService.Open(safe, son);

        System.out.println(bookshelf.getItemList(""));






    }


}
