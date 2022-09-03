package seminarOOP.seminar_2.Animals;

public abstract class Animal {
    private String nickname;

    public Animal(String nickname){
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }

    abstract void Voice();

    @Override
    public String toString() {
        return this.getClass().getName() + " " + nickname;
    }
}