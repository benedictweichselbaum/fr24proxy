package weichselbaum.fr24proxy.boundary.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Flight {

    @JsonProperty("call_sign")
    private String callSign;

    @JsonProperty("altitude")
    private Number altitude;

    @JsonProperty("latitude")
    private Number latitude;

    @JsonProperty("longitude")
    private Number longitude;

    @JsonProperty("squawk")
    private String squawk;

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public void setAltitude(Number altitude) {
        this.altitude = altitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public String getCallSign() {
        return callSign;
    }

    public Number getAltitude() {
        return altitude;
    }

    public Number getLatitude() {
        return latitude;
    }

    public Number getLongitude() {
        return longitude;
    }

    public String getSquawk() {
        return squawk;
    }
}
