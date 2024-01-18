package aoptest.domain;
/**
 CREATE TABLE `city` (
 `ID` int NOT NULL AUTO_INCREMENT,
 `Name` char(35) NOT NULL DEFAULT '',
 `CountryCode` char(3) NOT NULL DEFAULT '',
 `District` char(20) NOT NULL DEFAULT '',
 `Population` int NOT NULL DEFAULT '0',
 PRIMARY KEY (`ID`),
 KEY `CountryCode` (`CountryCode`),
 CONSTRAINT `city_ibfk_1` FOREIGN KEY (`CountryCode`) REFERENCES `country` (`Code`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4080 DEFAULT CHARSET=latin1
 */

public class City {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City() {
        // 默认构造函数
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    // toString 方法

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

}
