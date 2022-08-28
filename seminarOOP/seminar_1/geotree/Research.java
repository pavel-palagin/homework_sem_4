package seminarOOP.seminar_1.geotree;

import java.util.ArrayList;
import java.util.List;

public class Research {
    List<Relation> allRelation = new ArrayList<>();

    public List<Person> findRelation(String name, RelationType type){
        List<Person> result = new ArrayList<>();
        for (Relation relation : allRelation) {
            if(relation.member1.getName().equals(name) && relation.relationType == type){
                result.add(relation.member2);
            }

        }
        return result;
    }


}
