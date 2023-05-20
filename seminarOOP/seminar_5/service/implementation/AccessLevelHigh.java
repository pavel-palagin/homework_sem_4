package seminar_5.service.implementation;

import seminar_5.service.AccessLevelInt;


public class AccessLevelHigh extends AccessLevelMedium implements AccessLevelInt {
    public void work () {
        throwAwayDocument();
        goToDirector();
    }

    private void goToDirector() {
        System.out.println("Я иду с документом к директору.");
    }

}
