package seminar_5.service.implementation;

import seminar_5.service.AccessLevelInt;


public class AccessLevelMedium extends AccessLevelLow implements AccessLevelInt {
    public  void  work() {
        throwAwayDocument ();
    }

    void throwAwayDocument() {
        System.out.println("Я выбрасываю документ.");
    }
}
