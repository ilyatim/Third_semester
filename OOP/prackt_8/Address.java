package prackt_8;

public class Address
{
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    public final Address EMPTY_ADDRESS = null;

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
    int getZipCode()
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
}

