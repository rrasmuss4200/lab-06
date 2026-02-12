package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = this.cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method tells us if a city is in the list
     * @return bool saying if it's in the list
     * @param city city to check if it's in the list
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city if it's in the list
     * @param city city to delete
     * @throws Exception saying there's no city called that to delete
     */
    public void delete(City city) throws Exception {
        boolean rmd = cities.remove(city);
        if (!rmd) {
            throw new Exception("No city named that to remove");
        }
    }

    /**
     *
     * @return int containing number for
     */
    public int getSize() {
        return cities.size();
    }
}

