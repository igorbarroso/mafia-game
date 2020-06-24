package game;

import config.Constants;

public class Victim extends Role{

    protected Victim(String name, String status) {
        super(Constants.ROLE_VICTIM, Constants.STATUS_ALIVE);
    }
}
