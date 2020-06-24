package game;

import config.Constants;

public abstract class Role {
    private String name;
    private String status;
    private int votes;

    protected Role(String name, String status) {
        this.votes=0;
        this.name=name;
        this.status = status;
    }

    public void sendPublicChat(String message){
        //TODO implement method
    }
    public void vote(Player player){
        // TODO implement method
    }

    public void updateStatus(String newStatus) {
        this.status=newStatus;
    }

    public void receiveVote() {
        this.votes+=1;
    }

    public void clearVotes() {
        this.votes=0;
    }

    public boolean isStillPlaying(){
        return this.status.equals(Constants.STATUS_ALIVE);
    }
}
