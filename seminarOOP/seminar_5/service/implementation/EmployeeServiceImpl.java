package seminar_5.service.implementation;


import seminar_5.entity.Employee;
import seminar_5.entity.enums.AccessLevel;
import seminar_5.repository.EmployeeRepository;
import seminar_5.service.AccessLevelInt;

public class EmployeeServiceImpl {
    private EmployeeRepository employeeRepository;

    public void work(Employee employee){
        System.out.println("Я - " + employee);
        AccessLevelInt accessLevel = null;
        if (employee.getAccessLevel() == AccessLevel.LOW) {
            accessLevel = new AccessLevelLow();
        }
        else if (employee.getAccessLevel() == AccessLevel.MEDIUM) {
            accessLevel = new AccessLevelMedium();
        }
        else if (employee.getAccessLevel() == AccessLevel.HIGH) {
            accessLevel = new AccessLevelHigh();
        }
        if (accessLevel != null) accessLevel.work();
    };
}
