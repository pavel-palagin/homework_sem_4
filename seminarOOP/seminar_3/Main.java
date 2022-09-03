package seminarOOP.seminar_3;

public class Main {
    public static void main(String[] args) {
        WardrobeService wardrobeService = new WardrobeService();

        Human human = new Human("Max");
        Wardrobe wardrobe = new Wardrobe(Color.BLACK);

        wardrobeService.putItem(wardrobe, human, "Book");
        System.out.println(wardrobe.getItemsList());

        System.out.println(wardrobeService.takeAllItem(wardrobe, human));
        System.out.println(wardrobe.getItemsList());


    }


}
