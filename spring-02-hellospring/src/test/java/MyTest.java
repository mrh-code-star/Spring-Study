import com.mrh.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
//        获取spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        我们的对象现在都在spring中管理了，我们要使用，直接从里面取出来就可以！
        Hello hello = (Hello) applicationContext.getBean("hello");

        System.out.println(hello);
    }

}
