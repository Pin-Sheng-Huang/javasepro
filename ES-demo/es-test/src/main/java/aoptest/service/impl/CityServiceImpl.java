package aoptest.service.impl;


import aoptest.domain.City;
import aoptest.service.CityService;
import aoptest.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public void save(City acc) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(City account) {

    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public City findById(Integer id) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(CityDao.class);
    }

}
