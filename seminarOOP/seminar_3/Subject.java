package seminar_3;

import java.util.HashMap;
import java.util.Map;

public class Subject {

    private String name;
    private Integer keyHuman;
    public Subject(String name) {
        this.name = name;

    }

    public Subject(String name, Integer keyHuman) {
        this.name = name;
        this.keyHuman = keyHuman;

    }

    public String getName() {
        return name;
    }

    public Integer getKeyHuman() {
        return keyHuman;
    }
}
