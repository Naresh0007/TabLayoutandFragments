package com.naresh.tablayoutandfragments.Implementation;

import com.naresh.tablayoutandfragments.model.Datastore;

public class ClassInterface implements TabLayout {
    static String names, password;

    @Override
    public boolean adduser(Datastore dc) {
        boolean b;
        if ((!dc.getPassword().isEmpty()) && (!dc.getName().isEmpty())) {
            names = dc.getName();
            password = dc.getPassword();
            b = true;
        } else {
            b = false;
        }
        return b;
    }
    @Override
    public boolean Checkuser(String name, String password) {
        boolean b = false;
        try{  if (names.equals(name)&&(password.equals(password))) {
            b = true;
        } else {
            b = false;
        }}catch (Exception ex){
            ex.printStackTrace();
        }
        return b;
    }
}
