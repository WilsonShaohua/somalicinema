package com.xhu.po;

public class ActorOccupationalKey {
    private String actorId;

    private String occupationalId;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId == null ? null : actorId.trim();
    }

    public String getOccupationalId() {
        return occupationalId;
    }

    public void setOccupationalId(String occupationalId) {
        this.occupationalId = occupationalId == null ? null : occupationalId.trim();
    }
}