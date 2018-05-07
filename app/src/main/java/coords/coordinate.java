package coords;

/**
 * Created by fatimamohamed on 5/2/18.
 */

public class coordinate {
    int index;
    String country;
    String city;
    double latitude;
    double longitude;
    double altitude;

    public int getIndex() {
        return this.index;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCountry( String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

}
