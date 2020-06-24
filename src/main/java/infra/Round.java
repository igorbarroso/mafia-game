package infra;

import game.Player;
import game.Role;

import java.util.Set;

public class Round {
    private String status;
    private Role prospectedKill;
    private Role prospectedSuspect;
    private Role prospectedSafe;

    void init(Set<Player> playerSet){
        for (Player p:playerSet){
            p.getRole().clearVotes();
        }
    }
}
