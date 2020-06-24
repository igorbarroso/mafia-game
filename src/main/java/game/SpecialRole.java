package game;

public abstract class SpecialRole extends Role {
    private String specialAction;

    protected SpecialRole(String name,String status) {
        super(name,status);
    }

    protected abstract void specialVote(Player player);
    protected abstract void sendSpecialChat(String message);

}
