package game;

import config.Constants;

import static config.Constants.STATUS_ALIVE;

public class Killer extends SpecialRole {
    protected Killer(String name, String status) {
        super(Constants.ROLE_KILLER, STATUS_ALIVE);
    }

    protected void specialVote(Player player) {
        //TODO implement method
    }

    protected void sendSpecialChat(String message) {
        //TODO implement method
    }
}
