package spring_mybatis.src.main.java.spring_mybatis.dao;

import spring_mybatis.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    public List<User> findAll() throws IOException;
}
