package com.Assignment72.Controller;

public class LocationDeleteRequest {
    private Integer LocationID;
    private String store;
    private String Manager;

    public LocationDeleteRequest(Integer locationID, String store, String manager) {
        LocationID = locationID;
        this.store = store;
        Manager = manager;
    }

    public Integer getLocationID() {
        return LocationID;
    }

    public String getStore() {
        return store;
    }

    public String getManager() {
        return Manager;
    }

}

