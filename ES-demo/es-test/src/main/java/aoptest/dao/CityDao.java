package aoptest.dao;

import aoptest.config.SpringConfig;
import aoptest.domain.City;
import org.apache.ibatis.annotations.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

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
//@Mapper
@Component
@Repository
public interface CityDao {

    @Insert("INSERT INTO city (Name, CountryCode, District) VALUES (#{name}, #{countryCode}, #{district})")
    void save(City city);

    @Delete("DELETE FROM city WHERE ID = #{id}")
    void delete(Integer id);

    @Update("UPDATE city SET Name = #{name}, CountryCode = #{countryCode}, District = #{district} WHERE ID = #{id}")
    void update(City city);

    @Select("SELECT * FROM city")
    List<City> findAll();

    @Select("SELECT * FROM city WHERE ID = #{id}")
    City findById(Integer id);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CityDao cityDao = context.getBean(CityDao.class);

        List<City> cities = cityDao.findAll();
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
