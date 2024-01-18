import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import spring_mybatis.dao.UserMapper;
import spring_mybatis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-16 18:31
 * @LastEditTime: 2023-07-16 18:31
 */

public class MybatisTestServic {
    @Autowired
    public UserMapper userMapper;

    public static void main(String[] args) throws IOException {
        InputStream rs = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory s = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = s.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
        System.out.println(all);
        User findbyId = mapper.findById(2);
        System.out.println(findbyId);
    //---模拟ids数据
    List<Integer> ids = new ArrayList<>();
    ids.add(2);
        List<User> byIds = mapper.findByIds(ids);
        System.out.println(byIds);
    }
//    public User findById(int id) {
//        UserMapper userMapper = new UserMapper() {
//            @Override
//            public List<User> findAll() throws IOException {
//                return null;
//            }
//
//            @Override
//            public User findById(int id) {
//                return null;
//            }
//        };
//        return userMapper.findById(id);
//    }
}
