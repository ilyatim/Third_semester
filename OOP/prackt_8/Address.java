package prackt_8;

public class Address
{
    private String cityName; // city name
    private int zipCode; // zip code of u're city
    private String streetName; // street name
    private int buildingNumber; // number of u're house
    private char buildingLetter; // house buildings number
    private int apartmentNumber; // apartment number
    public final Address EMPTY_ADDRESS = null; // empty address


    public Address()
    {
        this.cityName = null;
        this.zipCode = -1;
        this.streetName = null;
        this.buildingNumber = -1;
        this.buildingLetter = 0;
        this.apartmentNumber = -1;
    }
    public Address(String streetName, int buildingNumber, char buildingLetter, int apartmentNumber)
    {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
        this.cityName = "Samara";
        this.zipCode = -1;
    }
    public Address(String city, int code, String street, int buildingNumber, char buildingLetter, int apartment)
    {
        this.cityName = city;
        this.zipCode = code;
        this.streetName = street;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartment;
    }

    public String getCityName()
    {
        return cityName;
    }
    public int getZipCode()
    {
        return zipCode;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public int getBuildingNumber()
    {
        return buildingNumber;
    }
    public char getBuildingLetter()
    {
        return buildingLetter;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }


    // override method "toString"
    @Override
    public String toString()
    {
        return "Adress:" + cityName + zipCode + "," + streetName + buildingNumber + buildingLetter + "-" + apartmentNumber;
    }
    // compare objects
    @Override
    public boolean equals(Object object)
    {
        if(object == null || object.getClass() != this.getClass())
            return false;
        if(object == this)
            return true;
        else
            return false;
    }
    // hash code of u're object
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + cityName.hashCode();
        result = prime * result + zipCode;
        result = prime * result + streetName.hashCode();
        result = prime * result + buildingNumber;
        result = prime * result + buildingLetter;
        result = prime * result + apartmentNumber;
        return result;
    }
}

