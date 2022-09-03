package seminarOOP.seminar_2.Animals;

public class Hamster extends  Animal {
    public Hamster(String nickname){

        super(nickname);
    }

    @Override
    void Voice() {

    }

    @Override
    void Pet() {

    }

    @Override
    public void ordinaryActivity() {
        System.out.println("Run in wheel");
    }
}
