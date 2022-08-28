package seminarOOP.seminar_2.Human;

import seminarOOP.seminar_2.Animals.Animal;
import seminarOOP.seminar_2.RelationInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelationHumanAnimal implements RelationInterface {
    private Map<Human, List<Animal>> humanToAnimal;

    public RelationHumanAnimal() {
        humanToAnimal = new HashMap<>();
    }


    @Override
    public void addAnimalToHuman(Human human, Animal animal){

        if(humanToAnimal.containsKey(human)){
            humanToAnimal.get(human).add(animal);
        }else{
            List<Animal> toAdd = new ArrayList<>();
            toAdd.add(animal);
            humanToAnimal.put(human, toAdd);
        }
    }

    @Override
    public List<Animal> returnAnimalByHuman(Human human) {
        return humanToAnimal.get(human);
    }
}
