import com.mrh.pojo.Student;
import com.mrh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
//       Student{
//          name='马荣晖',
//          address=Address{address='null'},
//          book=[红楼梦, 西游记, 三国演义, 水浒传],
//          hobbys=[听歌, 敲代码, 玩游戏, 打篮球],
//          map={身份证=121211212212211, 银行卡=3333333222264469945},
//          wife='null',
//          game=[lol, coc, bob, wzry],
//          info={学号=2017006318, 性别=男, 姓名=小米}
//          }

    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");

        User user = context.getBean("user1", User.class);

        User user1 = context.getBean("user1", User.class);

        System.out.println(user.hashCode());

        System.out.println(user1.hashCode());

    }
}
