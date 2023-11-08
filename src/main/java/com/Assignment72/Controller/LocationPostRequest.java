package com.Assignment72.Controller;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class LocationPostRequest {

    @Range(min = 100000, max = 999999)//店舗コードの範囲を指定
    private Integer LocationID;
    @NotBlank//null　空白でないことを検証
    private String store;
    @NotBlank//null　空白でないことを検証
    private String Manager;

    public LocationPostRequest(Integer locationID, String store, String manager) {
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
