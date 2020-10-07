import com.mrh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    //    通过下标赋值————<constructor-arg index="0" value="马荣晖————下标赋值"/>
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("User1");
        System.out.println(user);
    }

    //    通过类型赋值————<constructor-arg type="java.lang.String" value="马荣晖————通过类型赋值————不建议使用"/>
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("User2");
        System.out.println(user);
    }

    //    直接通过参数名赋值————  <constructor-arg name="name" value="马荣晖————直接通过参数名赋值"/>
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("User3");
        user.show();
        System.out.println(user);
    }

}
