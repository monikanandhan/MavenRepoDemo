public class Cities {
    String city;
    String city_ascii;
    double lat;
    double lng;
    String country;
    String iso2;
    String iso3;
    String admin_name;
    String capital;
    long population;
    long id;
    
    public Cities() {
    }
    public Cities(String city, String city_ascii, double lat, double lng, String country, String iso2, String iso3,
            String admin_name, String capital, long population, long id) {
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
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() {
        return lng;
    }
    public void setLng(double lng) {
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
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cities [city=" + city + ", city_ascii=" + city_ascii + ", lat=" + lat + ", lng=" + lng + ", country="
                + country + ", iso2=" + iso2 + ", iso3=" + iso3 + ", admin_name=" + admin_name + ", capital=" + capital
                + ", population=" + population + ", id=" + id + "]";
    }
    

}
