package seminar_2.Animals;

public class Cat extends Animal {
    public Cat(String nickname){

        super(nickname);
    }

    @Override
    public void Voice() {
        System.out.println("Meow");
    }

    @Override
    public void Pet() {
        System.out.println("Purr");
    }

    @Override
    public void ordinaryActivity() {
        System.out.println("Sleep");
    }


}
