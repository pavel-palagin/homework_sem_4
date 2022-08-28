package seminarOOP.seminar_2.Animals;

public class Cat extends Animal {
    public Cat(String nickname){
        super(nickname);
    }

    @Override
    public void Voice() {
        System.out.println("Meow");

    }


}
