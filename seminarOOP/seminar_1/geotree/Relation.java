package seminarOOP.seminar_1.geotree;

public class Relation {
    Person member1;
    Person member2;
    RelationType relationType;

    public Relation(Person member1, Person member2, RelationType relationType) {
        this.member1 = member1;
        this.member2 = member2;
        this.relationType = relationType;
    }



    @Override
    public String toString() {
        return "Relation{" +
                "member1=" + member1.getName() +
                ", member2=" + member2.getName() +
                ", relationType=" + relationType +
                '}';
    }
}
