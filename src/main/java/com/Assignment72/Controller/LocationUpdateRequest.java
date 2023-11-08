package com.Assignment72.Controller;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class LocationUpdateRequest {
    @Range(min = 100000, max = 999999)
    private Integer LocationID;
    @NotBlank
    private String store;
    @NotBlank
    private String Manager;

    public LocationUpdateRequest(Integer locationID, String store, String manager) {
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
