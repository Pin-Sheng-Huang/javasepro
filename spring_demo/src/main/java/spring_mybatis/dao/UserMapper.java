package spring_mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import spring_mybatis.domain.User;

import java.io.IOException;
import java.util.List;
@Mapper
public interface UserMapper {


    public List<User> findAll() throws IOException;

    public User findById(int id);

    public List<User> findByIds(List<Integer>ids);
}
