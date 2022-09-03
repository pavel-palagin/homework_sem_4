package seminarOOP.seminar_2;

import seminarOOP.seminar_2.Animals.Animal;
import seminarOOP.seminar_2.Animals.Cat;
import seminarOOP.seminar_2.Animals.Dog;
import seminarOOP.seminar_2.Human.Human;
import seminarOOP.seminar_2.Human.RelationHumanAnimal;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Max");
        Animal animalCat = new Cat("Milka");
        Animal animalDog = new Dog("Reks");

        RelationInterface relation = new RelationHumanAnimal();

        relation.addAnimalToHuman(human1, animalCat);
        relation.addAnimalToHuman(human1, animalDog);

        System.out.println(relation.returnAnimalByHuman(human1));

        Cat getVoice = new Cat("Milka");
        getVoice.Voice();



//        System.out.println(Test(animalCat, Cat.class));
    }

//    public static boolean Test(Animal animal, Class<?> class1) {
//        return class1.isInstance(animal);
//    }
}