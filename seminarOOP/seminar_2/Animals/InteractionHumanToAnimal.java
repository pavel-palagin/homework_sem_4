package seminarOOP.seminar_2.Animals;


import seminarOOP.seminar_1.geotree.Person;
import seminarOOP.seminar_1.geotree.Relation;
import seminarOOP.seminar_2.Human.RelationHumanAnimal;
import seminarOOP.seminar_2.RelationInterface;

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
