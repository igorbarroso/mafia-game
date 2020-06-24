package game;

import static config.Constants.ROLE_ANGEL;
import static config.Constants.STATUS_ALIVE;

public class Angel extends SpecialRole{
    protected Angel(String name, String status) {
        super(ROLE_ANGEL, STATUS_ALIVE);
    }

    protected void specialVote(Player player) {
        //TODO implement method
    }

    protected void sendSpecialChat(String message) {
        //TODO implement method
    }
}
