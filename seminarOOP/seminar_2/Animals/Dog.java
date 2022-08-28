package seminarOOP.seminar_2.Animals;

public class Dog extends  Animal{
    public Dog(String nickname){
        super(nickname);
    }

    @Override
    public void Voice() {
        System.out.println("Woof");
    }


}
