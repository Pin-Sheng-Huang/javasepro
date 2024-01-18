package aoptest.service;

import aoptest.domain.City;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-15 18:07
 * @LastEditTime: 2023-07-15 18:07
 */
@Service
public interface CityService {
    void save(City city);

    void delete(Integer id);

    void update(City city);

    List<City> findAll();

    City findById(Integer id);
}
