package com.example.code;


/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCity());
    }
}

