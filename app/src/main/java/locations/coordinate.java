package locations;

/**
 * Created by fatimamohamed on 5/2/18.
 */

public class coordinate {
    private String index;
    private String country;
    private String city;
    private String latitude;
    private String longitude;
    private String altitude;

    public String getIndex() {
        return this.index;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getAltitude() {
        return this.altitude;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry( String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

}