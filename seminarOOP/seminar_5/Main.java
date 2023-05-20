package seminar_5;


import seminar_5.entity.Employee;
import seminar_5.entity.enums.AccessLevel;
import seminar_5.entity.enums.Position;
import seminar_5.service.implementation.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasya", 23, Position.DRIVER, AccessLevel.HIGH);
        Employee employee2 = new Employee("Petya", 23, Position.MANAGER, AccessLevel.MEDIUM);

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.work(employee);
        employeeService.work(employee2);

    }
}
