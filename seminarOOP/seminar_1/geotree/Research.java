package seminarOOP.seminar_1.geotree;

import java.util.ArrayList;
import java.util.List;

public class Research {
    List<Relation> getRelation = new ArrayList<>();
//    List<RelationType> allRelation = new ArrayList<>();

//    public List<Person> findRelation(String name, RelationType type){
//        List<Person> result = new ArrayList<>();
//        for (Relation relation : getRelation) {
//            if(relation.member1.getName().equals(name) && relation.relationType == type){
//
//                result.add(relation.member2);
//            }
//        }
//        return result;
//    }

    public List<Person> findAllRelation(String name, RelationType type){
        List<Person> result = new ArrayList<>();
        for (Relation relation : getRelation) {
            if(relation.member1.getName().equals(name)
                    && relation.relationType == type){

                result.add(relation.member2);
            }

            if (relation.member2.getName().equals(name)
                    && (type == RelationType.DAUGHTER
                        || type == RelationType.WIFE
                        || type == RelationType.HUSBAND
                        || type == RelationType.NEPHEW
                        || type == RelationType.AUNT)){

                    result.add(relation.member1);

            }

        }
        return result;
    }

}
