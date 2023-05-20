package seminar_5.entity;

import seminar_5.entity.enums.AccessLevel;
import seminar_5.entity.enums.Position;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;

    private Position position;
    private AccessLevel accessLevel;
    private int salary;

    public Employee(String name, int salary, Position position, AccessLevel accessLevel) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getName();
    }
}
