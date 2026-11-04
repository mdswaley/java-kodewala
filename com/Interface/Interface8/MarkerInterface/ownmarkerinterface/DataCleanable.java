package com.Interface.Interface8.MarkerInterface.ownmarkerinterface;

import Operators.OnlineDelivery;

public class DataCleanable {
    public void clean(Object obj){
        if (obj instanceof Cleanable){
            System.out.println("Allow to clean the data..");
        }else{
            System.err.println("Not allowed to clean the data..");
        }
    }
}
