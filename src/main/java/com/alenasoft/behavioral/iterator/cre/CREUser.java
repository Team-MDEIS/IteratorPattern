package com.alenasoft.behavioral.iterator.cre;

public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    @Override
    public String toString() {
        return String.format("id: %i UserData: %s", this.id, this.userData);
    }
}
