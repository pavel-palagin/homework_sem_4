package seminarOOP.seminar_2;

import seminarOOP.seminar_2.Animals.Animal;
import seminarOOP.seminar_2.Human.Human;

import java.util.List;

public interface RelationInterface {
    void addAnimalToHuman(Human human, Animal animal);
    List<Animal> returnAnimalByHuman(Human human);
}
