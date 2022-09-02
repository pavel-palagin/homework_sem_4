package seminarOOP.seminar_1.geotree;

import java.util.ArrayList;
import java.util.List;

public class tree {
    public static void main(String[] args) {

        Person human1 = new Person("Vasya", "Chernov", 25, SexType.MAN);
        Person human2 = new Person("Kate", "Chernova", 59, SexType.WOMAN);
        Person human3 = new Person("Aleksandr", "Chernov", 60, SexType.MAN);
        Person human4 = new Person("Mary", "Chernova", 2, SexType.WOMAN);
        Person human5 = new Person("Lena", "Chernova", 25, SexType.WOMAN);
        Person human6 = new Person("Olga", "Frolova", 50, SexType.WOMAN);


        Relation relation1 = new Relation(human1, human2, RelationType.SON);
        Relation relation2 = new Relation(human1, human4, RelationType.FATHER);
        Relation relation3 = new Relation(human1, human5, RelationType.HUSBAND);
        Relation relation4 = new Relation(human2, human3, RelationType.WIFE);
        Relation relation5 = new Relation(human2, human4, RelationType.GRANDMA);
        Relation relation6 = new Relation(human2, human5, RelationType.MOTHER_IN_LAW);
        Relation relation7 = new Relation(human2, human6, RelationType.SISTER);


//        Relation relation1 = new Relation(human1, human4, RelationType.PARENT);
//        Relation relation2 = new Relation(human5, human4, RelationType.PARENT);
//        Relation relation3 = new Relation(human3, human1, RelationType.PARENT);
//        Relation relation4 = new Relation(human2, human1, RelationType.PARENT);
//        Relation relation5 = new Relation(human1, human3, RelationType.SON);
//        Relation relation6 = new Relation(human1, human2, RelationType.SON);
//        Relation relation7 = new Relation(human4, human1, RelationType.DAUGHTER);
//        Relation relation8 = new Relation(human4, human5, RelationType.DAUGHTER);
//        Relation relation9 = new Relation(human5, human1, RelationType.HUSBAND);

        Research getAllRelation = new Research();
        getAllRelation.allRelation.addAll(List.of(relation1,relation2, relation3, relation4, relation5, relation6, relation7));


       System.out.println(getAllRelation.findRelation("Mary", RelationType.DAUGHTER));



    }

}
