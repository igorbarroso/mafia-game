package game;

import config.Constants;

import static config.Constants.STATUS_ALIVE;

public class Detective extends SpecialRole {
    protected Detective(String name, String status) {
        super(Constants.ROLE_DETECTIVE, STATUS_ALIVE);
    }

    protected void specialVote(Player player) {
        //TODO implement method
    }

    protected void sendSpecialChat(String message) {
        //TODO implement method
    }
}
