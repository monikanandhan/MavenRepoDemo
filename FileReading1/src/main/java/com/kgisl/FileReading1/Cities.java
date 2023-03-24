package com.kgisl.FileReading1;

import com.opencsv.bean.CsvBindByPosition;

public class Cities {
    @CsvBindByPosition(position = 0)
    String city;
    @CsvBindByPosition(position = 1)
    String city_ascii;
    @CsvBindByPosition(position = 2)
    String lat;
    @CsvBindByPosition(position = 3)
    String lng;
    @CsvBindByPosition(position = 4)
    String country;
    @CsvBindByPosition(position = 5)
    String iso2;
    @CsvBindByPosition(position = 6)
    String iso3;
    @CsvBindByPosition(position = 7)
    String admin_name;
    @CsvBindByPosition(position = 8)
    String capital;
    @CsvBindByPosition(position = 9)
    String population;
    @CsvBindByPosition(position = 10)
    String id;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity_ascii() {
        return city_ascii;
    }
    public void setCity_ascii(String city_ascii) {
        this.city_ascii = city_ascii;
    }
    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }
    public String getLng() {
        return lng;
    }
    public void setLng(String lng) {
        this.lng = lng;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getIso2() {
        return iso2;
    }
    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }
    public String getIso3() {
        return iso3;
    }
    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }
    public String getAdmin_name() {
        return admin_name;
    }
    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getPopulation() {
        return population;
    }
    public void setPopulation(String population) {
        this.population = population;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public Cities() {
    }
    public Cities(String city, String city_ascii, String lat, String lng, String country, String iso2, String iso3,
            String admin_name, String capital, String population, String id) {
        this.city = city;
        this.city_ascii = city_ascii;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.admin_name = admin_name;
        this.capital = capital;
        this.population = population;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cities [city=" + city + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", country="
                + country + ", iso2=" + iso2 + ", iso3=" + iso3 + ", admin_name=" + admin_name + ", capital=" + capital
                + ", population=" + population + ", id=" + id + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cities other = (Cities) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (city_ascii == null) {
            if (other.city_ascii != null)
                return false;
        } else if (!city_ascii.equals(other.city_ascii))
            return false;
        if (lat == null) {
            if (other.lat != null)
                return false;
        } else if (!lat.equals(other.lat))
            return false;
        if (lng == null) {
            if (other.lng != null)
                return false;
        } else if (!lng.equals(other.lng))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (iso2 == null) {
            if (other.iso2 != null)
                return false;
        } else if (!iso2.equals(other.iso2))
            return false;
        if (iso3 == null) {
            if (other.iso3 != null)
                return false;
        } else if (!iso3.equals(other.iso3))
            return false;
        if (admin_name == null) {
            if (other.admin_name != null)
                return false;
        } else if (!admin_name.equals(other.admin_name))
            return false;
        if (capital == null) {
            if (other.capital != null)
                return false;
        } else if (!capital.equals(other.capital))
            return false;
        if (population == null) {
            if (other.population != null)
                return false;
        } else if (!population.equals(other.population))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
  
    
    
    
}
