import com.mrh.dao.UserDaoMysqlImpl;
import com.mrh.dao.UserDaoOracleImpl;
import com.mrh.dao.UserDaoSqlserverImpl;
import com.mrh.service.UserService;
import com.mrh.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void getUser(){
//        用户实际调用的是业务层，dao层他们不需要接触！！！
        UserService userService=new UserServiceImpl();

        userService.setUserDao(new UserDaoSqlserverImpl());

        userService.getUser();
    }
    @Test
    public void getUser2(){
//        获取ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

//        需要什么，就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();

    }
}
