package com.Assignment72.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @GetMapping("/locations")//GETの実装
    public List<LocationResponse> LocationList(LocationResponse locationResponse) {
        List<LocationResponse> LocationList = List.of(
                new LocationResponse(123456, "新宿店", "田中"),
                new LocationResponse(123457, "銀座店", "山田"),
                new LocationResponse(123123, "渋谷店", "鈴木"));

        return LocationList;

    }

    @PostMapping("/locations")//POSTの実装
    public LocationPostResponse createLocation(@RequestBody @Validated LocationPostRequest locationPostRequest) {

        return new LocationPostResponse("create a new location!");
    }

    @PatchMapping("/locations/{id}")//PATCHの実装
    public LocationUpdateResponse updateLocation(@PathVariable int id, @RequestBody @Validated LocationUpdateRequest locationUpdateRequest) {
        return new LocationUpdateResponse("a location is update!");
    }

    @DeleteMapping("/locations/delete")//DELETEの実装
    public LocationDeleteResponse deleteLocation(@RequestBody LocationDeleteRequest locationDeleteRequest) {
        return new LocationDeleteResponse("a location is deleted!");
    }

}
