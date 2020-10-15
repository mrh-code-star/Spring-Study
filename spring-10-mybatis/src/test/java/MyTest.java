import com.mrh.mapper.UserMapper;
import com.mrh.pojo.User;
import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void selectUser() throws IOException {
        String resources ="mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectUser();

        for (User user : users) {

            System.out.println(user);
        }


    }
    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> users = userMapper.selectUser();

        for (User user : users) {

            System.out.println(user);
        }

    }
}
