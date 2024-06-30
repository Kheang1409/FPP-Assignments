package assignment02.Prog1;

public class Address {
    private String street, city, state, zip;
    public Address(String str, String c, String sta, String zi) {
        street = str;
        city = c;
        state = sta;
        zip = zi;
    }



    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return STR."\{street}, \{city}, \{state} \{zip}";

    }

}
