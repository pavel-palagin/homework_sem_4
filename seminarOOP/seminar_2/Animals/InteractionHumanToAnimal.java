package seminar_2.Animals;




import java.util.ArrayList;
import java.util.List;

public class InteractionHumanToAnimal {
    List<Dog> getDogs = new ArrayList<>();

    public void CommandToAnimal(String nickname, Commands commands){
        for (Dog dogs : getDogs) {
            if(dogs.getNickname().equals(nickname) && commands == Commands.COMETOME){
                System.out.println(dogs.getNickname() + " run to human");
            }

        }

    }

}
