package spring_mybatis.dao.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import spring_mybatis.dao.UserMapper;
import spring_mybatis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-16 13:11
 * @LastEditTime: 2023-07-16 13:11
 */

public class UserMapperImpl implements UserMapper {
    @Autowired
    public UserMapper userMapper;
    @Override
    public List<User> findAll() throws IOException {
        InputStream ras = Resources.getResourceAsStream("sqlMapconfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ras);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("");
        return null;
    }

    @Override
    public User findById(int id) {
        User byId = userMapper.findById(id);
        return byId;
    }

    @Override
    public List<User> findByIds(List<Integer> ids) {
        return null;
    }
}
