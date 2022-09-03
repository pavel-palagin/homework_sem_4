package seminarOOP.seminar_2.Animals;

public class Dog extends Animal{
    public Dog(String nickname){

        super(nickname);
    }

    @Override
    public void Voice() {

        System.out.println("Woof");
    }

    @Override
    public void Pet() {
        System.out.println("Wag the tail");
    }

    @Override
    void ordinaryActivity() {
        System.out.println("Gnaw a bone");
    }


}
