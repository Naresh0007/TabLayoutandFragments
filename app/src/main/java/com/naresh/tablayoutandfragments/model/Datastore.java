package com.naresh.tablayoutandfragments.model;

public class Datastore {
    private String name;
    private String password;
    private String logname;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLogname() {
        return logname;
    }

    public void Datastores(String name, String password, String logname) {
        this.name = name;
        this.password = password;
        this.logname = logname;
    }


}
