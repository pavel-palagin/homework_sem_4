package seminarOOP.geotree;

import java.util.List;

public class tree {
    public static void main(String[] args) {

        Person human1 = new Person("Max", "Чернов", 25, SexType.MAN);
        Person human2 = new Person("Bob", "Чернов", 60, SexType.MAN);
        Person human3 = new Person("Kate", "Чернова", 59, SexType.WOMAN);
        Person human4 = new Person("Mary", "Чернова", 2, SexType.WOMAN);
        Person human5 = new Person("Lena", "Чернова", 25, SexType.WOMAN);



        Relation relation1 = new Relation(human1, human4, RelationType.PARENT);
        Relation relation2 = new Relation(human5, human4, RelationType.PARENT);
        Relation relation3 = new Relation(human2, human1, RelationType.PARENT);
        Relation relation4 = new Relation(human3, human1, RelationType.PARENT);
        Relation relation5 = new Relation(human1, human2, RelationType.CHILD);
        Relation relation6 = new Relation(human1, human3, RelationType.CHILD);
        Relation relation7 = new Relation(human4, human1, RelationType.CHILD);
        Relation relation8 = new Relation(human4, human5, RelationType.CHILD);

        Research allRelation = new Research();
        allRelation.allRelation.addAll(List.of(relation1, relation2, relation3, relation4, relation5, relation6, relation7, relation8));

        System.out.println(allRelation.findRelation("Max", RelationType.PARENT));
        System.out.println();
        System.out.println(allRelation.findRelation("Max", RelationType.CHILD));
    }

}
