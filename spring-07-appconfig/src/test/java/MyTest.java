import com.mrh.config.MrhConfig;
import com.mrh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void getUser(){
//        如果完全使用了配置类方式，我们只能通过AnnotationConfig上下文获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(MrhConfig.class);

        User getUser = (User) context.getBean("getUser");

        System.out.println(getUser.getName());
    }
}
