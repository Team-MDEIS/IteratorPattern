package com.alenasoft.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CREUserIterator implements Iterator {

    private int position;
    private LinkedHashMap<Integer, UserData> creUsers;

    public CREUserIterator() {
        this.position = 0;
        this.creUsers = new LinkedHashMap<>();
        this.creUsers.putAll(CREApi.getCREinfo());
    }

    @Override
    public boolean isDone() {
        return this.position >= this.creUsers.size();
    }

    @Override
    public String currentItem() {
        return (new ArrayList<UserData>(this.creUsers.values())).get(this.position++).toString();
    }
}
