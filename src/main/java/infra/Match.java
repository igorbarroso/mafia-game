package infra;

import config.Constants;
import game.Player;
import game.Role;

import java.util.Set;
import java.util.UUID;

public class Match {
    private String id;
    private String status;
    Set<Player> players;
    Set<Role> availableRoles;

    public Match(Set<Player> players,Set<Role> availableRoles){
        this.players=players;
        this.availableRoles=availableRoles;
        this.status= Constants.MATCH_STATUS_WAITING_PLAYERS;
        this.id= UUID.randomUUID().toString();
    }

    public void start(){
        drawRoles(players,availableRoles);
        new Round();
    }

    void drawRoles(Set<Player> players,Set<Role> availableRoles){
        // TODO implement method
    };

    void addPlayer(Player player){
        players.add(player);
    }


}
