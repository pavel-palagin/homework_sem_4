package seminar_5.service.implementation;

import seminar_5.service.AccessLevelInt;


public class AccessLevelLow implements AccessLevelInt {
    public void work() {
        workWithDocuments();
    }

    void workWithDocuments() {
        System.out.println("Я работаю с документом.");
    }
}
