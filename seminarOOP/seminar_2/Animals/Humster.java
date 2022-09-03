package seminarOOP.seminar_2.Animals;

public class Humster extends  Animal {
    public Humster(String nickname){

        super(nickname);
    }

    @Override
    void Voice() {

    }

    @Override
    void Pet() {

    }

    @Override
    void ordinaryActivity() {
        System.out.println("Run in wheel");
    }
}
