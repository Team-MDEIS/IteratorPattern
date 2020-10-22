package com.alenasoft.behavioral.iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CREApi {

    public static HashMap<Integer, UserData> getCREinfo(){
        HashMap<Integer, UserData> users = new HashMap<Integer, UserData>();
        users.put(1, new UserData("Adan", "Los Lotes",10f));
        users.put(2, new UserData("Pedro", "Plan 3000",20f));
        return users;
    }


}
