package com.Interface.Interface8.MarkerInterface.ownmarkerinterface;

public class User implements Cleanable{
    String userName;
    String id;

    public User(String id, String userName){
        this.id = id;
        this.userName = userName;
    }
}
