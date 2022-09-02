package seminarOOP.seminar_1.geotree;

public class Person {
    private String name;
    private String surname;
    private int age;
    private SexType sex;

    public Person(String name, String surname, int age, SexType sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Person{" +
                "name= " + name + ' ' +
                surname +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }





//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + ' ' +
//                surname +
//                ", age=" + age +
//                ", sex=" + sex +
//                '}';
//    }

}

